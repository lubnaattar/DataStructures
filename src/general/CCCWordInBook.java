package general;

import java.util.Hashtable;

public class CCCWordInBook {
	
	public Hashtable<String, Integer> setUpDictionary(String[] book){
		Hashtable<String, Integer> table = new Hashtable<String,Integer>();
		for(String word: book){
			word = word.toLowerCase();
			if(word.trim() != ""){
				if(!table.containsKey(word)){
					table.put(word, 0);
				}
				table.put(word, table.get(word) + 1);
			}
		}
		return table;
	}
  
	public int getFrequency(Hashtable<String, Integer> table, String word){
		if(table == null || word == null) return -1;
		word = word.toLowerCase();
		if(table.containsKey(word)){
			return table.get(word);
		}
		return 0;
	}
}


