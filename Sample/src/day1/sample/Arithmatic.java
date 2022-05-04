package day1.sample;

import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int a=12;
		int b=4;
		System.out.println("enter two number ");
		int sum;
		int division;
		division=a/b;
		sum=a+b;
		
		System.out.println(a+"  "+b );
	
		*/
		
		Scanner p=new Scanner(System.in);
		System.out.println("Enter first number:");
		
		int num1=p.nextInt();
		System.out.println("Enter second number:");
		int num2=p.nextInt();
		  
		int sum=num1+num2;
		int div=num1/num2;
		int mul=num1*num2;
		int sub=num1-num2;
		int mod=num1%num2;
		System.out.println("sum:  "+sum);
		System.out.println("div:   "+div);
		System.out.println("mul:  "+mul);
		System.out.println("sub:  "+sub);
		System.out.println("mod:   "+mod);
		
		
		
	
		
		
	}

}
