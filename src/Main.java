
class Teacher{
	public Teacher(int teacher_id,String teacher_name,float teacher_sal) {
		System.out.println("hello students");
	}
}
class Studen extends Teacher{

	public Studen(int teacher_id, String teacher_name, float teacher_sal) {
		super(teacher_id, teacher_name, teacher_sal);
		System.out.println(teacher_id);
	System.out.println(teacher_name);
		System.out.println(teacher_sal);
	}
	
}
class Main{
	public static void main(String[] args) {
		Studen name = new Studen(23,"sai",10000);
	}
}
