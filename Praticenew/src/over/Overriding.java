package over;
class Animal{
	void move() {
		
		System.out.println("animal can move ");
	}
}
class Dog extends Animal{
void move() {
		
		System.out.println("Dogs can walk and run ");
	}
void Bark() {
	System.out.println("Dogs can bark");
}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal an1=new Animal();
an1.move();
Dog d1=new Dog();
d1.move();
d1.Bark();
Animal a1=new Dog();// you will get dog class move(), bark()
a1.move();
//a1.bark(); // a1 compile time error since b's reference type Animal doesn't

	}

}
/*
 * o/p
 * 
 * animal can move 
 
Dogs can walk and run 
Dogs can bark
Dogs can walk and run */