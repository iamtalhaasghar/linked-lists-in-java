import java.util.Random;

public class CSList{

	SNode start;

	CSList(){}
	CSList(int nodes){
		
		Random r = new Random();
		for(int i=0; i<nodes; i++)
			insertAtLast(r.nextInt(100));
	}

	public void display(){

		System.out.print("Linked List: ");		

		if(start == null){
			System.out.println("<Empty List>");
			return;
		}

		SNode temp = start;
		
		do{
			
			System.out.print(temp.data + " ");
			temp = temp.next;

		}while(temp != start);
		
		System.out.println();

	}

	public void insertAtStart(int data){

		if(start == null){
			start = new SNode(data);
			start.next = start;
			return;
		}

		SNode newNode = new SNode(data);
		newNode.next = start;

		SNode temp = start;
		while(temp.next != start){
			temp = temp.next;		
		}

		start = newNode;		
		temp.next = start;


	}

	public void insertAtStart(SNode n){

		if(start == null){
			start = n;
			start.next = start;
			return;
		}

		n.next = start;
		SNode temp = start;
		while(temp.next != start){
			temp = temp.next;
		}
		start = n;
		temp.next = start;
	}

	public void insertAtLast(int data){

		if(start == null){
			start = new SNode(data);
			start.next = start;
			return;
		}
		
		SNode temp = start;
		
		while(temp.next != start){
			temp = temp.next;
		}

		SNode newNode = new SNode(data);
		temp.next = newNode;
		newNode.next = start;

	}
	

	public void insertAtLast(SNode n){
		if(start == null){
			start = n;
			start.next = start;
			return;
		}


		SNode temp = start;
		while(temp.next != start){
			temp = temp.next;
		}

		temp.next = n;
		n.next = start;	

	}


	public void deleteFromStart(){
		
		if(start == null){
			return;
		}
		else if(start.next == start){
			start = null;
			return;
		}		


		SNode temp = start;
		
		while(temp.next != start){
			temp = temp.next;
		}

		start = start.next;				
		temp.next = start;


	}

	public void deleteFromLast(){
		
		if(start == null){
			return;
		}
		else if(start.next == start){
			start = null;
			return;
		}
		
		SNode temp = start;
		while(temp.next.next != start){
			temp = temp.next;
		}

		temp.next = start;		

	}


	public void reverse(){

		if(start == null){
			return;
		}
		
		SNode s = start;
		SNode r = start.next;
		start.next = start;		
		while(r != s){
			SNode t = r.next;
			insertAtStart(r);
			r = t;
		}

		s.next = start;
		
	}
}