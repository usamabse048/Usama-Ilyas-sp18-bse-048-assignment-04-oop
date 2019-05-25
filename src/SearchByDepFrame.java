import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class SearchByDepFrame extends JFrame
{
	ArrayList<Student> a2= new ArrayList();
	JLabel l1;
	JTextField t1;
	JButton b1;

	public SearchByDepFrame() 
	{
		setSize(new Dimension(500,500));
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setVisible(true);
		
		
		l1 = new JLabel("Enter the Department to Search");
		t1 = new JTextField();
		b1 =  new JButton("Enter");

		
		
		
	}
	
	public class SearchByDepListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			a2 = ReadData.readAll();
			Student[] x = new Student[100];
			a2.toArray(x);
			
			for(int i = 0;i<a2.size();i++)
			{
				if(x[i].getD().getName().equalsIgnoreCase(t1.getText()))
				{
					
				}
			}

			
			
		}
		
	}

}
