package LinkedList;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {

	public static void main(String[] args) {

		Set<Character> vowels = new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		System.out.println(vowels + "");
		String str = "LUbna";

		StringBuilder strBuilder = new StringBuilder();
		//strBuilder.append("test");

		//System.out.println(strBuilder);

		char[] charr = str.toCharArray();
		for(int i=0; i< charr.length; i++){
			
			if(!vowels.contains(Character.toLowerCase(charr[i]))){
				strBuilder.append(charr[i]);
			}
		}
		
		System.out.println(strBuilder);

	}
}
