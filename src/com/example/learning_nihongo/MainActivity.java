package com.example.learning_nihongo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		

		Button katakana = (Button)findViewById(R.id.katakana_button);
		katakana.setOnClickListener(new View.OnClickListener() {
		    @Override
		    public void onClick(View view) {
		    	Intent intent = new Intent(MainActivity.this, Words.class);
		    	intent.putExtra("option", 0);
		        startActivity(intent);
		        startActivity(intent);
		    }
		});

		Button vocabulario = (Button)findViewById(R.id.vocabularioButton);
		vocabulario.setOnClickListener(new View.OnClickListener() {
		    @Override
		    public void onClick(View view) {
		    	Intent intent = new Intent(MainActivity.this, Words.class);
		    	intent.putExtra("option", 1);
		        startActivity(intent);
		    }
		});
		
	}


}
