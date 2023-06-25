package Visitor.management.system;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import Visitor.management.system.AboutUs;
import Visitor.management.system.AddGuard;
import Visitor.management.system.AddVisitor;
import Visitor.management.system.GuardDetails;
import Visitor.management.system.Dashboard;
import Visitor.management.system.UpdateGuard;
import Visitor.management.system.UpdateVisitor;
import Visitor.management.system.VisitorDetails;



public class Dashboard extends JFrame implements ActionListener{

	private JPanel contentPane;
        private JButton b1,b2,b3,b4,b5,b6;

	
	
	
        public Dashboard() {
        	super("Visitor Management System");
            setBounds(400, 150, 1000, 800);
            contentPane = new JPanel();
            contentPane.setPreferredSize(new Dimension(0, 0));
            contentPane.setMinimumSize(new Dimension(0, 0));
            contentPane.setMaximumSize(new Dimension(2147483647, 2147483647));
            setContentPane(contentPane);
            contentPane.setLayout(null);
            
            setSize(1020,790);            
            ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/background.jpg"));
            Image i3 = ic.getImage().getScaledInstance(1020,790,Image.SCALE_DEFAULT);
            ImageIcon icc3 = new ImageIcon(i3);
            JLabel l8 = new JLabel(icc3);
            
            getContentPane().add(l8);
            
            ImageIcon i100 = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/background.jpg"));
            Image i200 = i100.getImage().getScaledInstance(1000,749,Image.SCALE_DEFAULT);
            ImageIcon i300 =  new ImageIcon(i200);
            JLabel l60;
            
            b3 = new JButton("Update Visitor");
            b3.addActionListener(this);
            
            b4 = new JButton("Add Guard");
            b4.addActionListener(this);
            
                        b5 = new JButton("Guard Details");
                        b5.addActionListener(this);
                        
                                    b6 = new JButton("Update Guards");
                                    b6.addActionListener(this);
                                    b6.setBackground(Color.BLACK);
                                    b6.setForeground(Color.WHITE);
                                    b6.setBounds(688, 620, 143, 41);
                                    contentPane.add(b6);
                        b5.setBackground(Color.BLACK);
                        b5.setForeground(Color.WHITE);
                        b5.setBounds(369, 620, 159, 41);
                        contentPane.add(b5);
            b4.setBackground(Color.BLACK);
            b4.setForeground(Color.WHITE);
            b4.setBounds(76, 620, 157, 41);
            contentPane.add(b4);
            b3.setBackground(Color.BLACK);
            b3.setForeground(Color.WHITE);
            b3.setBounds(688, 320, 143, 44);
            contentPane.add(b3);

            
            JMenuBar mb = new JMenuBar();
            mb.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
            mb.setBackground(Color.WHITE);
            mb.setBounds(0, 0, 1000, 35);
            contentPane.add(mb);

            JMenu report = new JMenu("Update Details");
            report.setForeground(new Color(153, 0, 0));
            report.setFont(new Font("Segoe UI", Font.BOLD, 15));
            
            
            JMenuItem r1 = new JMenuItem("Update Visitors");
            r1.setBackground(new Color(211, 211, 211));
            r1.setForeground(new Color(105, 105, 105));
            r1.addActionListener(this);
            report.add(r1);
            
            JMenuItem r2 = new JMenuItem("Update Guards");
            r2.setForeground(new Color(105, 105, 105));
            r2.setBackground(new Color(211, 211, 211));
            r2.addActionListener(this);
            report.add(r2);
                
            r1.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon5.png"));
            Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            r1.setIcon(new ImageIcon(image7));
            r1.setMnemonic('E');
            r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
            r1.setBackground(Color.WHITE);
            
            r2.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon6.png"));
            Image imagee = iconn.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            r2.setIcon(new ImageIcon(imagee));
            r2.setMnemonic('F');
            r2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
            r2.setBackground(Color.WHITE);

            JMenu user = new JMenu("Details");
            user.setForeground(new Color(0, 0, 102));
            user.setFont(new Font("Segoe UI", Font.BOLD, 15));
            
            JMenuItem u1 = new JMenuItem("Visitor Details");
            u1.setBackground(new Color(211, 211, 211));
            u1.setForeground(new Color(105, 105, 105));
            u1.addActionListener(this);
            user.add(u1);

            JMenuItem u2 = new JMenuItem("Guard Details");
            u2.setForeground(new Color(105, 105, 105));
            u2.setBackground(new Color(211, 211, 211));
            u2.addActionListener(this);
            user.add(u2);
            
            u1.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon3.png"));
            Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            u1.setIcon(new ImageIcon(image4));
            u1.setMnemonic('C');
            u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
            u1.setBackground(Color.WHITE);
            
            u2.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon4.jpg"));
            Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            u2.setIcon(new ImageIcon(image5));
            u2.setMnemonic('D');
            u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
            u2.setBackground(Color.WHITE);

            JMenu master = new JMenu("Gate Entry");
            master.setForeground(new Color(153, 0, 0));
            master.setFont(new Font("Segoe UI", Font.BOLD, 15));
            

            JMenuItem m1 = new JMenuItem("New Visitor Entry");
            m1.addActionListener(this);
            m1.setBackground(new Color(211, 211, 211));
            m1.setForeground(Color.DARK_GRAY);
            

            JMenuItem m2 = new JMenuItem("New Guard");
            m2.setBackground(new Color(211, 211, 211));
            m2.setForeground(Color.DARK_GRAY);
            m2.addActionListener(this);
            
            
            m1.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon2.png"));
            Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
            m1.setIcon(new ImageIcon(image2));
            m1.setMnemonic('B');
            m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
            m1.setBackground(Color.WHITE);
        
            m2.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon1.png"));
            Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            m2.setIcon(new ImageIcon(image1));
            m2.setMnemonic('A');
            m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
            m2.setBackground(Color.WHITE);
            
            
            
           
            
            
            JMenu utility = new JMenu("Utility");
            utility.setForeground(new Color(0, 0, 102));
            utility.setFont(new Font("Segoe UI", Font.BOLD, 15));
            mb.add(utility);
            
            JMenuItem ut1 = new JMenuItem("Notepad");
            utility.add(ut1);
            
            JMenuItem ut2 = new JMenuItem("Calculator");
            utility.add(ut2);
            
            JMenuItem ut3 = new JMenuItem("Web Browser");
            utility.add(ut3);
            
            ut1.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon18 = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon9.png"));
            Image image19 = icon18.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            ut1.setIcon(new ImageIcon(image19));
            ut1.setMnemonic('I');
            ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
            ut1.setBackground(Color.WHITE);
            

            ut2.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon20 = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon10.png"));
            Image image21 = icon20.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            ut2.setIcon(new ImageIcon(image21));
            ut2.setMnemonic('J');
            ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
            ut2.setBackground(Color.WHITE);
            

            ut3.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon11.png"));
            Image image10 = icon10.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            ut3.setIcon(new ImageIcon(image10));
            ut3.setMnemonic('K');
            ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
            ut3.setBackground(Color.WHITE);
            
            ut1.addActionListener(this);
            ut2.addActionListener(this);
            ut3.addActionListener(this);
            
            JMenu about = new JMenu("About");
            about.setForeground(new Color(153, 0, 0));
            about.setFont(new Font("Segoe UI", Font.BOLD, 15));
            mb.add(about);
            
            JMenuItem aboutus = new JMenuItem("About Us");
            about.add(aboutus);
            
            aboutus.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon21 = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon13.jpg"));
            Image image22 = icon21.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            aboutus.setIcon(new ImageIcon(image22));
            aboutus.setMnemonic('L');
            aboutus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
            aboutus.setBackground(Color.WHITE);
            about.add(aboutus);
            aboutus.addActionListener(this);
            
            JMenu exit = new JMenu("Exit");
            exit.setForeground(new Color(0, 0, 102));
            exit.setFont(new Font("Segoe UI", Font.BOLD, 15));
            mb.add(exit);
            
            JMenuItem ex = new JMenuItem("Exit");
            exit.add(ex);

            ex.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon12.png"));
            Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            ex.setIcon(new ImageIcon(image11));
            ex.setMnemonic('Z');
            ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
            ex.setBackground(Color.WHITE);
            
            ex.addActionListener(this);
            
            JLabel l1 = new JLabel("Visitor Management System");
            l1.setBackground(Color.WHITE);
            l1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(153, 0, 0)));
            l1.setForeground(Color.WHITE);
            l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
            l1.setBounds(233, 56, 390, 51);
            contentPane.add(l1);

            JLabel l2 = new JLabel("");
            l2.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon2.png"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i20 = new ImageIcon(i2);
            l2 = new JLabel(i20);
            l2.setBounds(60, 172, 173, 128);
            contentPane.add(l2);

            JLabel l3 = new JLabel("");
            ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon3.png"));
            Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            l3 = new JLabel(i6);
            l3.setBounds(376, 168, 167, 132);
            contentPane.add(l3);
            
            JLabel l4 = new JLabel("");
            ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon9.png"));
            Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            l4 = new JLabel(i9);
            l4.setBounds(676, 161, 205, 148);
            contentPane.add(l4);

            JLabel l5 = new JLabel("");
            ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon1.png"));
            Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i12 = new ImageIcon(i11);
            l5 = new JLabel(i12);
            l5.setBounds(76, 461, 157, 142);
            contentPane.add(l5);

            JLabel l6 = new JLabel("");
            ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon4.jpg"));
            Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i15 = new ImageIcon(i14);
            l6 = new JLabel(i15);
            l6.setBounds(361, 464, 167, 145);
            contentPane.add(l6);

            JLabel l7 = new JLabel("");
            ImageIcon i16  = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon16.png"));
            Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i18 = new ImageIcon(i17);
            l7 = new JLabel(i18);
            l7.setBounds(676, 450, 173, 142);
            contentPane.add(l7);
            

            b1 = new JButton("Add Visitor");
            b1.addActionListener(this);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.setBounds(66, 320, 167, 44);
            contentPane.add(b1);

            b2 = new JButton("Visitor Details");
            b2.addActionListener(this);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            b2.setBounds(376, 320, 159, 44);
            contentPane.add(b2);

            JPanel panel = new JPanel();
            panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3, true), "Visitor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
            panel.setBounds(20, 120, 876, 260);
            panel.setBackground(Color.WHITE);
            contentPane.add(panel);

            JPanel panel2 = new JPanel();
            panel2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 51), 3, true), "Guard", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
            panel2.setBounds(20, 420, 876, 270);
            panel2.setBackground(Color.WHITE);
            contentPane.add(panel2);
            
            getContentPane().setBackground(Color.WHITE);
            contentPane.setBackground(Color.WHITE);
            l60 = new JLabel(i300);
            l60.setBounds(0,0,1000,749);
            getContentPane().add(l60);
	}
            JLabel l5 = new JLabel("");
            ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon6.png"));
            Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i12 = new ImageIcon(i11);

            JLabel l6 = new JLabel("");
            ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon6.png"));
            Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i15 = new ImageIcon(i14);

            JLabel l7 = new JLabel("");
            ImageIcon i16  = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/icon6.png"));
            Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i18 = new ImageIcon(i17);
            
           
	

        
        
        public void actionPerformed(ActionEvent ae){
        	String msg = ae.getActionCommand();
            if(msg.equals("New Visitor Entry")){
                new AddVisitor().f.setVisible(true);
                
            }else if(msg.equals("New Guard")){
                new AddGuard().f.setVisible(true);
                
            }else if(msg.equals("Add Guard")){
                new AddGuard().f.setVisible(true);
                
            }else if(msg.equals("Add Visitor")){
                    new AddVisitor().f.setVisible(true);
                
            }else if(msg.equals("Visitor Details")){
                new VisitorDetails().setVisible(true);
                
            }else if(msg.equals("Guard Details")){
                new GuardDetails().setVisible(true);
               
            }
            else if(msg.equals("Update Visitors")){
                new UpdateVisitor().f.setVisible(true);
               
            }
            else if(msg.equals("Update Guards")){
                new UpdateGuard().f.setVisible(true);
            }
                else if(msg.equals("Update Visitor")){
                    new UpdateVisitor().f.setVisible(true);   
            }

            else if(msg.equals("Notepad")){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){ }
            }else if(msg.equals("Calculator")){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){ }
            }else if(msg.equals("Web Browser")){
                
                try{
                    Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
                }catch(Exception e){ }
            }else if(msg.equals("Exit")){
                System.exit(0);
            }else if(msg.equals("About Us")){
                new AboutUs().setVisible(true);
            }    
        }
            public static void main(String[] args) {
                new Dashboard().setVisible(true);
    }
}