
package LinkedList;

public class Link {

		public int nodedata; //name, address
		public Link next; //self-referential
	
		public Link(int nodedata){
			this.nodedata = nodedata;
		}
		
		public void display(){
			System.out.println("{NodeData:" + nodedata +"}" );
		}
}
