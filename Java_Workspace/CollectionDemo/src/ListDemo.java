import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */

/**
 * @author admin
 *
 */
public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Collections");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Bellevue");
		list.add("Seattle");
		list.add("1");
		list.remove(2);
		list.toArray();
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		

	}

}
