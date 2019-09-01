package duotai;

public class AirPlane extends TransportTool {
	public int people;
	public AirPlane() {
		// TODO Auto-generated constructor stub
		people = 100;
		
	}
	public void carry() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "AirPlane [people=" + people + "]";
	}
	public void aboard() {
		System.out.println("登机前需要托运行李");
	}
}
