/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ms1cp2manual;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextArea;
/**
 * 
 *
 * @author Marlon Bautista
 */
public class MS1CP2MANUAL {
   
       
         /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //User Input
      
    //int EmpNumber;
    //EmpNumber = int.parseDouble(TFEmpNum.getText());
     
        
     //LABEL
     JLabel label1 = new JLabel("Employee Details");
     label1.setBounds (20,15,200,100); 
     label1.setFont(new Font("serif",Font.BOLD,20));  
     
     JLabel IDNum = new JLabel("Employee Number");
     IDNum.setBounds (30,70,200,100); 
     IDNum.setFont(new Font("calibri",Font.BOLD,17)); 
     
     JLabel LName = new JLabel("Last Name");
     LName.setBounds (30,110,200,100); 
     LName.setFont(new Font("calibri",Font.BOLD,17)); 
     
     JLabel FName = new JLabel("First Name");
     FName.setBounds (30,150,200,100); 
     FName.setFont(new Font("calibri",Font.BOLD,17)); 
     
     JLabel BDay = new JLabel("Birthday");
     BDay.setBounds (30,190,200,100); 
     BDay.setFont(new Font("calibri",Font.BOLD,17)); 
     
     JLabel Add = new JLabel("Address");
     Add.setBounds (30,230,200,100); 
     Add.setFont(new Font("calibri",Font.BOLD,17)); 
     
     JLabel Phone = new JLabel("Phone Number");
     Phone.setBounds (30,330,200,100); 
     Phone.setFont(new Font("calibri",Font.BOLD,17));
     
     JLabel SSS = new JLabel("SSS Number");
     SSS.setBounds (30,370,200,100); 
     SSS.setFont(new Font("calibri",Font.BOLD,17));
     
     JLabel PH = new JLabel("Philhealth Number");
     PH.setBounds (30,410,200,100); 
     PH.setFont(new Font("calibri",Font.BOLD,17));
     
     JLabel TIN = new JLabel("TIN");
     TIN.setBounds (30,450,200,100); 
     TIN.setFont(new Font("calibri",Font.BOLD,17));
     
     JLabel Pagibig = new JLabel("Pagibig Number");
     Pagibig.setBounds (30,490,200,100); 
     Pagibig.setFont(new Font("calibri",Font.BOLD,17));
     
     JLabel Position = new JLabel("Position");
     Position.setBounds (410,70,200,100); 
     Position.setFont(new Font("calibri",Font.BOLD,17)); 
     
     JLabel Status = new JLabel("Status");
     Status.setBounds (410,110,200,100); 
     Status.setFont(new Font("calibri",Font.BOLD,17)); 
     
     JLabel Salary = new JLabel("Basic Salary");
     Salary.setBounds (410,150,200,100); 
     Salary.setFont(new Font("calibri",Font.BOLD,17));
     
     JLabel Rice = new JLabel("Rice Subsidy");
     Rice.setBounds (410,195,200,100); 
     Rice.setFont(new Font("calibri",Font.BOLD,17));
     
     JLabel PhoneA = new JLabel("Phone Allowance");
     PhoneA.setBounds (410,210,200,100); 
     PhoneA.setFont(new Font("calibri",Font.BOLD,17));
     
     JLabel Clothing = new JLabel("Clothing Allowance");
     Clothing.setBounds (410,235,200,100); 
     Clothing.setFont(new Font("calibri",Font.BOLD,17));
     
     JLabel Semi = new JLabel("Semi Monthly Rate");
     Semi.setBounds (410,275,200,100); 
     Semi.setFont(new Font("calibri",Font.BOLD,17));
     
     JLabel HourlyR = new JLabel("Hourly Rate");
     HourlyR.setBounds (410,315,200,100); 
     HourlyR.setFont(new Font("calibri",Font.BOLD,17));
     
             
     //TextField     
     JTextField TFEmpNum = new JTextField ();
     TFEmpNum.setBounds (180,110,200,25);
        
     
     JTextField TFLastName = new JTextField ();
     TFLastName.setBounds (180,150,200,25);
     
     JTextField TFFirstName = new JTextField ();
     TFFirstName.setBounds (180,190,200,25);
     
     JTextField TFBDay = new JTextField ();
     TFBDay.setBounds (180,230,200,25);
     
     JTextField TFAdd = new JTextField ();
     TFAdd.setBounds (180,270,200,75);
     
     JTextField TFPhone = new JTextField ();
     TFPhone.setBounds (180,360,200,25);
     
     JTextField TFSSS = new JTextField ();
     TFSSS.setBounds (180,400,200,25);
     
     JTextField TFPhealth = new JTextField ();
     TFPhealth.setBounds (180,440,200,25);
     
     JTextField TFTin = new JTextField ();
     TFTin.setBounds (180,480,200,25);
     
     JTextField TFPag = new JTextField ();
     TFPag.setBounds (180,520,200,25);
          
     JTextField TFPosition = new JTextField ();
     TFPosition.setBounds (510,110,200,25);
         
     JTextField TFStatus = new JTextField ();
     TFStatus.setBounds (510,150,200,25);
     
     JTextField TFSalary = new JTextField ();
     TFSalary.setBounds (510,190,200,25);
     
     JTextField TFRice = new JTextField ();
     TFRice.setBounds (570,230,138,25);  
     
     JTextField TFClothing = new JTextField ();
     TFClothing.setBounds (570,270,138,25);
     
     JTextField TFSemiMo = new JTextField ();
     TFSemiMo.setBounds (570,310,138,25);
     
     JTextField TFHourlyR = new JTextField ();
     TFHourlyR.setBounds (570,350,138,25);
     
        
    //JTextField TFSalary = new JTextField ();
     TFSalary.setBounds (510,190,200,25);
     
    //JTabbebPane
    JTabbedPane JTPane1 = new JTabbedPane();
    JTPane1.setBounds(20,90,935,500);
     
    JTabbedPane JTPane2 = new JTabbedPane();
    JTPane2.setBounds(735,110,200,200);
    JLabel JLPane2 = new JLabel("UPLOAD PICTURE");
    JLPane2.setBounds(780,100,200,200);
    
    //JTextArea
     JTextArea JTComment = new JTextArea ();
     JTComment.setBounds (410,400,525,150);
     JLabel JLTBOX = new JLabel("SPECIAL INSTRUCTION TEXTBOX");
     JLTBOX.setBounds(580,350,200,80);
     JLTBOX.setFont(new Font("calibri",Font.ITALIC,12));
     
          
    //Button
    JButton ValidateEmpNum = new JButton("Inquiry");
    ValidateEmpNum.setBounds(363,60,100,25);
         
    JButton JBAdd = new JButton("Add");
    JBAdd.setBounds (462,60,100,25);
    
    JButton JBUpdate = new JButton("Update");
    JBUpdate.setBounds (560,60,100,25);
       
    JButton JBClear = new JButton("Clear");
    JBClear.setBounds(655,60,100,25);
    
      
    JButton JBDelete = new JButton("Delete");
    JBDelete.setBounds(755,60,100,25);
    
    JButton JBSave = new JButton("Save");
    JBSave.setBounds(855,60,100,25);
    
              
       
    //MAIN FRAME  
      JFrame frame = new JFrame();
      frame.setSize(1000,650);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("MotorPH Employee MIS");
      
           
      //label setting
      frame.add(label1);
      frame.add(IDNum);
      frame.add(LName);
      frame.add(FName);
      frame.add(BDay);
      frame.add(Add);
      frame.add(Phone);
      frame.add(SSS);
      frame.add(PH);
      frame.add(TIN);
      frame.add(Pagibig);
      frame.add(Position);
      frame.add(Status);
      frame.add(Salary);
      frame.add(Rice);
      frame.add(Semi);
      frame.add(Clothing);
      frame.add(HourlyR);
      frame.add(JTPane1);
      frame.add(JTPane2);
      frame.add(JLPane2);
      frame.add (TFEmpNum);
      frame.add (TFLastName);
      frame.add (TFFirstName);
      frame.add (TFBDay);
      frame.add (TFAdd);
      frame.add (TFPhone);
      frame.add (TFSSS);
      frame.add (TFPhealth);
      frame.add (TFTin);
      frame.add (TFPag);
      frame.add (TFPosition);
      frame.add (TFPag);
      frame.add (TFPosition);
      frame.add (TFStatus);
      frame.add (TFSalary);
      frame.add (TFRice);
      frame.add (TFClothing);
      frame.add (TFSemiMo);
      frame.add (TFHourlyR);
      frame.add (JTComment);
      frame.add (JLTBOX);
      frame.add (ValidateEmpNum);
      frame.add (JBDelete);
      frame.add (JBSave);
      frame.add (JBClear);
        frame.add (JBAdd);
        frame.add (JBUpdate);
      frame.setLayout(null);
      
      
      
     
          
        
        
    }
    
}
