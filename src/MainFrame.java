import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame
{
	
	JLabel l1;
	JButton b1,b2,b3,b4,b5;
	public MainFrame() 
	{
		setTitle("Assignment 04 OOP Usama Ilyas ");
		setLocationRelativeTo(null);
		setSize(new Dimension(500,500));
		
		setVisible(true);
		
		setLayout(new BorderLayout());
		
		l1 = new JLabel("Usama Ilyas     SP18-bSE-048");
	
		//Creating Panel For GridLayout
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,3));
	
		b1 = new JButton("Add Student");
		b2 = new JButton ("Search Student By Name");
		b3 = new JButton("Search Student by Department");
		b4 = new JButton("Delete Student by Name");
		b5 = new JButton ("Update Student by Name");
		
		//Adding Buttons in Grid panel
	
		panel.add(b1);panel.add(b2);panel.add(b3);panel.add(b4);panel.add(b5);
		
		//Adding Action listener of b1
		
		AddStudentListener asl = new AddStudentListener();
		b1.addActionListener(asl);
		
		//Adding Action Listener for b2
		
		SearchByNameListener sbnl = new SearchByNameListener();
		b2.addActionListener(sbnl);
		
		//Adding Action Listener for b3
		
		SearchByDepListener sbdl = new SearchByDepListener();
		b3.addActionListener(sbdl);
		
		//Adding Action Listener for b4
		
		DeleteByNameListener dbnl = new DeleteByNameListener();
		b4.addActionListener(dbnl);
				
		//Adding Action Listener for b4
		
		UpdateByNameListener ubnl = new UpdateByNameListener();
		b5.addActionListener(ubnl);
						
				
		add(l1,BorderLayout.NORTH);
		add(panel,BorderLayout.CENTER); //Add grid panel in center of border layout
		
		
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	//ActionListener Classes for Buttons in GridPanel
	
	public class AddStudentListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			AddStudentFrame asf = new AddStudentFrame();
			
		}
		
	}
	
	public class SearchByNameListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			SearchByNameFrame sbnf = new SearchByNameFrame();
			
		}
		
	}
	
	public class SearchByDepListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			SearchByDepFrame sbdf = new SearchByDepFrame();
			
		}
		
	}
	
	public class DeleteByNameListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			DeleteByNameFrame dbnf = new DeleteByNameFrame();
			
		}
		
	}
	
	public class UpdateByNameListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			UpdateByNameFrame sbnf = new UpdateByNameFrame();
			
		}
		
	}
	
	
	
	

}































