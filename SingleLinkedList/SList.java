// list class for single linked list

import java.util.Random;

public class SList{

	

	private SNode start;

	SList(){}

	SList(int nodes){

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
		
		SNode temp = start;

		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}

		System.out.println();	
	}


	public void insertAtStart(int data){
		
		if(start == null){
		
			start = new SNode(data);
			return;
		}

		SNode newNode = new SNode(data);
		newNode.next = start;
		start = newNode;

	}


	public void insertAtStart(SNode s){
		
		if(start == null){
			start = s;			
			return;
		}
		
		s.next = start;
		start = s;

	}

	public void insertAtLast(int data){

		if(start == null){
			start = new SNode(data);
			return;
		}
	
		SNode temp = start;

		while(temp.next != null){
			temp = temp.next;
		}

		temp.next = new SNode(data);
		

	}

	public void insertAtLast(SNode n){

		if(start == null){
			start = n;
			return;
		}
		
		SNode temp = start;

		while(temp.next != null){
			temp = temp.next;
		}

		temp.next = n;
		n.next = null;

	}


	public void deleteFromStart(){

		if(start == null){
			return;
		}

		start = start.next;

	}

	public void deleteFromLast(){
		
		if(start == null){
			return;
		}
		else if(start.next == null){
			start = null;	
			return;
		}


		SNode temp = start;
			
		while(temp.next.next != null){
			temp = temp.next;
		}

		temp.next = null;
		
	}
	
	public void reverse(){
		
		if(start == null){
			return;
		}

		SNode r = start.next;
		start.next = null;
		while(r != null){
			SNode t = r.next;
			insertAtStart(r);
			r = t;
			
		}

	}


}