import java.io.Serializable;

/**
 * 
 */

/**
 * @author admin
 *
 */
public class Student implements Comparable<Student> ,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int rollNum;
     transient String name;

	
	
	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int rollNum , String name)
	{
		this.rollNum=rollNum;
		this.name=name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (rollNum==o.rollNum)
		{
			return 0;
		}
		else if(rollNum<o.rollNum)
		{
			return -1;
		}
		else
		{
		return 1;
		}
	}

}
