import java.io.*;
import java.util.ArrayList;


public class ReadData implements Serializable
{
	
	public static ArrayList<Student> readAll()
	{
		 ArrayList<Student> a2 = new ArrayList();

		try 
		{
		
			boolean EOF = false;
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myStudent.ser"));
			Student s;
			
			System.out.println("ois made");
			
			
			while(EOF!=true)
			{
				try
				{
					 s = (Student)ois.readObject();
					
					a2.add(s);
					System.out.println("Student created and added");
				}
				catch(EOFException eof)
				{
					EOF = true;
					
				}
				catch(ClassNotFoundException cnf)
				{
					System.out.println("Class Not Found\n");
				}
			}
			
			ois.close();

		} 
		catch (IOException e) 
		{
			System.out.println("IO EXCEPTION IN ReadData class");
			
		}
		return a2;
		
	}

}
