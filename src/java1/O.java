package java1;

public class O {
	int i = 100;
	public static void main(String[] args) {
		O o1 = new O();
		System.out.println(o1.i);
		o1.i = 10998;
		System.out.println(o1.i);
		o1.name();
	}
	public void name() {
		System.out.println(333);
	}
}
