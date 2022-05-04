package inheall;
class Campany202{
	void display() {
		System.out.println("I am company class display()...");
	}
	class Employee202 extends Company202 {
		void display() {
			System.out.println("I am Employee class display()...");
			super.display();
		}
		void callme() {
			System.out.println("I am Employee class callme()...");
		}
	}
}
class Inheritance91 {
	public static void main(String[] args) {
	Employee202 ep1=new Employee202();
	ep1.display();
	ep1.callme();
	Company202 c1=new Company202();{
		c1.display();
		Employee202 ep2=new Employee202();
		ep2.display();
	}
	
}}
/*o/p
I am Employee class display()...
I am company class display()...
I am Employee class callme()...
I am company class display()...
I am Employee class display()...
I am company class display()...
*/