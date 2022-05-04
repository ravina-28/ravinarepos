package over;
class Parent {
	void Show() {
		System.out.println("Parent's show()");
	}
class Childde extends Parent{
	// This method overrides show() of Parent
		
}
	void Show() {
		System.out.println("child's show()");
	}
}
public class Overriding5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p1=new Parent();
p1.Show();
//If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME
		// POLYMORPHISM.
Parent p2=new Childde();
p2.Show();


	}

}
