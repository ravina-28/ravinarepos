package inheall;
class Fruit{
	int fruitAge=34;
	Fruit(){
		System.out.println(" i am fruit cons");
		System.out.println(" i am fruit cons fruitAge ;");
	}
	public void taste() {
		System.out.println("test sweet");//super cons value
	}
	
	}
	
	

class Orange extends Fruit{
	int fruitAge;
	Orange(){
		System.out.println("orange class Cons..");
		fruitAge=4;
	}
		
	public void taste() {
		System.out.println("orange sweet ..");
	}

public void shape(){
	System.out.println("shape is round");
	System.out.println("orange fruitage:"+fruitAge);//4 shape will not paas any value default
	System.out.println("fruit  fruitage:"+super.fruitAge);//34 it will take int value of first class super class 
	taste();
	super.taste();

}}
public class Inheritance8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange  o1=new Orange();
		o1.shape();
		
	}

}
/* 
 * i am fruit cons
 i am fruit cons fruitAge ;
orange class Cons..
shape is round
orange fruitage:4
fruit  fruitage:34
orange sweet ..
test sweet
*/
