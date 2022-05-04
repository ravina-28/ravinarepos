package over;
class Abc{
	public void Method() 
	{
		System.out.println("Abc method of Class Overriding4");
			
}

class Overriding41 extends Abc{
	// This will call the myMethod() of parent class
	public void Method() {
		super.Method();
		System.out.println("Overriding method of Class Overriding4");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding41 obj=new Overriding41() ;
	obj.Method();
	}

}
