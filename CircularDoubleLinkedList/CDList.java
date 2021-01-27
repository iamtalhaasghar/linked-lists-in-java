import java.util.Random;

public class CDList{

	DNode start;
	
	CDList(){}
	CDList(int nodes){
		Random r = new Random();
		for(int i=0; i<nodes; i++){
			insertAtStart(r.nextInt(100));
		}
	
	}

	public void display(){
	
		System.out.print("Linked List: ");
		if(start == null){
			System.out.println("<Empty List>");
			return;
		}
	
		DNode temp = start;
		do{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}while(temp != start);
		
		System.out.println();
	}

	public void displayReversed(){
		
		System.out.print("Linked List - Reversed: ");

		if(start == null){
			System.out.println("<Empty List>");
			return;
		}
	
		DNode temp = start.prev;
		
		do{
			System.out.print(temp.data + " ");
			temp = temp.prev;			
		}while(temp != start.prev);

		System.out.println();
		
	}

	public void insertAtStart(int data){

		if(start == null){
			start = new DNode(data);
			start.next = start;
			start.prev = start;
			return;
		}

		DNode newNode = new DNode(data);
		newNode.next = start;
		newNode.prev = start.prev;
		start.prev.next = newNode;
		start.prev = newNode;
		start = newNode;

	}
	
	public void insertAtStart(DNode n){
		
		if(start == null){
			start = n;
			start.next = start.prev = start;
			return;	
		}

		n.next = start;
		n.prev = start.prev;	
		start.prev.next = n;
		start.prev = n;
		start = n;

	}

	public void insertAtLast(int data){

		if(start == null){
			start = new DNode(data);
			start.prev = start;
			start.next = start;
			return;
		}

		DNode newNode = new DNode(data);
		newNode.prev = start.prev;
		newNode.next = start;
		start.prev.next = newNode;
		start.prev = newNode;

	}

	public void insertAtLast(DNode n){
		
		if(start == null){
			start = n;
			start.prev = start.next = n;
			return;
		}

		n.prev = start.prev;
		n.next = start;
		start.prev.next = n;
		start.prev = n;
	
	}
	

	public void deleteFromStart(){

		if(start == null){
			return;
		}		
		else if(start.next==start && start.prev == start){
			start = null;
			return;
		}
		
		start.prev.next = start.next;
		start.next.prev = start.prev;
		start = start.next;
	

	}

	public void deleteFromLast(){
		
		if(start == null){
			return;
		}
		else if(start.next == start && start.prev == start){
			start = null;
			return;
		}

		start.prev.prev.next = start;
		start.prev = start.prev.prev;
	
	}

	public void reverse(){

		DNode r = start.next;
		DNode s = start;
		r.prev = start.prev;
		start.prev = start.next = start;
		
		while(r != s){
			DNode t = r.next;
			insertAtStart(r);
			r = t;	
		}

	}

	public DNode removeFirst(){

		if(start == null){
			return null;
		}		
		else if(start.next == start && start.prev == start){
			start.next = start.prev = null;
			DNode temp = start;
			start = null;
			return temp;			
		}

		start.prev.next = start.next;
		start.next.prev = start.prev;
		DNode temp = start;
		start = start.next;
		temp.next = temp.prev = null;
		return temp;

	}


}