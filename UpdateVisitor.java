package Visitor.management.system;


import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.MatteBorder;

class UpdateVisitor implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id12,id15,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t11,t12,t13;
    JButton b,b1,b2; 
    String sl_no;

    UpdateVisitor(){;
        f=new JFrame("Update Visitor details");
        f.setSize(900,650);
        f.setLocation(450,150);
        f.setBackground(Color.white);
        f.getContentPane().setLayout(null);

        JLabel l1 = new JLabel("Enter Serial number to update the data of Visitor");
        l1.setBounds(62,100,417,30);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        f.getContentPane().add(l1);
        
        t12 = new JTextField();
        t12.setBounds(500,100,200,30);
        f.getContentPane().add(t12);
        
        b2 = new JButton("Update");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(720,100,100,30);
        f.getContentPane().add(b2);
        b2.addActionListener(this);

        
        id8 = new JLabel("Update Visitor Details:");
        id8.setBounds(224,11,392,50);
        id8.setFont(new Font("Serif", Font.BOLD, 40));
        id8.setForeground(Color.black);
        f.getContentPane().add(id8);


        id1 = new JLabel("Name");
        id1.setBounds(400,191,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id1);

        t1=new JTextField();
        t1.setBounds(600,195,150,30);
        f.getContentPane().add(t1);

        id2 = new JLabel("Whom to visit");
        id2.setBounds(44,240,124,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id2);

        t2=new JTextField();
        t2.setBounds(200,244,150,30);
        f.getContentPane().add(t2);

        id3= new JLabel("In time");
        id3.setBounds(50,386,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id3);

        t3=new JTextField();
        t3.setBounds(200,390,150,30);
        f.getContentPane().add(t3);

        id4= new JLabel("DOE ");  
        id4.setBounds(400,331,69,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id4);

        t4=new JTextField();
        t4.setBounds(600,335,150,30);
        f.getContentPane().add(t4);

        id5= new JLabel("Address");
        id5.setBounds(400,240,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id5);

        t5=new JTextField();
        t5.setBounds(600,240,150,30);
        f.getContentPane().add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(44,281,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id6);

        t6=new JTextField();
        t6.setBounds(200,285,150,30);
        f.getContentPane().add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(400,281,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id7);

        t7=new JTextField();
        t7.setBounds(600,281,150,30);
        f.getContentPane().add(t7);

        id9= new JLabel("Reason to visit");
        id9.setBounds(44,331,130,30);
        id9.setFont(new Font("serif",Font.BOLD,20));    
        f.getContentPane().add(id9);

        t8=new JTextField();
        t8.setBounds(200,335,150,30);
        f.getContentPane().add(t8);

        id10= new JLabel("Out time");
        id10.setBounds(400,386,130,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id10);

        t9=new JTextField();
        t9.setBounds(600,390,150,30);
        f.getContentPane().add(t9);



        id12= new JLabel("Sl No");
        id12.setBounds(44,191,60,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id12);

        t11=new JTextField();   
        t11.setBounds(200,195,150,30);
        f.getContentPane().add(t11);

        
        b = new JButton("Submit");
        b.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,520,150,40);
        
        f.getContentPane().add(b);

        b1=new JButton("Cancel");   
        b1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,520,150,40);
        
        f.getContentPane().add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
    }



    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b){
            try{
                conn con = new conn();
                String str = "update Visitor set name='"+t1.getText()+"',whom_to_visit='"+t2.getText()+"',in_time='"+t3.getText()+"',doe='"+t4.getText()+"',address='"+t5.getText()+"',phone='"+t6.getText()+"',email='"+t7.getText()+"',reason_to_visit='"+t8.getText()+"',out_time='"+t9.getText()+"', where sl_no='"+t12.getText()+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
                new VisitorDetails();
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Dashboard().setVisible(true);
        }
        if(ae.getSource() == b2){
            try{
                conn con = new conn();
                String str = "select * from Visitor where sl_no = '"+t12.getText()+"'";
                ResultSet rs = con.s.executeQuery(str);

                if(rs.next()){
                    f.setVisible(true);
             

                    t1.setText(rs.getString(1));
                    t2.setText(rs.getString(2));
                    t3.setText(rs.getString(3));
                    t4.setText(rs.getString(4));
                    t5.setText(rs.getString(5));
                    t6.setText(rs.getString(6));
                    t7.setText(rs.getString(7));
                    t8.setText(rs.getString(8));
                    t9.setText(rs.getString(9));
                    t11.setText(rs.getString(11));
                    t13.setText(rs.getString(12));
                }

                
            }catch(Exception ex){}
        
            f.setVisible(true);
            f.setSize(900,650);
            f.setLocation(450,250);
        }
    }

    public static void main(String[] arg){
        new UpdateVisitor().f.setVisible(true);
    }
}