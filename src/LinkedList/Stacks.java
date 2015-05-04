package LinkedList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Stacks{
	int stackCapacity = 3;
	
	int[] array = new int[stackCapacity];
	
	int top=-1;
	
	public void push(int value){
		if(top < stackCapacity - 1){
			top++;
			array[top] = value;
			System.out.println("Item " + value + " pushed in the stack at " + top );	
		
		}
		else{
			System.out.println("Stack Overflow!");
		}
	}	 
	
	public int pop(){
		if(top != -1){
			System.out.println("Item " + array[top]  + " popped out of stack from location " + top );
			return array[top--];
		}
		else
		{
			System.out.println("Stack Underflow!!!");
			return 0;
		}
		
	}
	
	public int peek(){
		if(top >=0){
			System.out.println("Displaying item at the top of stack: " + array[top] + "at location " + top);
			return array[top];
		}
		else{
			System.out.println("Stack Empty!!");
			return 0;
		}
		
	}
	
	public static void main(String[] args){
		System.out.println("Stack Demo using arrays");
		
		Stacks stackdemo = new Stacks();
		
		
		stackdemo.push(1);
		stackdemo.push(2);
		stackdemo.push(3);
		stackdemo.push(4);
		stackdemo.peek();
		stackdemo.pop();
		stackdemo.peek();
	}
}
