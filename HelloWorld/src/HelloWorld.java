
public class HelloWorld {
	
	static int score1 = 85;
	static int score2 = 43;
	String titleString = "runoob";
	public static int sum() {
		return score1 + score2;
	}
	public void show() {
		System.out.println("nonstatic function");
		System.out.println("title"+titleString+" "+sum());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int allScore = HelloWorld.sum();
		System.out.println("总分： "+ allScore);
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.show();
	}

}
