package Shape;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Rectangle();
		System.out.println("长方形面积："+s1.getArea());
		System.out.println("长方形周长："+s1.getCircum());
		
		Shape s2 = new Circle();
		System.out.println("圆周长："+s2.getCircum());
		System.out.println("圆面积："+s2.getArea());
	}

}
