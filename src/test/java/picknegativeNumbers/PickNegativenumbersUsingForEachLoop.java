package picknegativeNumbers;

public class PickNegativenumbersUsingForEachLoop {

	public static void main(String[] args) {
		  
		int array[]= {10,20,45,-9,-5,55,9};
	for(int i=0;i<array.length;i++) {
		
		if(array[i]<0) {
			System.out.println(array[i]);
		}
	}
		
		
	}

}
