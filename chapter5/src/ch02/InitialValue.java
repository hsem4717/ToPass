package ch02;

public class InitialValue {

	public static void main(String[] args) {
		// 스택메모리값은 강제 초기화가 안된다
		int value1 = 0;
		System.out.println(value1);
		int[] value2 = null;
		System.out.println(value2);
		
		//힙영역은 강제 초기화 된다.
		boolean[] array1 = new boolean[3];
		for(boolean k: array1)
		{
			System.out.println(k);
		}
		double[] array2 = new double[3];
		for(double k: array2)
		{
			System.out.println(k);
		}
		String[] array3 = new String[3];
		for(String k: array3)
		{
			System.out.println(k);
		}

	}

}
