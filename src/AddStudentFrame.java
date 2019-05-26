import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.*;

import javax.swing.*;
import java.awt.*;

public class AddStudentFrame extends JFrame implements Serializable
{
	ArrayList<Student> a1 = new ArrayList();
	JButton sub;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	
	public AddStudentFrame() 
	{
		setTitle("Assignment 04 OOP Usama Ilyas ");
		setLocationRelativeTo(null);
		setSize(new Dimension(500,500));
		setVisible(true);
		
		
		
		//creating a grid Panel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(8,2));
		
		// Assigning Labeles and TextFelds to gridPanel
		
		l1 = new JLabel("Enter Student Name");
		l2 = new JLabel("Gender");
		l3 = new JLabel("Phone Number");
		l4 = new JLabel("Semester");
		l5 = new JLabel("Section");
		l6 = new JLabel("GPA");
		//newly adde code
		l7 = new JLabel("Enter name of Department");
		l8 = new JLabel("Location of Department");
		
		
		t1 = new JTextField(20);
		t2 = new JTextField("M/F");
		t2.setBounds(50	, 100, 200, 30);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		t5 = new JTextField(20);
		t6 = new JTextField(20);
		//newly added code
		t7 =  new JTextField(20);
		t8 = new JTextField(20);
		
		
		//Adding components to gridPanel
		panel.add(l1); panel.add(t1);
		panel.add(l2); panel.add(t2);
		panel.add(l3); panel.add(t3);
		panel.add(l4); panel.add(t4);
		panel.add(l5); panel.add(t5);
		panel.add(l6); panel.add(t6);
		//newly added code
		panel.add(l7); panel.add(t7);
		panel.add(l8); panel.add(t8);
		
		
		sub = new JButton();
		sub.setIcon(new ImageIcon("sub.png"));
		sub.addActionListener(new SubmitListener());
		//Setting LayOut Of The frame BorderLayout
		
		setLayout(new BorderLayout());
		
	
		//Adding GridPanel To BorderLayout
		add(panel,BorderLayout.CENTER);
		add(sub,BorderLayout.SOUTH);
		
		
		
	}
	
	public class SubmitListener implements ActionListener, Serializable
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			sub.setEnabled(false);
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
						
						a1.add(s);
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
				
				Department d = new Department(t7.getText(),t8.getText());
				Student s1 = new Student(t1.getText(),t2.getText().charAt(0),t3.getText(),Integer.parseInt(t4.getText()),t5.getText(),Double.parseDouble(t6.getText()),d);
				a1.add(s1);
				int i = 0;
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myStudent.ser"));
				while(i<a1.size())
				{
					try
					{
						System.out.println("Reached for again writing");
						oos.writeObject(a1.toArray()[i]);
						System.out.println("Again written to file");
						i++;
					}
					catch(FileNotFoundException fnfe)
					{
						System.out.println("**FileNOT**");
					}
				}
				oos.close();
				
			} 
			catch (FileNotFoundException fe)
			{
				try 
				{
					
					Department d = new Department(t7.getText(),t8.getText());
		
					Student s1 = new Student(t1.getText(),t2.getText().charAt(0),t3.getText(),Integer.parseInt(t4.getText()),t5.getText(),Double.parseDouble(t6.getText()),d);
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myStudent.ser",true));
					System.out.println("HELLLLLLLLL01");
					oos.writeObject(s1);
					System.out.println("HELLLLLLLLL");
					oos.close();
					
				} 
				catch (FileNotFoundException e1) 
				{ 
					System.out.println("Something Happened While creating File");
					
				} 
				catch (IOException e1) 
				{
					System.out.println("Tried to create file but did not succeed");
					
				}
				
				
			} 
			catch (IOException e1)
			{
				System.out.println("IOEXception Occured\n");
			} 
			
			
		}
		
	}

}
