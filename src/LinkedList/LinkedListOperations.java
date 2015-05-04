package LinkedList;

public class LinkedListOperations {

	public Link firstLink;
	
	public void insertNewNode(int data){
		
		Link newNode = new Link(data);
		newNode.next = firstLink;
		firstLink = newNode;
	}
	
	
	public Link delete(){
		Link temp = firstLink;
		firstLink = temp.next;
		System.out.println("Link deleted" + temp);
		return temp;
	}
	
	
	
}
