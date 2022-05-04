                 
public class PalindromeNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,sum=0, temp;
int n=454;
temp=n;//It is the number variable to be checked for palindrome  

while(n>0) {
	a=n%10;
	sum=(sum*10)+a;
	n=n/10;
	
	}
{   

if(temp==sum) 
	System.out.println("palindrome number");
	else
		System.out.println("not palindrome number");

		
}

	}
}

 /* palindrome number */  
