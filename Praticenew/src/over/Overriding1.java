package over;
class Animal2{
	public void move() {
		System.out.println("Animals can move");
	}
}
class Dog1 extends  Animal2
{
	public void move() {
		super.move();
	System.out.println("dog can move");//super prefernce value it value animal1 and after Dog1 
}
}
public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal2 a1=new Animal2();
		Animal2 b=new Dog1();
		b.move();
		
	}

}
/*
 * Animals can move
dog can move
*/
