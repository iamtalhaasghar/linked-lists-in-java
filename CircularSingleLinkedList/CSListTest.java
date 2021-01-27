public class CSListTest{

	public static void main(String []args){
		
		CSList myList = new CSList(10);
		myList.insertAtLast(12);
		myList.insertAtStart(10);
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