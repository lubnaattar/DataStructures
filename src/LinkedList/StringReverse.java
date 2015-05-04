package LinkedList;

public class StringReverse {
	 
	  public static String recursion(String str){
	  
	  
	  if(str.length() < 2 ){ return str; }
	  
	  return recursion(str.substring(1)) + str.charAt(0); 
	  
	  } 
	  
	  public static void main(String args[]){
	  
	  String str="lubna";
	  
	  String reversed = recursion(str);
	  
	  System.out.println("reversed string = " + reversed); }
	 

}
