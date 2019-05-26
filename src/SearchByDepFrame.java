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
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));
		
		l1 = new JLabel("Enter the Department to Search");
		t1 = new JTextField();
		b1 =  new JButton("Enter");
		SearchByDepListener sbdl = new SearchByDepListener();
		b1.addActionListener(sbdl);

		panel.add(l1);panel.add(t1);panel.add(b1);
		
		add(panel,BorderLayout.NORTH);
	
		
		
	}
	
	public class SearchByDepListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			b1.setEnabled(false);
			a2 = ReadData.readAll();
			Student[] x = new Student[100];
			a2.toArray(x);
			//JScrollPane scroll = new JScrollPane();
			JPanel panelL = new JPanel();
			
			//making counter to find num of rows in gridPanel
			int count = 0;
			for(int i = 0;i<a2.size();i++)
			{
				if(x[i].getD().getName().equalsIgnoreCase(t1.getText()))
				{
					count++;
				}
			}  

			panelL.setLayout(new GridLayout(count,1));
			
			for(int i = 0;i<a2.size();i++)
			{
				if(x[i].getD().getName().equalsIgnoreCase(t1.getText()))
				{
					JPanel panelI = new JPanel();
					String dp =x[i].getD().toString();
					String pr = "Name:"+x[i].getName()+"     Gender: "+x[i].getGender()+"    Phone: "+x[i].getPhone();
					String st = "GPA:    "+x[i].getGpa()+"      Section:"+x[i].getSection()+"     Semester"+x[i].getSemester();

					panelI.setLayout(new GridLayout(3,1));
					JLabel l1 = new JLabel(pr);
					JLabel l2 = new JLabel(st);
					JLabel l3 = new JLabel(dp);
					panelI.add(l1);panelI.add(l2);panelI.add(l3);
					panelI.setBorder(BorderFactory.createLineBorder(Color.black));
					panelL.add(panelI);
				}
			}
			//getContentPane().add(panelL);
			if(count == 0)
			{
				add(new JLabel("No student of "+t1.getText()+" Exists..."),BorderLayout.CENTER);
	
			}
			else
			{
				add(panelL,BorderLayout.CENTER);

				
				
			}

			
		}
		
	}

}
