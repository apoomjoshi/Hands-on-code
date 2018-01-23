import java.util.Comparator;

/**
 * 
 */

/**
 * @author admin
 *
 */
public class StudentSortByRollnum implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollNum - o2.rollNum;
	}
	

}
