package Visitor.management.system;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;
	private JLabel l11;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/logo.jpg"));
            Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(520, 59, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Visitor");
            l3.setForeground(new Color(153, 51, 0));
            l3.setFont(new Font("Stencil", Font.BOLD, 34));
            l3.setBounds(175, 36, 144, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(153, 0, 102));
            l4.setFont(new Font("Stencil", Font.BOLD, 34));
            l4.setBounds(88, 102, 352, 40);
            contentPane.add(l4);

            JLabel l6 = new JLabel("Developed By : Deepak Joshi");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(53, 178, 402, 35);
            contentPane.add(l6);


            JLabel l8 = new JLabel("Email : d.joshi2019@gmail.com");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(53, 277, 299, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Education - B.Tech (Computer Science)");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(53, 312, 368, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("Phone - +91 7595814521");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(53, 350, 216, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
            
            JLabel lblNewLabel = new JLabel("Scan -  Contact Us");
            lblNewLabel.setForeground(Color.BLUE);
            lblNewLabel.setBackground(Color.BLUE);
            lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 13));
            lblNewLabel.setBounds(511, 170, 136, 43);
            contentPane.add(lblNewLabel);
            
            l11 = new JLabel("New label");
            ImageIcon i6  = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/insta.jpg"));
            Image i7 = i6.getImage().getScaledInstance(48, 48,Image.SCALE_DEFAULT);
            ImageIcon i8 = new ImageIcon(i7);
            l11 = new JLabel(i8);
            l11.setBounds(20, 395, 53, 55);
            contentPane.add(l11);
            
            JLabel lblNewLabel_1 = new JLabel("@dj_deep07");
            lblNewLabel_1.setForeground(new Color(220, 20, 60));
            lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
            lblNewLabel_1.setBounds(71, 417, 100, 25);
            contentPane.add(lblNewLabel_1);
	}
}