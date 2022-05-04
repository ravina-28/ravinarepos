
public class PalindromeNum {
/*A Palindrome number is a number that remains the same number when it is reversed.
 *  For example, 131. When its digits are reversed, it remains the same number. 
 *  Palindrome number has reflection symmetry at the vertical axis. It refers to the word
 *  which has the same spelling when its letters are reversed.*/
	
	public static void main(String[] args) {
		int lastnum;
		int a,sum = 0;
		int inputNum=121;
		a=inputNum;
		
		while(a>0)
		{
			System.out.println("input number"+a);
			lastnum=a%10;
			System.out.println("last digit"+lastnum);
			System.out.println("digit"+lastnum+ "swe are sum"+(sum*10));
			sum=(sum*10)+lastnum;
			a=a/10;
			
	}

}
}
/*input number121
last digit1
digit1swe are sum0
input number12
last digit2
digit2swe are sum10
input number1
last digit1
digit1swe are sum120
*/

