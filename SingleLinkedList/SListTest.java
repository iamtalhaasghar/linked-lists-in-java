public class SListTest{
	
	public static void main(String args[]){

		SList myList = new SList(5);
		myList.display();
		myList.reverse();
		myList.display();
		myList.deleteFromStart();
		myList.display();
		myList.insertAtLast(78);
		myList.display();
		myList.deleteFromLast();
		myList.display();
		myList.insertAtStart(54);
		myList.display();
	}

}