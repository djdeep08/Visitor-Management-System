package Visitor.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    private JLabel l6;

    Login(){

        super("Login");

        setBackground(Color.white);
        getContentPane().setLayout(null);
        
        
                b1 = new JButton("Login");
                b1.setBounds(40,164,120,30);
                b1.setFont(new Font("serif",Font.BOLD,15));
                b1.addActionListener(this);
                
                        b2=new JButton("Cancel");
                        b2.setBounds(180,164,120,30);
                        b2.setFont(new Font("serif",Font.BOLD,15));
                        b2.setBackground(Color.BLACK);
                        b2.setForeground(Color.WHITE);
                        getContentPane().add(b2);
                        
                                b2.addActionListener(this);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
                getContentPane().add(b1);

        l1 = new JLabel("Username");
        l1.setForeground(UIManager.getColor("Button.highlight"));
        l1.setBounds(40,44,100,30);
        getContentPane().add(l1);
        
        l2 = new JLabel("Password");
        l2.setForeground(UIManager.getColor("Button.highlight"));
        l2.setBounds(40,88,100,30);
        getContentPane().add(l2);
 
        t1=new JTextField();
        t1.setBounds(150,44,150,30);
        getContentPane().add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,88,150,30);
        getContentPane().add(t2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,20,150,150);
        getContentPane().add(l3);
        
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/fourth.jpg"));
        Image i20 = i10.getImage().getScaledInstance(584,261,Image.SCALE_DEFAULT);
        ImageIcon i30 =  new ImageIcon(i20);
        JLabel l6;
        l6 = new JLabel(i30);
        l6.setBounds(0,0,584,261);
        getContentPane().add(l6);
        
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600,300);
        setLocation(500,300);

    }

    public void actionPerformed(ActionEvent ae){

        try{
            conn c1 = new conn();
            String u = t1.getText();
            String v = t2.getText();
            
            String q = "select * from login where username='"+u+"' and password='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(q); 
            if(rs.next()){
                new Dashboard().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] arg){
        Login l = new Login();
    }
}