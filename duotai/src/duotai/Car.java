package duotai;

public class Car extends TransportTool {
	public int people;
	public Car() {
		// TODO Auto-generated constructor stub
		people = 10;
	}
	public void carry() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "Car [people=" + people + "]";
	}
	public void drive() {
		System.out.println("私家车可以开出去");
	}
	
}
