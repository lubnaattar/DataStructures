package general;
import java.util.Hashtable;

public class test{
	public static void main(String args[]){
		
		/* To print the frequency of words in dictionary*/
		String[] book = {"123","3456","lubna","attar","lubna", "lubna"};
		CCCWordInBook obj = new CCCWordInBook();
		Hashtable<String,Integer> table = obj.setUpDictionary(book);
		int result = obj.getFrequency(table, "lubna");
		System.out.println("Display count of word in the book: " + result);
		
		PairsInSum sumObj = new PairsInSum();
		int[] dataArray = {1,2,3,4,5,6,7,8,9};
		sumObj.printPairsSums(dataArray, 5);
		
		sumObj.sumInPairsUsingHashmap(dataArray, 5);
		
	}
}