import java.util.Scanner;

class Student{
	int sno;
	String sname;
	
	public void read(int sno,String sname)
	{
	System.out.println("Student No : "+ sno);
	System.out.println("Student Name : "+sname);
	}
}
class Test extends Student {
	
	public void show(int sub1,int sub2,int sub3) {
		
		System.out.println("Sub1 Marks : "+sub1);
		System.out.println("Sub2 Marks : "+sub2);
		System.out.println("Sub3 Marks : "+sub3);
	}
}
class Result extends Test 
{
	
	int total,avg;
	
	public void cal(int sno,String sname) 
	{
		super.read(sno,sname);
	}
	
	public void view(int sub1,int sub2,int sub3) 
	{
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
public class Student_Details {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Number : ");
		int sno=sc.nextInt();
		System.out.println("Enter Student Name : ");
		String sname=sc.next();
		System.out.println("Enter Sub1 Marks :");
		int sub1=sc.nextInt();
		System.out.println("Enter Sub2 Marks : ");
		int sub2=sc.nextInt();
		System.out.println("Enter Sub3 Marks :");
		int sub3=sc.nextInt();
		
	Result r=new Result();
	
	r.cal(sno,sname);
	r.view(sub1,sub2,sub3);
	
}
	}


