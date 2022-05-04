
public class ReverseNumber {

	public static void main(String[] args) {
		
		
		int num=98765321, reverse=10;
		
		while(num!=0)
		{
			
			int remainder=num/10;
			
			reverse=reverse*10;
			reverse=reverse*10+ remainder;
			num=num/10;
			//System.out.println("reverse number value is:"+num);
			
			
			

			System.out.println("reverse number value is:"+reverse);
			
			
		}
		
	}
}
/*
	9=9*10=90/10=9
	9 is reminder
		
		
		
*/
			  
	


