import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;


public class StudentList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student(2 , "Ananya");
		Student student2 = new Student(1, "Arya");
		Student student3 = new Student(3, "Arya");
		Student student4 = new Student(2, "Abha");
		ArrayList<Student> slist = new ArrayList<Student>();
		
		
		slist.add(student1);
		slist.add(student1);
		slist.add(student2);
		slist.add(student4);
		
		ArrayList<Student> slist2 = new ArrayList<Student>();
		slist2.addAll(slist);
		
		System.out.println("Hshset demo");
		HashSet<String> set= new HashSet<String>();
		String s1 = new String("Aniket");
		String s2 = new String("Aniket");
		set.add("India");
		set.add("India");
		set.add("France");
		set.add("France");
		set.add(s1);
		set.add(s2);
		
		//foreach
		for (String obj : set	)
		{ 
			System.out.println(obj);
			
		}
		
//		HashSet<Student> set= new HashSet<Student>();
//		set.add(student1);
//		set.add(student2);
//		set.add(student1);
//		set.add(student4);
		
//		Map<Integer,String> map=new HashMap<Integer,String>();  //Map
//		//map.put(1, "Ananya");
//		map.put(0, "Aniket");
//		
//		map.put(0,"Duplicate");
//		map.put(1,"");
//		map.put(1, "apoorva");
//		
//		//one Null key is allowed with Hashap
//		//If we are trying to add value with same key then value will be overriden 
//		for(Map.Entry m : map.entrySet())
//		{
//			System.out.println("Key:"+m.getKey()+"Value:"+m.getValue());
//		}
		
		
		//Iterator
//		java.util.Iterator<Student> it = slist.iterator();
//		
//		while(it.hasNext())
//		{
//			//System.out.println(it.next());
//			Student st = it.next();
//			System.out.println("Roll Num : "+st.rollNum + "Name : "+st.name);
//		}
		
//		//foreach
//		for (Student obj : set	)
//		{ 
//			System.out.println(obj.rollNum + "" +obj.name);
//			
//		}
		
//		//List Iterator
//		ListIterator<Student> li = slist.listIterator();
//		
//		while(li.hasNext())
//		{
//			Student st = li.next();
//			System.out.println("Name:" +st.name + "roll Num : "+st.rollNum);
//			
//		}
		
		
	}

}
