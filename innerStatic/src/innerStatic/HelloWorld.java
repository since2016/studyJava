package innerStatic;

public class HelloWorld {

	private static int score = 84;
	private static int a = 100;
	public static class Inner {
		int score = 91;
		public void show() {
			System.out.println("访问外部 a "+a);
			System.out.println("访问内部 score "+ score);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner inner  = new Inner();
		inner.show();
	}

}
