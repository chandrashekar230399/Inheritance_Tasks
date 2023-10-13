
class emp{
	int eid;
	String ename;
	double esal;
	
	public emp(int eid,String ename,double esal){
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		
	}
	
	void details() {
		System.out.println("employee id:"+eid);
		System.out.println("employee name:"+ename);
		System.out.println("employee salary:"+esal);
	}
}

public class Employee {

	public static void main(String[] args) {
	emp a1 = new emp(23,"Chandu",230000);
	a1.details();
	}
	
}
