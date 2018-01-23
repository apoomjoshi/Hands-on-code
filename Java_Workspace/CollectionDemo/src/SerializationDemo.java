import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializationDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Student std = new Student(2, "Apoorva");
		
//	    FileOutputStream fos = new FileOutputStream("D:\\Student.ser");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(std);
//		oos.close();
//		fos.close();
		
		FileInputStream fis = new FileInputStream("D:\\Student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		std = (Student) ois.readObject();
		ois.close();
		fis.close();
		
		System.out.println("Student rollNum : "+std.rollNum);
		System.out.println("Student Name : "+std.name);
		
		
		
	}

}
