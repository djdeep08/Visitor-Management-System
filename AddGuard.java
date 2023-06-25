package Visitor.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.print.PageFormat;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JButton;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;

class AddGuard implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
    private JLabel id8_1;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b,b1,b2,b3;
    JComboBox c1,c2,c7;

    
      
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);
    private JPanel jPanelCamera;
    private JTabbedPane JTabbedPanel;
    private JPanel webcamPanel;

    AddGuard(){
        f = new JFrame("Add Guard");
        f.setBackground(Color.white);
        f.getContentPane().setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Visitor/management/system/icons/fourth.jpg"));
        Image i3 = img.getImage().getScaledInstance(884,661,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
                
                JButton btnPrint = new JButton("Print I'd");
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
                        
                                id8_1 = new JLabel("New Guard Details");
                                id8_1.setBackground(new Color(224, 255, 255));
                                id8_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(224, 255, 255)));
                                f.getContentPane().add(id8_1);
                                id8_1.setBounds(302,28,254,50);
                                id8_1.setFont(new Font("Arial", Font.BOLD, 28));
                                id8_1.setForeground(new Color(255, 228, 181));
                
                        t11=new JTextField();
                        f.getContentPane().add(t11);
                        t11.setText("101"+first);
                        t11.setBounds(598,113,150,30);
                
                id11= new JLabel("Emp_id");
                id11.setForeground(SystemColor.menu);
                f.getContentPane().add(id11);
                id11.setBounds(445,109,150,30);
                id11.setFont(new Font("serif",Font.BOLD,20));
                btnPrint.setBounds(663, 551, 98, 36);
                f.getContentPane().add(btnPrint);
        
                id15=new JLabel();
                id15.setForeground(SystemColor.menu);
                id15.setBounds(0,0,884,661);
                id15.setLayout(null);
                id15.setIcon(icc3);
                f.getContentPane().add(id15);
                
                 
                        id1 = new JLabel("Name");
                        id1.setForeground(SystemColor.menu);
                        id1.setBounds(50,150,100,30);
                        id1.setFont(new Font("serif",Font.BOLD,20));
                        id15.add(id1);
                        
                                t1=new JTextField();
                                t1.setBounds(200,150,150,30);
                                id15.add(t1);
                                
                                        id2 = new JLabel("S/O");
                                        id2.setForeground(SystemColor.menu);
                                        id2.setBounds(400,150,200,30);
                                        id2.setFont(new Font("serif",Font.BOLD,20));
                                        id15.add(id2);
                                        
                                                t2=new JTextField();
                                                t2.setBounds(600,150,150,30);
                                                id15.add(t2);
                                                
                                                        id3= new JLabel("Age");
                                                        id3.setForeground(SystemColor.menu);
                                                        id3.setBounds(50,200,100,30);
                                                        id3.setFont(new Font("serif",Font.BOLD,20));
                                                        id15.add(id3);
                                                        
                                                                t3=new JTextField();
                                                                t3.setBounds(200,200,150,30);
                                                                id15.add(t3);
                                                                
                                                                        id4= new JLabel("DOB (dd/mm/yyyy)");  
                                                                        id4.setForeground(SystemColor.menu);
                                                                        id4.setBounds(400,200,200,30);
                                                                        id4.setFont(new Font("serif",Font.BOLD,20));
                                                                        id15.add(id4);
                                                                        
                                                                                t4=new JTextField();
                                                                                t4.setBounds(600,200,150,30);
                                                                                id15.add(t4);
                                                                                
                                                                                        id5= new JLabel("Address");
                                                                                        id5.setForeground(SystemColor.menu);
                                                                                        id5.setBounds(50,250,100,30);
                                                                                        id5.setFont(new Font("serif",Font.BOLD,20));
                                                                                        id15.add(id5);
                                                                                        
                                                                                                t5=new JTextField();
                                                                                                t5.setBounds(200,250,150,30);
                                                                                                id15.add(t5);
                                                                                                
                                                                                                        id6= new JLabel("Phone");
                                                                                                        id6.setForeground(SystemColor.menu);
                                                                                                        id6.setBounds(400,250,100,30);
                                                                                                        id6.setFont(new Font("serif",Font.BOLD,20));
                                                                                                        id15.add(id6);
                                                                                                        
                                                                                                                t6=new JTextField();
                                                                                                                t6.setBounds(600,250,150,30);
                                                                                                                id15.add(t6);
                                                                                                                
                                                                                                                        id7= new JLabel("Email Id");
                                                                                                                        id7.setForeground(SystemColor.menu);
                                                                                                                        id7.setBounds(50,300,100,30);
                                                                                                                        id7.setFont(new Font("serif",Font.BOLD,20));
                                                                                                                        id15.add(id7);
                                                                                                                        
                                                                                                                                t7=new JTextField();
                                                                                                                                t7.setBounds(200,300,150,30);
                                                                                                                                id15.add(t7);
                                                                                                                                
                                                                                                                                        id8= new JLabel("Blood Group");
                                                                                                                                        id8.setForeground(SystemColor.menu);
                                                                                                                                        id8.setBounds(400,300,130,30);
                                                                                                                                        id8.setFont(new Font("serif",Font.BOLD,20));    
                                                                                                                                        id15.add(id8);
                                                                                                                                        
                                                                                                                                                t8=new JTextField();
                                                                                                                                                t8.setBounds(600,300,150,30);
                                                                                                                                                id15.add(t8);
                                                                                                                                                
                                                                                                                                                        id9= new JLabel("Documents Submitted");
                                                                                                                                                        id9.setForeground(SystemColor.menu);
                                                                                                                                                        id9.setBounds(50,350,130,30);
                                                                                                                                                        id9.setFont(new Font("serif",Font.BOLD,20));
                                                                                                                                                        id15.add(id9);
                                                                                                                                                        
                                                                                                                                                        String course[] = {"Aadhar","Drivind Licence","Pan","Voter I'd"};
                                                                                                                                                        
                                                                                                                                                        c7 = new JComboBox(course);
                                                                                                                                                        c7.setBackground(Color.WHITE);
                                                                                                                                                        c7.setBounds(200,350,150,30);
                                                                                                                                                        id15.add(c7);
                                                                                                                                                        
                                                                                                                                                                
                                                                                                                                                                
                                                                                                                                                                
                                                                                                                                                                        id10= new JLabel("Aadhar No");
                                                                                                                                                                        id10.setForeground(SystemColor.menu);
                                                                                                                                                                        id10.setBounds(400,350,100,30);
                                                                                                                                                                        id10.setFont(new Font("serif",Font.BOLD,20));
                                                                                                                                                                        id15.add(id10);  
                                                                                                                                                                        
                                                                                                                                                                       
                                                                                                                                                                        t10=new JTextField();
                                                                                                                                                                        t10.setBounds(600,350,150,30);
                                                                                                                                                                        id15.add(t10);
                                                                                         
                                                                                                                                                                
                                                                                                                                                                                
                                                                                                                                                                                        
                                                                                                                                                                                        lab=new JLabel("Plant");
                                                                                                                                                                                        lab.setForeground(SystemColor.menu);
                                                                                                                                                                                        lab.setBounds(50,400,150,30);
                                                                                                                                                                                        lab.setFont(new Font("serif",Font.BOLD,20));
                                                                                                                                                                                        id15.add(lab);
                                                                                                                                                                                        
                                                                                                                                                                                        String plant[] = {"",""};
                                                                                                                                                                                        c1 = new JComboBox(plant);
                                                                                                                                                                                        c1.setBackground(Color.WHITE);
                                                                                                                                                                                        c1.setBounds(200,400,150,30);
                                                                                                                                                                                        id15.add(c1);
                                                                                                                                                                                        
                                                                                                                                                                                        lab2=new JLabel("Department");
                                                                                                                                                                                        lab2.setForeground(SystemColor.menu);
                                                                                                                                                                                        lab2.setBounds(400,400,150,30);
                                                                                                                                                                                        lab2.setFont(new Font("serif",Font.BOLD,20));
                                                                                                                                                                                        id15.add(lab2);
                                                                                                                                                                                        String branch[] = {"","","",};
                                                                                                                                                                                        c2 = new JComboBox(branch);
                                                                                                                                                                                        c2.setBackground(Color.WHITE);
                                                                                                                                                                                        c2.setBounds(600,400,150,30);
                                                                                                                                                                                        id15.add(c2);
                                                                                                                                                                                                
                                                                                                                                                                                                b = new JButton("Submit");
                                                                                                                                                                                                b.setBackground(Color.BLACK);
                                                                                                                                                                                                b.setForeground(Color.WHITE);
                                                                                                                                                                                                b.setBounds(250,550,150,40);
                                                                                                                                                                                                
                                                                                                                                                                                                id15.add(b);
                                                                                                                                                                                                
                                                                                                                                                                                                        b1=new JButton("Cancel");   
                                                                                                                                                                                                        b1.setBackground(Color.BLACK);
                                                                                                                                                                                                        b1.setForeground(Color.WHITE);
                                                                                                                                                                                                        b1.setBounds(450,550,150,40);
                                                                                                                                                                                                        
                                                                                                                                                                                                        id15.add(b1);
                                                                                                                                                                                                        
                                                                                                                                                                                                        b.addActionListener(this);
                                                                                                                                                                                                        b1.addActionListener(this);
        
        
        final JPanel jPanelCamera = new JPanel();
        jPanelCamera.setBounds(33, 25, 99, 77);
        
        JTabbedPanel = new JTabbedPane(JTabbedPane.TOP);
        JTabbedPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
        JTabbedPanel.setBounds(0, 0, 164, 149);
        f.getContentPane().add(JTabbedPanel);
        JTabbedPanel.addTab("Camera", jPanelCamera);
        
        Webcam webcam = Webcam.getDefault();
        webcam.open();
          
        
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
        f.getContentPane().setBackground(Color.WHITE);
                
                WebcamPanel webcamPanel = new WebcamPanel(webcam);
                webcamPanel.setFPSDisplayed(true);
            	webcamPanel.setDisplayDebugInfo(true);
            	webcamPanel.setImageSizeDisplayed(true);
            	webcamPanel.setMirrored(true);
            	
            	jPanelCamera.add(webcamPanel);
            	
        JButton button = new JButton(new AbstractAction("Capture"){
        	
        	private static final long serialVersionUID = 1L;
         
        	public void actionPerformed(ActionEvent e) {
           		try {
   					String name = String.format("Guard-%d.jpg", System.currentTimeMillis());
   					ImageIO.write(webcam.getImage(),"JPG", new File(name));
        			System.out.format("File %s has been saved\n", name);
        			webcamPanel.pause();
       			} catch (IOException t) {
     				t.printStackTrace();
        				}
        			}
        		});	
        webcamPanel.add(button);
        
                      button.setText("Capture");
                      
                       button.setActionCommand("Take Snapshot Now");
            	jPanelCamera.getParent().revalidate();
    }

    public void actionPerformed(ActionEvent ae){
        
        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k = (String)c1.getSelectedItem();
        String l = t11.getText();
        String m = (String)c2.getSelectedItem();
        
        if(ae.getSource() == b){
            try{
                conn cc = new conn();
                String q = "insert into Guard values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Guard Details Inserted Successfully");
                f.setVisible(false);
                
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            new Dashboard().setVisible(true);
        }
    }
    public static void main(String[] arg){
        new AddGuard().f.setVisible(true);
    }
}