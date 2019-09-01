package imooc;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelPhone t1 = new CellPhone();
		TelPhone t2 = new SmarttPhone();
		
		t1.call();
		t1.message();
		t2.call();
		t2.message();
		
		IPlayGame ip1 = new SmarttPhone();
		IPlayGame ip2 = new Psp();
		
		ip1.play();
		ip2.play();
		
		
		IPlayGame ip3 = new IPlayGame() {
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类实现接口");
			}
		};
		
		ip3.play();
		
		new IPlayGame() {
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类实现接口2");
			}
		}.play();
	}

}
