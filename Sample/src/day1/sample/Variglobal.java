package day1.sample;

public class Variglobal {
	static  int g=20;//global static variable
	int v=1234;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int g=40;//oly print according variable last value
		int g1=1233;
		g=12;
		System.out.println("only print last value: " +g1);
		System.out.println("only print last value: " +g);
		
	}

}
