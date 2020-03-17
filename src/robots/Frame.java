package robots;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame{

	public Frame() 
	{
		Robot r1 = new Robot(new ImageIcon("E:\\1 LP-IAM\\Java Avence\\tp\\images/RobotBleu.jpg").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT), "RobotBleu");
		Robot r2 = new Robot(new ImageIcon("E:\\1 LP-IAM\\Java Avence\\tp\\images/RobotGris.jpg").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT), "RobotGris");
		
		
		Image  img1 = new ImageIcon("E:\\1 LP-IAM\\Java Avence\\tp\\images/station1.jpg").getImage().getScaledInstance(150, 80, Image.SCALE_DEFAULT);
    	//ImageIcon i1 = new ImageIcon("E:\\1 LP-IAM\\Java Avence\\tp\\images/station1.jpg");
    	ImageIcon i1 = new ImageIcon(img1);
    	
    	JLabel s1 = new JLabel();
		s1.setIcon(i1);
		
		JLabel s2 = new JLabel();
		s2.setIcon(i1);
		
		JPanel pane = new JPanel();
    	
    	
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pane.setLayout(null);

        pane.add(s1);
        pane.add(s2);
        
        pane.add(r1);
        pane.add(r2);
        
        Insets insets = pane.getInsets();
        
        Dimension size;
        
        size = s1.getPreferredSize();
        s1.setBounds(0, 0,size.width, size.height);
        
        
        size = s2.getPreferredSize();
        s2.setBounds(400, 400,size.width, size.height);

        
        size = r1.getPreferredSize();
        r1.setBounds((int)(Math.random() * (400-50)) + 50, (int)(Math.random() * (400-50)) + 50,size.width, size.height);
        
  
        size = r2.getPreferredSize();
        r2.setBounds((int)(Math.random() * (400-50)) + 50, (int)(Math.random() * (400-50)) + 50,size.width, size.height);
        

        this.add(pane);
        this.setSize(500,500);
       // pane.setBackground(Color.DARK_GRAY);
        this.setVisible(true);
	}
}

