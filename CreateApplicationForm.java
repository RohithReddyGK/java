//This programme demonstrates about creating an 'Application Form'.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class CreateApplicationForm extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame f=new JFrame("Application Form.");
        ImageIcon i=new ImageIcon("C:\\Users\\Varun\\OneDrive\\Pictures\\application logo.png");
        Image resize=i.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
        ImageIcon resizedIcon=new ImageIcon(resize);
        JLabel l=new JLabel("APPLICATION FORM",resizedIcon,JLabel.LEFT);
        l.setBounds(320,5,300,60);
        JLabel l1=new JLabel("Personal details:");
        l1.setBounds(150,60,200,20);
        JLabel l2=new JLabel("First name:");
        l2.setBounds(100,90,200,20);
        JTextField t2=new JTextField("First Name:",20);
        t2.setBounds(100,120,200,20);
        JLabel l3=new JLabel("Middle name:");
        l3.setBounds(100,150,200,20);
        JTextField t3=new JTextField("Middle Name:",20);
        t3.setBounds(100,180,200,20);
        JLabel l4=new JLabel("Lat/Surname:");
        l4.setBounds(100,210,200,20);
        JTextField t4=new JTextField("Lat Name:",5);
        t4.setBounds(100,240,200,20);
        JLabel l5=new JLabel("Date Of Birth:");
        l5.setBounds(100,270,200,20);
        String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        JComboBox cb1=new JComboBox(date);
        cb1.setBounds(100,300,50,20);
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        JComboBox cb2=new JComboBox(months);
        cb2.setBounds(160,300,100,20);
        String years[]={"2000","2001","2002","2003","2004","2006","2006","2007","2008","2009","2010"};
        JComboBox cb3=new JComboBox(years);
        cb3.setBounds(270,300,60,20);
        JLabel l6=new JLabel("Gender:");
        l6.setBounds(100,330,200,20);
        JRadioButton Rb1=new JRadioButton();
        Rb1.setText("Male");
        Rb1.setBounds(100,360,70,20);
        JRadioButton Rb2=new JRadioButton();
        Rb2.setText("Female");
        Rb2.setBounds(170,360,90,20);
        JRadioButton Rb3=new JRadioButton();
        Rb3.setText("Transgender");
        Rb3.setBounds(260,360,130,20);
        JLabel l7=new JLabel("Email ID:");
        l7.setBounds(100,390,200,20);
        JTextField t7=new JTextField("abc@gmail.com",30);
        t7.setBounds(100,420,200,20);
        JLabel l8=new JLabel("Phone Number:");
        l8.setBounds(100,450,200,20);
        JTextField t8=new JTextField("like:1234567890",10);
        t8.setBounds(100,480,200,20);
        JLabel l9=new JLabel("Parent details:");
        l9.setBounds(100,510,200,20);
        JLabel l10=new JLabel("Mother name:");
        l10.setBounds(100,540,200,20);
        JTextField t10=new JTextField("Mother Name",20);
        t10.setBounds(100,570,200,20);
        JLabel l11=new JLabel("Father name:");
        l11.setBounds(100,600,200,20);
        JTextField t11=new JTextField("Father Name:",20);
        t11.setBounds(100,630,200,20);
        JLabel l12=new JLabel("Education:");
        l12.setBounds(550,60,200,20);
        JLabel l13=new JLabel("PU College name:");
        l13.setBounds(500,90,200,20);
        JTextField t13=new JTextField("College Name:",30);
        t13.setBounds(500,120,200,20);
        JLabel l14=new JLabel("Percentage:");
        l14.setBounds(500,150,200,20);
        JTextField t14=new JTextField("like:80%",5);
        t14.setBounds(500,180,200,20);
        JLabel l15=new JLabel("Currently pursuing course:");
        l15.setBounds(500,210,200,20);
        JRadioButton Rb4=new JRadioButton();
        Rb4.setText("U-G");
        Rb4.setBounds(500,240,60,20);
        JRadioButton Rb5=new JRadioButton();
        Rb5.setText("P-G");
        Rb5.setBounds(570,240,60,20);
        JRadioButton Rb6=new JRadioButton();
        Rb6.setText("PHD");
        Rb6.setBounds(640,240,60,20);
        JLabel l16=new JLabel("Current College name:");
        l16.setBounds(500,270,200,20);
        JTextField t16=new JTextField("College Name:",30);
        t16.setBounds(500,300,200,20);
        JLabel l17=new JLabel("Year Of Admission:");
        l17.setBounds(500,330,200,20);
        String adyears[]={"2020","2021","2022","2023","2024"};
        JComboBox cb4=new JComboBox(adyears);
        cb4.setBounds(500,360,200,20);
        JLabel l18=new JLabel("USN:");
        l18.setBounds(500,390,100,20);
        JTextField t18=new JTextField("like:1ab12is000",10);
        t18.setBounds(500,420,200,20);
        JLabel l19=new JLabel("Current semester:");
        l19.setBounds(500,450,200,20);
        String sem[]={"1","2","3","4","5","6","7","8"};
        JComboBox cb5=new JComboBox(sem);
        cb5.setBounds(500,480,200,20);
        JLabel l20=new JLabel("Previous semester SGPA:");
        l20.setBounds(500,510,200,20);
        JRadioButton Rb7=new JRadioButton();
        Rb7.setText("7.0 - 7.5");
        Rb7.setBounds(500,540,80,20);
        JRadioButton Rb8=new JRadioButton();
        Rb8.setText("7.6 - 8.0");
        Rb8.setBounds(590,540,80,20);
        JRadioButton Rb9=new JRadioButton();
        Rb9.setText("8.1 - 8.5");
        Rb9.setBounds(680,540,80,20);
        JRadioButton Rb10=new JRadioButton();
        Rb10.setText("8.6 - 9.0");
        Rb10.setBounds(770,540,80,20);
        JRadioButton Rb11=new JRadioButton();
        Rb11.setText("9.1 - 9.5");
        Rb11.setBounds(860,540,80,20);
        JRadioButton Rb12=new JRadioButton();
        Rb12.setText("9.6 - 10.0");
        Rb12.setBounds(950,540,80,20);
        JLabel l21=new JLabel("Subjects you have studied:");
        l21.setBounds(500,570,200,20);
        JCheckBox c1=new JCheckBox("IOT");
        c1.setBounds(500,600,60,20);
        JCheckBox c2=new JCheckBox("C++");
        c2.setBounds(590,600,80,20);
        JCheckBox c3=new JCheckBox("C");
        c3.setBounds(680,600,60,20);
        JCheckBox c4=new JCheckBox("Python");
        c4.setBounds(770,600,70,20);
        JCheckBox c5=new JCheckBox("HTML");
        c5.setBounds(860,600,80,20);
        JCheckBox c6=new JCheckBox("DS");
        c6.setBounds(500,630,60,20);
        JCheckBox c7=new JCheckBox("DBMS");
        c7.setBounds(590,630,80,20);
        JCheckBox c8=new JCheckBox("Java");
        c8.setBounds(680,630,60,20);
        JCheckBox c9=new JCheckBox("ADA");
        c9.setBounds(770,630,70,20);
        JCheckBox c10=new JCheckBox("Flutter");
        c10.setBounds(860,630,80,20);
        JButton b1=new JButton("Save");
        b1.setBounds(100,700,150,40);
        JButton b2=new JButton("Submit");
        b2.setBounds(340,700,150,40);
        JButton b3=new JButton("Cancel");
        b3.setBounds(550,700,150,40);
        b1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.out.println("Application is saved.");
            }
        });
        b2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.out.println("\nApplication submitted successfully.");
            }
        });
        b3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.out.println("\nYour Application is canceled.\nKindly re-submit your Application.");
            }
        });
        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.add(l10);
        f.add(l11);
        f.add(l12);
        f.add(l13);
        f.add(l14);
        f.add(l15);
        f.add(l16);
        f.add(l17);
        f.add(l18);
        f.add(l19);
        f.add(l20);
        f.add(l21);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t7);
        f.add(t8);
        f.add(t10);
        f.add(t11);
        f.add(t13);
        f.add(t14);
        f.add(t16);
        f.add(t18);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(cb5);
        ButtonGroup bg=new ButtonGroup();
        ButtonGroup bg1=new ButtonGroup();
        ButtonGroup bg2=new ButtonGroup();
        bg.add(Rb1);
        bg.add(Rb2);
        bg.add(Rb3);
        bg1.add(Rb4);
        bg1.add(Rb5);
        bg1.add(Rb6);
        bg2.add(Rb7);
        bg2.add(Rb8);
        bg2.add(Rb9);
        bg2.add(Rb10);        
        bg2.add(Rb11);
        bg2.add(Rb12);
        f.add(Rb1);
        f.add(Rb2);
        f.add(Rb3);
        f.add(Rb4);
        f.add(Rb5);
        f.add(Rb6);
        f.add(Rb7);
        f.add(Rb8);
        f.add(Rb9);
        f.add(Rb10);        
        f.add(Rb11);
        f.add(Rb12);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.add(c5);
        f.add(c6);
        f.add(c7);
        f.add(c8);
        f.add(c9);
        f.add(c10);
        f.setLayout(null);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setSize(1095,790);
        f.setVisible(true);
    }
}

