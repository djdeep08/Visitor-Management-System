package Visitor.management.system;



import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.sql.*;
import java.util.Vector;
import javax.swing.border.MatteBorder;

public class VisitorDetails extends JFrame implements ActionListener{
 
    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3;
    JTextField t2;
    String x[] = {"name","whom_to_visit","in_time","doe","address","phone","email","out_time", "reason_to_visit","sl_no"};
    String y[][] = new String[20][13];
    int i=0, j=0;
    private JButton btnPrint;
    private JButton b4;
    
    VisitorDetails(){
        super("Visitor Details");
        setSize(1260,650);
        setLocation(200,200);
        getContentPane().setLayout(null);
        
        l1 = new JLabel("Enter sl.no to delete Visitor : ");
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
            
        l2 = new JLabel("Add New Visitor");
        l2.setBounds(50,450,143,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        getContentPane().add(l2);
        
        b2 = new JButton("Add Visitor");
        b2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 450, 150 ,30);
        getContentPane().add(b2);
        
        l3 = new JLabel("Update Visitor Details");
        l3.setBounds(50,490,191,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        getContentPane().add(l3);
        
        b3 = new JButton("Update Visitor");
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
            String s1 = "select * from visitor";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("whom_to_visit");
                y[i][j++]=rs.getString("in_time");
                y[i][j++]=rs.getString("doe");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("reason_to_visit");
                y[i][j++]=rs.getString("out_time");
                y[i][j++]=rs.getString("sl_no");
                i++;
                j=0;
            }
            
            DefaultTableModel model = new DefaultTableModel(y,x);
            t1 = new JTable(model);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        getContentPane().add(sp);
        
        getContentPane().setBackground(Color.WHITE);
        
        btnPrint = new JButton("Print");
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
        btnPrint.setBounds(590, 471, 89, 30);
        getContentPane().add(btnPrint);
        
        
        b4 = new JButton("Cancel");
        b4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        b4.setBounds(761, 471, 89, 27);
        getContentPane().add(b4);
        
        
        
        b4.addActionListener(this);
        
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        
        conn c1 = new conn();
    
        if(ae.getSource() == b1){
            try{
                String a = t2.getText();
                String q = "delete from visitor where sl_no = '"+a+"'";
                c1.s.executeUpdate(q);
                this.setVisible(false);
                new VisitorDetails().setVisible(true);
            }catch(Exception e){}
    
        }else if(ae.getSource() == b2){
            new AddVisitor().f.setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource() == b3){
            new UpdateVisitor().f.setVisible(true);
            this.setVisible(false);
        }
         else if(ae.getSource() == b4){
         new Dashboard().setVisible(true);
            this.setVisible(false);
         }
    }
    public static void main(String[] args){
        new VisitorDetails().setVisible(true);
    }
}
