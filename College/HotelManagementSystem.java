package College;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {
	HotelManagementSystem() {
		setBounds(-8,0,1850,1030);
		
	    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("College/icons/page.jpg"));
	    Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_FAST);
	    ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i1);
		l1.setBounds(-150,0,1800,900);	
		add(l1);
		
	/*	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/Icons/third.jpg"));
		Image i2 = i1.getImage().getScaledInstance(10000,1500,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i1);
		l1.setBounds(-700,0,2900,700);
		add(l1);*/
		
		/* l2 = new JLabel("TAJ HOTEL ");
		l2.setFont(new Font("", Font.PLAIN, 47));
		l2.setBounds(270,10,1000,600);
		l2.setForeground(Color.cyan);
		l1.add(l2);*/
		
		JButton b1 = new JButton("DETAILS");
		b1.setBackground(Color.orange);
		b1.setForeground(Color.black);
		b1.setBounds(420,300,150,50);
		b1.addActionListener(this);
		l1.add(b1);
		
		/*JButton b2 = new JButton("MORE INFO");
		b2.setBackground(Color.orange);
		b2.setForeground(Color.black);
		b2.setBounds(420,250,150,50);
		//b2.addActionListener(this);
		l1.add(b2);*/
		
		setLayout(null);
		setTitle("Hotel Management System");
		setVisible(true);
		
	/*	while(true) {
			l2.setVisible(true);
			try {
				Thread.sleep(100);
			} catch(Exception e) {}
			l2.setVisible(false);
			try {
				Thread.sleep(100);
			}catch(Exception e) {}
		}*/
	}
	
	public void actionPerformed (ActionEvent ae) {
		new Login().setVisible(true);
		//this.setVisible(false);
	}

	public static void main(String[] args) {
		new HotelManagementSystem();

	}
}