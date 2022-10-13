package ch01;

public class valueAssignment {

	public static void main(String[] args) {
		
		//배열에 값 대입 방법 1
		int[] array1;
		array1 = new int[3];
		array1[0]=3;
		array1[1]=4;
		array1[2]=5;
		System.out.println(array1[0]+" "+array1[1]+" "+array1[2]);
		
		//배열에 값 대입 방법 2
		int[] array2 = new int[] {3, 4, 5};
		System.out.println(array2[0]+" "+array2[1]+" "+array2[2]);
		
		//배열의 값 대입 방법 3
		int[] array3 = {3, 4, 5};
		System.out.println(array3[0]+" "+array3[1]+" "+array3[2]);
		

	}

}
