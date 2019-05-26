import java.io.*;
import java.util.*;

public class WriteData 
{
	
	 public static void writeAll(ArrayList<Student> a3)
	 {
		 try
		 {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myStudent.ser"));
			for(int i = 0;i<a3.size();i++)
			{
				oos.writeObject(a3.get(i));
			}
			oos.close();
		} 
		 catch (FileNotFoundException fne)
		 {
			System.out.println("Can't Delete because there is no file");
		}
		 catch(IOException e)
		 {
			 System.out.println("IO exception in writeData");
			 
		 }
		 
		 
	 }

}
