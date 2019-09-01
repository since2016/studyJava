package duotai;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransportTool tt1 = new Car();
		TransportTool tt2 = new AirPlane();
		TransportTool tt3 = new Railway();
		
		tt1.carry();
		tt2.carry();
		tt3.carry();
		
		// tt1.drive(); // 错误的，不可以访问car自定义的方法
		Car car = new Car();
		car.drive();
		
		TransportTool tt4 = car;
		if (tt4 instanceof Car) {
			Car car1 = (Car)tt4;
		}else {
			System.out.println("不能进行强制类型转化");
		}
		
	}

}
