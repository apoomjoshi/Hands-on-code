
public class Addition {
	
//	public int add(int a, int b)
//	{
//		return a+b;
//	}
	
	public float add (int a , float b)
	{
		System.out.println("int , float");
		return a+b;
	}
	
	public float add ( float a, int b)
	{
		System.out.println("float , int");
		return a+b;
	}
	public float add ( float a, float b)
	{
		System.out.println("float , float");
		return a+b;
	}
	public boolean add(int a, int b) //returntype is different
	{
		System.out.println("int , int");
		int c= a+b;
		System.out.println(c);
		return true;
	}
	
	public double add(double a , double b )
	{
		System.out.println("double , double");
		return a+b;
	}

}
