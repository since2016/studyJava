package classinfunction;

public class HelloWorld {
	private String nameString = "爱慕课";
	
	public void show() {
		class MInner{
			int score = 85;
			public int getScore() {
				return score + 10;
			}
		}
		MInner mInner = new MInner();
		int score = mInner.getScore();
		System.out.println("姓名 ： "+nameString+"  加分后成绩： "+score);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.show();
	}

}
