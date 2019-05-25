import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.Insets;
import java.awt.Dimension;
public class First
{
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4,b5;
	
	
	public First()
	{
		
		JFrame frame = new JFrame();
		frame.setLocationRelativeTo(null);
		frame.setDefaultLookAndFeelDecorated(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		
		BoxLayout box = new BoxLayout(panel,BoxLayout.Y_AXIS);
		panel.setLayout(box);
		panel.setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));
		
		/*l1 = new JLabel("Hello World");
		l2 = new JLabel("Pakisan");
		
		b1.setSize(new Dimension(500, 500));
		panel.add(l1);
		panel.add(l2);
		*/
		
		b1 = new JButton("        Add a Student       ");
		b2 = new JButton("   Search Student By Name   ");
		b3 = new JButton("Search Student By Department");
		b4 = new JButton("   Update Student By Name   ");
		b5 = new JButton("   Delete Student By Name   ");
		
		//b1.setAlignmentX(50.0f);
		
		panel.add(b1);
		panel.add(Box.createRigidArea(new Dimension(0,10)));
		panel.add(b2);
		panel.add(Box.createRigidArea(new Dimension(0,10)));

		panel.add(b3);
		panel.add(Box.createRigidArea(new Dimension(0,10)));

		panel.add(b4);
		panel.add(Box.createRigidArea(new Dimension(0,10)));

		panel.add(b5);
		panel.add(Box.createRigidArea(new Dimension(0,10)));

		
		
		 frame.add(panel);
	     frame.pack();
	     frame.setVisible(true);
	}
	

}
