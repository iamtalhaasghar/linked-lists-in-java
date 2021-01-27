public class DListTest{

	public static void main(String args[]){

		DList myList = new DList(7);
		myList.display();
		myList.displayReversed();
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