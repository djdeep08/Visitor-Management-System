package Visitor.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import javax.swing.border.MatteBorder;

class AddVisitor implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id12,id15,id16,id17,lblNewLabel,lblNewLabel_1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t9,t10,t11,t12,t13;
    JButton b,b1,b2,b3;
    
    
      
    long serialVersionUID = 1L;
    private JPanel webcamPane_l_1;  
    
     AddVisitor(){
    	 f = new JFrame("Add Visitor");
         f.setBackground(Color.white);
         f.getContentPane().setLayout(null);
         ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/fourth.jpg"));
         Image i3 = img.getImage().getScaledInstance(884,661,Image.SCALE_DEFAULT);
         ImageIcon icc3 = new ImageIcon(i3);
                                                                                                                
                                                                                                                JButton btnPrint = new JButton("Create Pass");
                                                                                                                btnPrint.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.RED));
                                                                                                                btnPrint.addActionListener(new ActionListener() {
                                                                                                                	public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                		PrinterJob pj = PrinterJob.getPrinterJob();
                                                                                                                		  pj.setJobName(" Print Component ");
                                                                                                                		  pj.setPrintable (new Printable() {    
                                                                                                                		    public int print(Graphics pg, PageFormat pf, int pageNum){
                                                                                                                		      if (pageNum > 0){
                                                                                                                		      return Printable.NO_SUCH_PAGE;
                                                                                                                		      }

                                                                                                                		      Graphics2D g2 = (Graphics2D) pg;
                                                                                                                		      g2.translate(pf.getImageableX(), pf.getImageableY());
                                                                                                                		      f.paint(g2);
                                                                                                                		      return Printable.PAGE_EXISTS;
                                                                                                                		    }
                                                                                                                		  });
                                                                                                                		  if (pj.printDialog() == false)
                                                                                                                		  return;

                                                                                                                		  try {
                                                                                                                		        pj.print();
                                                                                                                		  } catch (PrinterException ex) {
                                                                                                                		        // handle exception
                                                                                                                		  }
                                                                                                                		}
                                                                                                                	});
                                                                                
                                                                                        t7=new JTextField();
                                                                                        f.getContentPane().add(t7);
                                                                                        t7.setBounds(166,219,150,30);
                                                                        
                                                                                t4=new JTextField();
                                                                                f.getContentPane().add(t4);
                                                                                t4.setBounds(497,344,150,30);
                                                                
                                                                        t11=new JTextField();   
                                                                        f.getContentPane().add(t11);
                                                                        t11.setBounds(166,115,150,30);
                                                                        t11.setText(""+ "");
                                                        
                                                                t3=new JTextField();
                                                                f.getContentPane().add(t3);
                                                                t3.setBounds(497,390,150,30);
                                                
                                                        t2=new JTextField();
                                                        f.getContentPane().add(t2);
                                                        t2.setBounds(166,367,150,30);
                                        
                                                t9=new JTextField();
                                                f.getContentPane().add(t9);
                                                t9.setBounds(166,412,150,30);
                                
                                        t10=new JTextField();
                                        f.getContentPane().add(t10);
                                        t10.setBounds(497,431,150,30);
                        
                                t6=new JTextField();
                                f.getContentPane().add(t6);
                                t6.setBounds(166,274,150,30);
                
                        t1=new JTextField();
                        f.getContentPane().add(t1);
                        t1.setBounds(166,167,150,30);
        
                t5=new JTextField();
                f.getContentPane().add(t5);
                t5.setBounds(166,315,150,30);
                                                                                                                  
                                                                                                                  JLabel lblNewLabel_1 = new JLabel("Visitor In/Out");
                                                                                                                  lblNewLabel_1.setForeground(Color.WHITE);
                                                                                                                  lblNewLabel_1.setFont(new Font("Modern No. 20", Font.BOLD, 18));
                                                                                                                  lblNewLabel_1.setBounds(497, 310, 166, 39);
                                                                                                                  f.getContentPane().add(lblNewLabel_1);
                                                                                                                  
                                                                                                                  JLabel lblNewLabel = new JLabel("Visitor Photo");
                                                                                                                  lblNewLabel.setBackground(Color.RED);
                                                                                                                  lblNewLabel.setForeground(Color.WHITE);
                                                                                                                  lblNewLabel.setFont(new Font("Modern No. 20", Font.BOLD, 18));
                                                                                                                  lblNewLabel.setBounds(476, 97, 187, 33);
                                                                                                                  f.getContentPane().add(lblNewLabel);
                                                                                                                
                                                                                                                  btnPrint.setBounds(590, 510, 112, 38);
                                                                                                                  f.getContentPane().add(btnPrint);
                                                                                                        
                                                                                                                b1=new JButton("Cancel");   
                                                                                                                b1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.RED));
                                                                                                                f.getContentPane().add(b1);
                                                                                                                b1.setBackground(Color.BLACK);
                                                                                                                b1.setForeground(Color.WHITE);
                                                                                                                b1.setBounds(377,509,150,40);
                                                                                                                b1.addActionListener(this);
                                                                                                
                                                                                                        
                                                                                                        b = new JButton("Submit");
                                                                                                        b.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.RED));
                                                                                                        f.getContentPane().add(b);
                                                                                                        b.setBackground(Color.BLACK);
                                                                                                        b.setForeground(Color.WHITE);
                                                                                                        b.setBounds(166,509,150,40);
                                                                                                        
                                                                                                                      
                                                                                                        b.addActionListener(this);
                                                                                        
                                                                                                id12= new JLabel("Sl.No");
                                                                                                id12.setForeground(new Color(230, 230, 250));
                                                                                                f.getContentPane().add(id12);
                                                                                                id12.setBounds(32,115,83,30);
                                                                                                id12.setFont(new Font("serif",Font.BOLD,20));
                                                                                                                                                                                
                                                                                        id1 = new JLabel("Name");
                                                                                        id1.setForeground(new Color(230, 230, 250));
                                                                                        f.getContentPane().add(id1);
                                                                                        id1.setBounds(32,163,100,30);
                                                                                        id1.setFont(new Font("serif",Font.BOLD,20));
 
                                                                                                                                                                                id8 = new JLabel("Visitor Gate Pass");
                                                                                                                                                                                id8.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(192, 192, 192)));
                                                                                                                                                                                f.getContentPane().add(id8);
                                                                                                                                                                                id8.setBounds(260,23,295,50);
                                                                                                                                                                                id8.setFont(new Font("Arial Black", Font.BOLD, 29));
                                                                                                                                                                                id8.setForeground(new Color(240, 230, 140));
                                                                                                                                                                
                                                                                                                                                                        id4= new JLabel("DOE");  
                                                                                                                                                                        id4.setForeground(new Color(230, 230, 250));
                                                                                                                                                                        f.getContentPane().add(id4);
                                                                                                                                                                        id4.setBounds(405,340,83,30);
                                                                                                                                                                        id4.setFont(new Font("serif",Font.BOLD,20));
                                                                                                                                                        
                                                                                                                                                                id3= new JLabel("In time");
                                                                                                                                                                id3.setForeground(new Color(230, 230, 250));
                                                                                                                                                                f.getContentPane().add(id3);
                                                                                                                                                                id3.setBounds(405,386,88,30);
                                                                                                                                                                id3.setFont(new Font("serif",Font.BOLD,20));
                                                                                                                                                
                                                                                                                                                        id10= new JLabel("Out time");
                                                                                                                                                        id10.setForeground(new Color(230, 230, 250));
                                                                                                                                                        f.getContentPane().add(id10);
                                                                                                                                                        id10.setBounds(403,431,89,30);
                                                                                                                                                        id10.setFont(new Font("serif",Font.BOLD,20));
                                                                                                                                        
                                                                                                                                                id9= new JLabel("To meet user type");
                                                                                                                                                id9.setForeground(new Color(230, 230, 250));
                                                                                                                                                f.getContentPane().add(id9);
                                                                                                                                                id9.setBounds(0,408,163,30);
                                                                                                                                                id9.setFont(new Font("serif",Font.BOLD,20));
                                                                                                                
                                                                                                                
                                                                                                                
                                                                                                                    	
                                                                                                                                        id2 = new JLabel("To meet ");
                                                                                                                                        id2.setForeground(new Color(230, 230, 250));
                                                                                                                                        f.getContentPane().add(id2);
                                                                                                                                        id2.setBounds(20,367,89,30);
                                                                                                                                        id2.setFont(new Font("serif",Font.BOLD,20));
                                                                                                        
                                                                                                                id5= new JLabel("Coming From");
                                                                                                                id5.setForeground(new Color(230, 230, 250));
                                                                                                                f.getContentPane().add(id5);
                                                                                                                id5.setBounds(20,311,130,30);
                                                                                                                id5.setFont(new Font("serif",Font.BOLD,20));
                                                                                                
                                                                                                        id6= new JLabel("Phone");
                                                                                                        id6.setForeground(new Color(230, 230, 250));
                                                                                                        f.getContentPane().add(id6);
                                                                                                        id6.setBounds(32,270,100,30);
                                                                                                        id6.setFont(new Font("serif",Font.BOLD,20));
                                                                                        
                                                                                                id7= new JLabel("Email Id");
                                                                                                id7.setForeground(new Color(230, 230, 250));
                                                                                                f.getContentPane().add(id7);
                                                                                                id7.setBounds(32,215,100,30);
                                                                                                id7.setFont(new Font("serif",Font.BOLD,20));
                                                                                
                                                                                 
                                                                                                id15=new JLabel();
                                                                                                id15.setForeground(SystemColor.menu);
                                                                                                id15.setBounds(0,0,884,661);
                                                                                                id15.setLayout(null);
                                                                                                id15.setIcon(icc3);
                                                                                                f.getContentPane().add(id15);
        
        final Webcam webcam = Webcam.getDefault();
        webcam.open();
        
        WebcamPanel webcamPane_l_1_1 = new WebcamPanel(webcam);
        webcamPane_l_1_1.setBounds(476, 127, 187, 159);
        f.getContentPane().add(webcamPane_l_1_1);
        webcamPane_l_1_1.setFPSDisplayed(true);
        webcamPane_l_1_1.setDisplayDebugInfo(true);
        webcamPane_l_1_1.setImageSizeDisplayed(true);
        webcamPane_l_1_1.setMirrored(true);
        
             
                
                
                
        
        JButton button = new JButton(new AbstractAction("Capture"){
        			
        	public void actionPerformed(ActionEvent e) {
        		try {
					String name = String.format("Visitor-%d.png", System.currentTimeMillis());
					BufferedImage image = webcam.getImage();
					ImageIO.write(image,"PNG", new File(name));
					System.out.format("File %s has been saved\n", name);
					webcamPane_l_1_1.pause();
        		} catch (IOException t) {
					t.printStackTrace();
				}
			}
		});
        webcamPane_l_1_1.add(button);
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        button.setText("Capture");
        
        
        button.setActionCommand("Take Snapshot Now");
        
        f.setVisible(true);
        f.setSize(838,675);
        f.setLocation(400,150);
    }

    public void actionPerformed(ActionEvent ae){
        
        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();   
        String i = t9.getText();
        String j = t10.getText();
        String k = t11.getText();
        
        if(ae.getSource() == b){
            try{
                conn cc = new conn();
                String q = "insert into visitor values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+i+"','"+j+"','"+k+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Visitor Details Inserted Successfully");
                f.setVisible(false);  
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            new Dashboard().setVisible(true);
        }
    }
    public static void main(String[ ] arg){
        new AddVisitor().f.setVisible(true);
    }
}	