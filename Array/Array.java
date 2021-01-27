df
import java.util.Random;

/**
* This class is designed to enable effecient use of built-in arrays with maximum ease and comfort.
* @author Talha Asghar
* @version 1.0
*/

public class Array{

	private int arr[];

	public Array(){}

	public Array(int s){
	
		Random r = new Random();
		arr = new int[s];
		for(int i=0; i<s; i++){
			arr[i] = r.nextInt(100);
		}

	}


	/**
	*Sorts Array using the algorithm of "Insertion Sort".
	*/

	public void insertionSort(){

		for(int i=1; i<arr.length; i++){
			int j = i-1;
			int temp = arr[i];
			while(j>=0 && arr[j]>temp){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}

	}

	/**
	*Sorts Array using the algorithm of "Selection Sort".
	*/


	public void selectionSort(){

		for(int i=arr.length-1; i>=0; i--){
			int index = i;
			for(int j=i-1; j>=0; j--){
				if(arr[j]>arr[index]){
					index = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}

	}

	/**
	*Sorts Array using the algorithm of "Bubble Sort".
	*/

	public void bubbleSort(){

		for(int i=arr.length-1; i>=0; i--){
			for(int j=0; j<i; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				

			}
		}

	}

	/**
	*Displays all the elements currently present in Array.
	*/


	public void display(){
		
		System.out.print("Array: ");

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


	/**
	*Displays all the elements currently present in Array in reverse.	
	*However this function does not actually reverses the Array.
	*Elements of Array remain unchanged after the function returns.
	*/

	public void displayReversed(){

		System.out.print("Array[R]: ");
		for(int i=arr.length-1; i>=0; i--){
			System.out.print(arr[i]+" ");

		}
		System.out.println();
	}

	/**
	*Reverses the elements of Array.
	*The process can take long time if Array is too big.
	*/

	public void reverse(){

		int temp[] = new temp[arr.length];
		int j=0;
		for(int k=arr.length-1; k>=0; k--){
			temp[j++] = arr[k];
		}

		arr = temp;

	}

}