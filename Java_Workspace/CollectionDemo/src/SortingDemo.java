import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class SortingDemo {
	public static void main (String args[])
	{
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("Apoorva");
//	    al.add("Ananya");
//		al.add("Vihaan");
//		al.add("Tarush");
//		al.add("Mihir");
//		
//		Collections.sort(al);
//		
//		Iterator<String> it = al.iterator();
//		
//		while ( it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		//Comprable demo 
//		Student student1 = new Student(7 , "Ananya");
//		Student student2 = new Student(1, "Arya");
//		Student student3 = new Student(2, "Abha");
//		
//		ArrayList<Student> slist = new ArrayList<Student>();
//		
//		
//		slist.add(student1);
//		slist.add(student2);
//		slist.add(student3);
//		
//		Collections.sort(slist);
		
		//Compartor demo
		System.out.println("Comprtor demo");
		Student student1 = new Student(7 , "Ananya");
		Student student2 = new Student(1, "Arya");
		Student student3 = new Student(2, "Abha");
		
		ArrayList<Student> slist = new ArrayList<Student>();
		
		
		slist.add(student1);
		slist.add(student2);
		slist.add(student3);
		
		//Collections.sort(slist, new StudentSortByRollnum()); //sort by roll number
		
		Collections.sort(slist, new Comparator<Student>() // soer by name
				{
			public int compare(Student s1 , Student s2)
			{
				return s1.getName().compareTo(s2.getName());
			}
				});
			
		
		
		for (Student st: slist)
		{
			System.out.println("student RollNum : "+ st.rollNum + "Student Name : "+st.name);
		}
	}

}
