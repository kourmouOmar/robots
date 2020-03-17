package robots;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Robot extends JLabel implements Runnable {
	int enrgie=800;
	Thread t;
	ImageIcon icon ;
	String Nom;
	int x=(int)(Math.random() * (400-50)) + 50,y=(int)(Math.random() * (400-50)) + 50;
	
	
	public Robot(Image i,String n) 
	{
		t =new Thread(this);
		
		icon = new ImageIcon (i);
		Nom = n;
		this.setIcon(icon);
		t.start();
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) 
		{ try 
			{
			
			Dimension size;
			size = this.getPreferredSize();
		 x=(int)(Math.random() * (400-50)) + 50;y=(int)(Math.random() * (400-50)) + 50;
		 enrgie-=100;
		 System.out.println(enrgie);
		 if (x<=200 && y<=100 ) {
			 enrgie=500;
		}
		 if(enrgie == 0) {
			 this.hide();
			 break;}
	        this.setBounds(x , y,size.width, size.height);
				Thread.sleep(1000);
			} 
		
		catch (InterruptedException e) {e.printStackTrace();}
		
		}
		
		
	}
	

}

