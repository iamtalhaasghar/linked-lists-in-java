import java.util.Random;

class ArrayTest{

	public static void main(String []args){
		
		Array a = new Array(10);
		a.display();
		a.insertionSort();
		a.display();


		a = new Array(10);
		a.display();
		a.selectionSort();
		a.display();

		a = new Array(10);
		a.display();
		a.selectionSort();
		a.display();

	}

}