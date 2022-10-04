package ch02;

class A{
	void print() {
		System.out.println("안녕");
	}
	int data () {
		return 3;
	}
	double sum(int a, double b) {
		return a+b;
	}
	void printMonth(int m) {
		if(m<0 || m> 12) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(m+"월입니다.");
	}
}

public class MethodTest {

	public static void main(String[] args) {
		
		A a = new A();
		
		a.print();
		int k = a.data();
		System.out.println(k);
		double result = a.sum(3, 5.2);
		System.out.println(result);
		a.printMonth(5);
		a.printMonth(15); //매서드 오버라이딩 매개변수의 특징만 다르게 해 동명의 매서드를 여러개 생성 하는것 리턴타입은 시그니처(매배변수의 특징)으로 포함 x

	}

}
