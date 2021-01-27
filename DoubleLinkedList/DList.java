import java.util.Random;

public class DList{

	DNode start;

	DList(){}

	DList(int nodes){
		Random r = new Random();

		for(int i=0; i<nodes; i++){
			insertAtLast(r.nextInt(100));
		
		}		

	}
	

	public void display(){
	
		System.out.print("Linked List: ");

		if(start == null){
			System.out.println("<Empty List>");
			return;
		}

		DNode temp = start;

		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}

		System.out.println();
	}

	public void displayReversed(){

		System.out.print("Linked List - Reversed: ");
	
		if(start == null){
			System.out.println("<Empty List>");
			return;
		}	
		
		DNode temp = start;
		while(temp.next !=  null){
			temp = temp.next;
		}

		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.prev;
		}
		System.out.println();
	}


	public void insertAtStart(int data){

		if(start == null){
			start = new DNode(data);
			return;
		}

		DNode newNode = new DNode(data);
		newNode.next = start;
		start.prev = newNode;
		start = newNode;
		

	}	

	public void insertAtStart(DNode n){
		if(start == null){
			start = n;
			return;
		}
		
		n.next = start;
		start.prev = n;
		start = n;
		start.prev = null;
	}


	public void insertAtLast(int data){
	
		if(start == null){
			start = new DNode(data);
			return;
		}


		DNode temp = start;

		while(temp.next != null){
			temp = temp.next;
		}
		
		DNode newNode = new DNode(data);
		temp.next = newNode;
		newNode.prev = temp;
		

	}

	public void insertAtLast(DNode n){
		if(start == null){
			start = n;
			return;
		}
	
		DNode temp = start;

		while(temp.next != null){
			temp = temp.next;
		}

		temp.next = n;
		n.prev = temp;
		n.next = null;

	}


	public void deleteFromStart(){
		
		if(start == null){
			return;
		}

		start = start.next;
		start.prev = null;

	}

	public void deleteFromLast(){

		if(start == null){
			return;
		}
		else if(start.next == null){
			start = start.next;
			start.prev = null;
			return;
		}
				
		DNode temp = start;
		DNode prev = temp;		
		while(temp.next != null){
			prev = temp;
			temp = temp.next;							
		}
		
		prev.next = null;
		temp.prev = null;

	}


	public void reverse(){

		if(start == null){
			return;
		}

		DNode r = start.next;
		start.next = null;

		while(r != null){
			DNode t = r.next;
			insertAtStart(r);
			r = t;
		}


	}

}