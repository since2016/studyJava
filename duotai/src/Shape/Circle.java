package Shape;

public class Circle extends Shape {
	public float radius;
	public Circle() {
		// TODO Auto-generated constructor stub
		radius = 10;
		System.out.println("default radius is "+ radius);
	}
	
	public Circle(float r) {
		radius = r;
		System.out.println("radius is "+radius);
	}
	
	@Override
	public float getCircum() {
		// TODO Auto-generated method stub
		
		return (float) ((float)2*Math.PI*radius);
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return (float) ((float)Math.PI*radius*radius);
	}

}
