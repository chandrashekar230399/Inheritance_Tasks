
class A {
	void moneyDeposit() {
		System.out.println("money diposit 10,000");
	}
}

class B extends A {
	void display() {
		System.out.println("display balance");
	}
}

public class Test1 {
		
	public static void main(String[] args) {
		A a1 = new B();// upcasting
		B b1 = new B();
		
		a1.moneyDeposit();
		//a1.display();	  
		
		b1.moneyDeposit();
		b1.display();						 							
	}
    
}
