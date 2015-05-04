package LinkedList;

public class StingToInteger {

	public static void main(String args[]){
		int a = StringToInteger("-123");
		System.out.println("Converted string =" + a);
	}
	
	public static int StringToInteger(String s){
	    int a = 0; 
	    int flag = 0;
	    int i = 0;
	    
	    if(s.charAt(0) == '-'){
			flag = -1;
			//s = s.substring(1);
			i++;
			System.out.println(s);
		}
	    
	    //char[] c = s.toCharArray();
	    
	   /* for(int i = 0; i < c.length; i++){
	    	//int foo = Integer.parseInt("");
	    	a = a * 10;
	    	a = Character.getNumericValue(c[i]) + a;
	    	
	    	//a = Integer.valueOf("" + c[i]);
	    }*/
	    
	    while(i < s.length()){
	    	//int foo = Integer.parseInt("");
	    	a = a * 10;
	    	System.out.println("s" + s.charAt(i));
	    	System.out.println( s.charAt(i)-'0');
	    	System.out.println( "a" + a);

	    	a += s.charAt(i) - '0';
	    	System.out.println( "a c " + a);

	    	i++;
	    	//a = Integer.valueOf("" + c[i]);
	    }
	    if(flag == -1){
	    	a = a * -1;
	    }
		return a;
	}
	
}
