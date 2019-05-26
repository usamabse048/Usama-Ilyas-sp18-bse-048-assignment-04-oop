import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UpdateByNameFrame extends JFrame
{
	ArrayList<Student> a2= new ArrayList();
	ArrayList<Student> a3= new ArrayList();
	Student[] x = new Student[100];
	int i = 0;
	
	
	
	JButton sub;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	
	JLabel ol1;
	JTextField ot1;
	JButton ob1;

	public UpdateByNameFrame() 
	{

		setSize(new Dimension(500,500));
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setVisible(true);
		
		JPanel oPanel = new JPanel();
		oPanel.setLayout(new GridLayout(1,3));
		
		ol1 = new JLabel("Enter the name to Update Data");
		ot1 = new JTextField();
		ob1 =  new JButton("Enter");
		oPanel.add(ol1);oPanel.add(ot1);oPanel.add(ob1);
		Ob1Listner ol = new Ob1Listner();
		ob1.addActionListener(ol);
		add(oPanel,BorderLayout.NORTH);
	}
	
	public class Ob1Listner implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			ob1.setEnabled(false);
			a2 = ReadData.readAll();
			a2.toArray(x);
			int flag = 0;
			
		
			for(;i<a2.size();i++)
			{
				if(x[i].getName().equalsIgnoreCase(ot1.getText()))
				{
					flag = 1;
					break;
					
				}
			}
			if(flag == 0)
			{
				add(new JLabel(ot1.getText()+" is not present in the list.You can add it from main menu"),BorderLayout.CENTER);
			}
			else
			{
				l1 = new JLabel("Enter Student Name");
				l2 = new JLabel("Gender");
				l3 = new JLabel("Phone Number");
				l4 = new JLabel("Semester");
				l5 = new JLabel("Section");
				l6 = new JLabel("GPA");
				//newly added code
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
				JPanel nPanel = new JPanel();
				nPanel.setLayout(new GridLayout(8,2));
				  
				//Adding components to gridPanel 
				nPanel.add(l1); nPanel.add(t1);
				nPanel.add(l2); nPanel.add(t2);
				nPanel.add(l3); nPanel.add(t3);
				nPanel.add(l4); nPanel.add(t4);
				nPanel.add(l5); nPanel.add(t5);
				nPanel.add(l6); nPanel.add(t6);
				//newly added code
				nPanel.add(l7); nPanel.add(t7);
				nPanel.add(l8); nPanel.add(t8);
				
				
				sub = new JButton();
				sub.setIcon(new ImageIcon("sub.png"));
				uActionListener ual = new uActionListener();
				sub.addActionListener(ual);
				add(nPanel,BorderLayout.CENTER);
				
				add(sub,BorderLayout.SOUTH);
				
				
				
				
			}
			
		}
		
	}
	
	public class uActionListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			sub.setEnabled(false);
			
			x[i].setName(t1.getText());
			x[i].setGender(t2.getText().charAt(0));
			x[i].setPhone(t3.getText());
			x[i].setSemester(Integer.parseInt(t4.getText()));
			x[i].setSection(t5.getText());
			x[i].setGpa(Double.parseDouble(t6.getText()));
			
			x[i].getD().setName(t7.getText());
			x[i].getD().setLocation(t8.getText());
			for(int l = 0;l<a2.size();l++)
			{
				a3.add(x[l]);
			}
			WriteData.writeAll(a3);
			
			
		}
		
	}
	

}
