package com.example.learning_nihongo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Words extends Activity {
	private int option;
	private HashMap<String, String> dict;
	Dict dictionary = new Dict();
		
	int wordCount = 0;
	boolean emNihongo = true;
	Button word;
	TextView counter;
	ArrayList<String> shuffle = new ArrayList<String>();
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_words);
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
		    option = extras.getInt("option");
		}
		
		dict = dictionary.getWords(option);
		
		
		
		shuffle = new ArrayList<String>(dict.keySet());
		Collections.shuffle(shuffle);
		
		word = (Button) findViewById(R.id.word);
		word.setText("Start!");
		
		counter =(TextView) findViewById(R.id.counter);
		counter.setText("0/" + dict.size());
		
		word.setOnClickListener( new View.OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	
		    	String portugese = shuffle.get(wordCount);
		    	String nihongo = dict.get(portugese);
		    	
		    	if(emNihongo){
		    		word.setText(nihongo);
		    		counter.setText(wordCount + 1 + "/" + dict.size());
		    		word.setTextSize(60);
		    	}
		    	else{
		    		word.setText(portugese);
		    		wordCount++;
		    		word.setTextSize(40);
		    	}
		    	emNihongo = !emNihongo;
		    	if(wordCount >= dict.size()){
		    		wordCount = 0;
		    		Collections.shuffle(shuffle);
		    	}
		    	
		        
		    }
		});
		
		
		
		
		
		
		
		
		
		
	}


}
