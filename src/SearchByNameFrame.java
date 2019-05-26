import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class SearchByNameFrame extends JFrame
{
	ArrayList<Student> a2= new ArrayList();
	JLabel l1;
	JTextField t1;
	JButton b1;
	
	
	public SearchByNameFrame() 
	{
		setSize(500,500);
		setLocationRelativeTo(null);
		setVisible(true);
		
		setLayout(new BorderLayout());
		
		
		//creating gridpanel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));
		
		l1 = new JLabel("Enter the Name to Search");
		t1 = new JTextField("name");
		b1 =  new JButton();
		b1.setIcon(new ImageIcon("sub.png"));
		SearchByNameListener sbnl = new SearchByNameListener();
		b1.addActionListener(sbnl);
		
		panel.add(l1);panel.add(t1);panel.add(b1);
	
		add(panel,BorderLayout.NORTH);
		
		
		
		
    
	}
	
	public class SearchByNameListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			
			b1.setEnabled(false);
			a2 = ReadData.readAll();
			Student[] x = new Student[100];
			a2.toArray(x);
			
			int dala = 0;
			for(int i = 0;i<a2.size();i++)
			{
				if(x[i].getName().equalsIgnoreCase(t1.getText()))
				{
					System.out.println("PAKISTAN ZINDABAD MUBARKAN");
					dala = 1;
					String dp =x[i].getD().toString();
					String pr = "Name:"+x[i].getName()+"     Gender: "+x[i].getGender()+"    Phone: "+x[i].getPhone();
					String st = "GPA:    "+x[i].getGpa()+"      Section:"+x[i].getSection()+"     Semester"+x[i].getSemester();
					
					//formating frame
					JPanel panelK = new JPanel();
					panelK.setLayout(new BorderLayout());
					
					JLabel l1 = new JLabel(pr);
					JLabel l2 = new JLabel(st);
					JLabel l3 = new JLabel(dp);
					
					JButton exBL,exBR;
					
					exBL = new JButton(); exBL.setEnabled(false);
					exBR = new JButton(); exBR.setEnabled(false);
					
					JPanel panelR = new JPanel();
					panelR.setLayout(new GridLayout(3,1));
					panelR.add(l1);panelR.add(l2);panelR.add(l3);
					
					panelK.add(panelR,BorderLayout.CENTER);
					panelK.add(exBL,BorderLayout.EAST);
					panelK.add(exBR,BorderLayout.WEST);
					//....................
					
					add(panelK,BorderLayout.CENTER);
					
					break;
				}
				
				
			}
			if(dala == 0)
			{
				JLabel sad = new JLabel(t1.getText()+" is not in the list");
				JPanel panelJ = new JPanel();
				panelJ.add(sad);
				add(panelJ,BorderLayout.CENTER);
				
				
			}
			else if(dala != 0)
			{
				b1.setEnabled(false);
			}
			
		}
				
		
	}



	


}
