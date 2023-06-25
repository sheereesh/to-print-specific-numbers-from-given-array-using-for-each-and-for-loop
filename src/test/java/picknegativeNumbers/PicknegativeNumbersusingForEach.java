package picknegativeNumbers;

public class PicknegativeNumbersusingForEach {

	public static void main(String[] args) {
		 int [] array= {10,20,-5,-6,-20,0,-3};
   System.out.println(array.length);
	 int a =array.length;
	 System.out.println(a);
	 System.out.println(array);
	  
for(int numbers: array) {
	if(numbers<0) {
		System.out.println(numbers);
	}
}
	}

}
