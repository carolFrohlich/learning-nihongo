package com.example.learning_nihongo;

import java.util.HashMap;

public class Dict {
	
	public HashMap<String,String> getWords(int option){
		if(option == 0)
			return getKatakana();
		
		else
			return getVocabulario();
	}

	private HashMap<String, String> getVocabulario() {	
		HashMap<String, String> dict = new HashMap<String, String>();
		
		dict.put("férias/ feriadão", "やすみ");
		dict.put("levantar (antes da aula)", "きりっ");
		dict.put("abaixar (antes da aula)", "れい");
		dict.put("sentar (antes da aula)", "ちゃ<せい");
		
		return dict;
	}

	private HashMap<String, String> getKatakana() {
		HashMap<String, String> dict = new HashMap<String, String>();
		
		dict.put("a", "ア");
		dict.put("i", "イ");
		dict.put("u", "ウ");
		dict.put("e", "エ");
		dict.put("o", "オ");

		dict.put("ka", "カ");
		dict.put("ki", "キ");
		dict.put("ku", "ク");
		dict.put("ke", "ケ");
		dict.put("ko", "コ");
		
		dict.put("sa", "サ");
		dict.put("shi", "シ");
		dict.put("su", "ス");
		dict.put("se", "セ");
		dict.put("so", "ソ");
		
		dict.put("ta", "タ");
		dict.put("chi", "チ");
		dict.put("tsu", "ツ");
		dict.put("te", "テ");
		dict.put("to", "ト");
		
		dict.put("na", "ナ");
		dict.put("ni", "ニ");
		dict.put("nu", "ヌ");
		dict.put("ne", "ネ");
		dict.put("no", "ノ");
		
		dict.put("ha", "ハ");
		dict.put("hi", "ヒ");
		dict.put("fu", "フ");
		dict.put("he", "ヘ");
		dict.put("ho", "ホ");
		
		
		dict.put("ma", "マ");
		dict.put("mi", "ミ");
		dict.put("mu", "ム");
		dict.put("me", "メ");
		dict.put("mo", "モ");
		
		dict.put("ya", "ヤ");
		dict.put("yu", "ユ");
		dict.put("yo", "ヨ");
		
		dict.put("ra", "ラ");
		dict.put("ri", "リ");
		dict.put("ru", "ル");
		dict.put("re", "レ");
		dict.put("ro", "ロ");
		
		dict.put("wa", "ワ");
		dict.put("n", "ン");
		dict.put("o (particula)", "ヲ");
		
		return dict;
	}

}
