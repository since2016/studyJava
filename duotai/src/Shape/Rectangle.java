package Shape;

public class Rectangle extends Shape {
	public float length, width, circum, area;
	public Rectangle() {
		// TODO Auto-generated constructor stub
		length = 10;
		width = 5;
		System.out.println("default length :"+length+" width"+width);
	}
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public float getCircum() {
		// TODO Auto-generated method stub
		circum = 2*(this.length + this.width);
		return circum;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		area = this.length * this.width;
		return area;
	}

}
