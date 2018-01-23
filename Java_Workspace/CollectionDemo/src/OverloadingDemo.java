
public class OverloadingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Addition add = new Addition();
		System.out.println(add.add(1,2)); // even though method return type is different in overloding , it does not matter.
		//Since only method name and arg list is considered for overloading
		
		add.add(1.1 , 1.2); //double () will get called. Why float () is not getting called.?
		// I have removed double() and checked whether it calls float() or not  but no .It is asking me for double ().
	}

}
