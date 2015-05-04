package general;


import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

/*
class Solution {
  public static void main(String[] args) {
    
    String s = "123";
    int result = stringToInt(s); //result = 123
  }
  
  public static int stringToInt(String s){
    int i = 0;
    int number = 0;
    int len= 0;
    
    //i = Integer.parseInt(s);
    //char[] c = s.toCharArray();
    //int j = Character.numericvalue(c[i]);
    if(s != null && !s.isEmpty()){
      len = s.length();
      try {
      //for negative
       boolena flag = false;      
      if(str.charAt(0) == '-'){
        falg = true;
        i=1;
      }
      
      while(len > 0){
      number = number * 10;
      number = number + (str.charAt(i));
      i++;
      len--;
     }
      if(flag){
        number = -number;
      }
    }
    catch(Exception e){
      //print error stack trace
    }
    }
       
    return number;
  }

}

//Hello




*/
