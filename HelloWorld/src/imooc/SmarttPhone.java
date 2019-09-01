package imooc;

public class SmarttPhone extends TelPhone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("smartphone 可以打电话");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("smartphone 可以发信息");
	}
	
	public void play() {
		System.out.println("smartphone 可以玩游戏");
	}

}
