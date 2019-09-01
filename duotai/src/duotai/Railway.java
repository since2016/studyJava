package duotai;

public class Railway extends TransportTool {
	public int people;
	public Railway() {
		// TODO Auto-generated constructor stub
		people = 1000;
	}
	public void carry() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "Railway [people=" + people + "]";
	}
	public void beforeDrive() {
		System.out.println("定期维护铁轨");
	}
}
