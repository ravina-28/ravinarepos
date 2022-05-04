package over;
class Human{
	public void eat() {
		System.out.println("Human is eating");
	}
}
class Boy extends Human{
public void eat() {
	System.out.println("Boy is eating");
	}
}
public class Overriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Human h1=new Boy();
h1.eat();
	}

}
/*
 * Boy is eating */
 

