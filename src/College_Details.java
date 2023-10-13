import java.util.Scanner;

class CollegeStudent{
	int cno;
	String cname;
	public CollegeStudent() {
		
	}
	public void read(int cno,String cname) {
		System.out.println("College no:"+cno);
		System.out.println("Student name:"+cname);
	}
}
class task extends CollegeStudent{
	public task() {
		
	}
	public void show(int sub1,int sub2,int sub3) {
		System.out.println("Student marks:"+sub1);
		System.out.println("Student marks:"+sub2);
		System.out.println("Student marks:"+sub3);
	}
	
}
class output extends task{
	int total,avg;
	public void view(int cno,String cname) {
	super.read(cno, cname);
	}
    public void cal(int sub1,int sub2,int sub3) {
		super.show(sub1,sub2,sub3);
		
		total=sub1+sub2+sub3;
		System.out.println("All Subject Marks : "+total);
		
		if(sub1<35 || sub2<35 || sub3<35) {
			System.out.println("fail");
		}
		else {
			System.out.println("hurray..!i am passed");
			
			avg=total/3;
			System.out.println("Avg Marks : "+avg);
		
		
		 if( avg>75) {
			System.out.println("Grade A ");
		}
		
		else if(avg<=75 && avg>65) {
			System.out.println("Grade B ");
		}
		else if(avg<=65 && avg>55) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("FAIL");
		}
		}
	}
}
public class College_Details {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter college details here");
		System.out.println("student no");
		int cno = sc.nextInt();
		System.out.println("student name");
		String cname = sc.next();
		System.out.println("student marks1");
		int sub1 = sc.nextInt();
		System.out.println("student marks2");
		int sub2 = sc.nextInt();
		System.out.println("student marks3");
		int sub3 = sc.nextInt();
		
		output o = new output();
		o.view(cno, cname);
		o.cal(sub1, sub2, sub3);
	}

}
