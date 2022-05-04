
public class ThisStaement001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisStatement001()
		{
			this('c',25.36);
			System.out.println("******Zero-Param*********");
		}
		ThisStatement001(int age)
		{
			System.out.println("******int-Param*********");
		}
		ThisStatement001(char c, double d)
		{
			this(25);
			System.out.println("******char-double-param*********");
		}
		public static void main(String[] args) {
			
			ThisStatement001 t1=new ThisStatement001();
			ThisStatement001 t2=new ThisStatement001(23);
			ThisStatement001 t3=new ThisStatement001('a',23.45);
		}
	}

}
