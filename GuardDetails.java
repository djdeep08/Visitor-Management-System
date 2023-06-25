package Visitor.management.system;




import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;

import java.sql.*;
import java.util.Vector;

import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class GuardDetails extends JFrame implements ActionListener{
 
    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3;
    JTextField t2;
    String x[] = {"name","so","age","dob","address","phone","email", "blood_group", "document_submitted","aadhar","plant", "department","employee_id"};
    String y[][] = new String[20][13];
    int i=0, j=0;
    private JButton b4;
    GuardDetails(){
        super("Guard Details");
        setSize(1260,650);
        setLocation(200,200);
        getContentPane().setLayout(null);
        
        l1 = new JLabel("Enter Emp_Id number to delete Guard : ");
        l1.setBounds(50,360,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        getContentPane().add(l1);
        
        t2 = new JTextField();
        t2.setBounds(400,360,200,30);
        getContentPane().add(t2);
        
        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 360, 100 ,30);
        getContentPane().add(b1);
            
        l2 = new JLabel("Add New Guard");
        l2.setBounds(50,446,160,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        getContentPane().add(l2);
        
        b2 = new JButton("Add");
        b2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 450, 150 ,30);
        getContentPane().add(b2);
        
        l3 = new JLabel("Update Guard Details");
        l3.setBounds(50,490,200,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        getContentPane().add(l3);
        
        b3 = new JButton("Update");
        b3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(300, 490, 150 ,30);
        getContentPane().add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
        try{
            conn c1  = new conn();
            String s1 = "select * from Guard";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("so");
                y[i][j++]=rs.getString("age");
                y[i][j++]=rs.getString("dob");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("aadhar");
                y[i][j++]=rs.getString("document_submitted");
                y[i][j++]=rs.getString("aadhar");
                y[i][j++]=rs.getString("plant");
                y[i][j++]=rs.getString("dept");
                y[i][j++]=rs.getString("emp_id");
                i++;
                j=0;
            }
            DefaultTableModel model = new DefaultTableModel(y,x);
            t1 = new JTable(model);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(26,20,1194,331);
        getContentPane().add(sp);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        JButton btnPrint = new JButton("Print");
        btnPrint.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        btnPrint.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			DefaultTableModel viewModel = (DefaultTableModel) t1.getModel();
                    DefaultTableModel printModel = new DefaultTableModel(0, viewModel.getColumnCount());
                    for (int row : t1.getSelectedRows()) {
                        printModel.addRow((Vector) viewModel.getDataVector().get(row));
                    }
                    JTable toPrint = new JTable(printModel);
                    toPrint.setSize(toPrint.getPreferredSize());
                    JTableHeader tableHeader = toPrint.getTableHeader();
                    tableHeader.setSize(tableHeader.getPreferredSize());
                    toPrint.print(JTable.PrintMode.FIT_WIDTH);
               } catch (PrinterException ex) {
                   JOptionPane.showMessageDialog(null, ex.getMessage());
               }
       	}
        });
        btnPrint.setBounds(686, 477, 100, 30);
        getContentPane().add(btnPrint);
        
        b4 = new JButton("Cancel");
        b4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        b4.setBounds(862, 477, 89, 30);
        getContentPane().add(b4);
        b4.addActionListener(this);
        
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        
        conn c1 = new conn();
    
        if(ae.getSource() == b1){
            try{
                String a = t2.getText();
                String q = "delete from Guard where emp_id = '"+a+"'";
                c1.s.executeUpdate(q);
                this.setVisible(false);
                new GuardDetails().setVisible(true);
            }catch(Exception e){}
    
        }else if(ae.getSource() == b2){
            new AddGuard().f.setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource() == b3){
            new UpdateGuard().f.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == b4){
            new Dashboard().setVisible(true);
               this.setVisible(false);
            }
    }
    public static void main(String[] args){
        new GuardDetails().setVisible(true);
    }
}

