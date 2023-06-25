
package Visitor.management.system;


import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.MatteBorder;

class UpdateGuard implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    JButton b,b1,b2; 
    String id_emp;

    UpdateGuard(){
        f=new JFrame("Update Guard details");
        f.setSize(900,650);
        f.setLocation(450,150); 
        f.setBackground(Color.white);
        f.getContentPane().setLayout(null);

        JLabel l1 = new JLabel("Enter Emp_Id to update the data of Guard");
        l1.setBounds(109,100,366,30);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        f.getContentPane().add(l1);
        
        t12 = new JTextField();
        t12.setBounds(500,100,200,30);
        f.getContentPane().add(t12);
        
        b2 = new JButton("Update");
        b2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(720,100,100,30);
        f.getContentPane().add(b2);
        b2.addActionListener(this);

        
        id8 = new JLabel("Update Guard Details:");
        id8.setBounds(223,11,394,50);
        id8.setFont(new Font("Serif", Font.BOLD, 40));
        id8.setForeground(Color.black);
        f.getContentPane().add(id8);


        id1 = new JLabel("Name");
        id1.setBounds(50,213,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id1);

        t1=new JTextField();
        t1.setBounds(200,217,150,30);
        f.getContentPane().add(t1);

        id2 = new JLabel("S/O");
        id2.setBounds(400,213,43,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id2);

        t2=new JTextField();
        t2.setBounds(600,217,150,30);
        f.getContentPane().add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,254,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id3);

        t3=new JTextField();
        t3.setBounds(200,254,150,30);
        f.getContentPane().add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(400,250,169,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id4);

        t4=new JTextField();
        t4.setBounds(600,258,150,30);
        f.getContentPane().add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,295,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id5);

        t5=new JTextField();
        t5.setBounds(200,299,150,30);
        f.getContentPane().add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,295,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id6);

        t6=new JTextField();
        t6.setBounds(600,299,150,30);
        f.getContentPane().add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,348,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id7);

        t7=new JTextField();
        t7.setBounds(200,352,150,30);
        f.getContentPane().add(t7);

        id9= new JLabel("Blood Group");
        id9.setBounds(400,348,130,30);
        id9.setFont(new Font("serif",Font.BOLD,20));    
        f.getContentPane().add(id9);

        t8=new JTextField();
        t8.setBounds(600,352,150,30);
        f.getContentPane().add(t8);

        id10= new JLabel("Document Submitted");
        id10.setBounds(50,401,130,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id10);

        t9=new JTextField();
        t9.setBounds(200,405,150,30);
        f.getContentPane().add(t9);


        id11= new JLabel("Aadhar No");
        id11.setBounds(400,401,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id11);

        t10=new JTextField();
        t10.setBounds(600,405,150,30);
        f.getContentPane().add(t10);

        id12= new JLabel("Emp Id");
        id12.setBounds(251,159,85,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(id12);

        t11=new JTextField();   
        t11.setBounds(600,458,150,30);
        f.getContentPane().add(t11);


        lab=new JLabel("Plant");
        lab.setBounds(400,454,150,30);
	lab.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(lab);
            
        t13=new JTextField();   
        t13.setBounds(346,163,150,30);
        f.getContentPane().add(t13);
        
        lab2=new JLabel("Department");
        lab2.setBounds(52,454,113,30);
	lab2.setFont(new Font("serif",Font.BOLD,20));
        f.getContentPane().add(lab2);
            
        t14=new JTextField();   
        t14.setBounds(200,458,150,30);
        f.getContentPane().add(t14);
        
        b = new JButton("Submit");
        b.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(251,560,150,40);
        
        f.getContentPane().add(b);

        b1=new JButton("Cancel");   
        b1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,560,150,40);
        
        f.getContentPane().add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
    }



    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b){
            try{
                conn con = new conn();
                String str = "update Guard set name='"+t1.getText()+"',so='"+t2.getText()+"',age='"+t3.getText()+"', dob='"+t4.getText()+"',address='"+t5.getText()+"',phone='"+t6.getText()+"',email='"+t7.getText()+"',blood_group='"+t8.getText()+"',documents_submitted='"+t9.getText()+"',aadhar='"+t10.getText()+"', emp_id = '"+t11.getText()+"',plant='"+t13.getText()+"',dept='"+t14.getText()+"' where emp_id='"+t12.getText()+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
                new GuardDetails().setVisible(true);
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
                String str = "select * from Guard where emp_id = '"+t12.getText()+"'";
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
                    t10.setText(rs.getString(10));
                    t11.setText(rs.getString(11));
                    t13.setText(rs.getString(12));
                    t14.setText(rs.getString(13));
                }

                
            }catch(Exception ex){}
        
            f.setVisible(true);
            f.setSize(900,650);
            f.setLocation(450,250);
        }
    }

    public static void main(String[] arg){
        new UpdateGuard().f.setVisible(true);
    }
}