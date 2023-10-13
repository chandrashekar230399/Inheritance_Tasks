
class chandu{
	public void inter() {
		System.out.println("i am in inter boys hostel");
	}
	public void inter(int i) {
		System.out.println(2016);
	}
}
class keerthi extends chandu{
	public void inter() {
		System.out.println("i am in inter girls dayscoller");
	}
	public void inter(double j) {
		System.out.println(2015);
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		//MethodOverloadingDemo ob = new MethodOverloadingDemo();
		
		chandu d = new keerthi();
		d.inter();
		d.inter(22);
		d.inter();
		d.inter(33);

	}
 
}
