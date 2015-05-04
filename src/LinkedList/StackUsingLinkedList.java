package LinkedList;
import LinkedList.StackNode;

public class StackUsingLinkedList {
	StackNode top;
	
	
	public void push(int value){
		StackNode newnode = new StackNode();
		newnode.data = value;
		top = newnode.next; 
	}
	
	public int pop(){
		if(top != null){
			System.out.println("Item deleted: "+ top.data);
		}
		
		return 0;
	}
}
