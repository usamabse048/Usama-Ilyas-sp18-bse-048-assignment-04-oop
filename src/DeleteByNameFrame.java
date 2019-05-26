import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;

public class DeleteByNameFrame extends JFrame
{
	ArrayList<Student> a2= new ArrayList();
	ArrayList<Student> a3= new ArrayList();
	JLabel l1;
	JTextField t1;
	JButton b1;
	public DeleteByNameFrame()
	{
		setSize(new Dimension(500,500));
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setVisible(true);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));
		
		l1 = new JLabel("Enter the Department to Search");
		t1 = new JTextField();
		b1 =  new JButton("Delete");
		DelByNameListener dbnl = new DelByNameListener();
		b1.addActionListener(dbnl);

		panel.add(l1);panel.add(t1);panel.add(b1);
		
		add(panel,BorderLayout.NORTH);

		
	}
	public class DelByNameListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)  
		{
			b1.setEnabled(false);
			a2 = ReadData.readAll();
			Student[] x = new Student[100];
			a2.toArray(x);
			int flag = 0;
			for(int i = 0;i<a2.size();i++)
			{
				if(x[i].getName().equalsIgnoreCase(t1.getText()))
				{
					flag = 1;
					
				}
				else
				{
					a3.add(x[i]);
				}
			}
			
			WriteData.writeAll(a3);
			if(flag == 1)
			{
				add(new JLabel(t1.getText()+" deleted  from the file"),BorderLayout.CENTER);
				
			}
			else
			{
				add(new JLabel(t1.getText()+" not found"),BorderLayout.CENTER);
				
			}
			
			
			
			
			
		}
		
	}
}
