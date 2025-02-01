package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {

    JButton add_Employee, add_Room, add_Drivers, Logout, back;
    Admin(){
        add_Employee=new JButton("ADD EMPLOYEE");
        add_Employee.setBounds(250,230,200,30);
        add_Employee.setBackground(Color.white);
        add_Employee.setForeground(Color.BLACK);
        add_Employee.setFont(new Font("Tahuma",Font.BOLD,15));
        add_Employee.addActionListener(this);
        add(add_Employee);

        add_Room=new JButton("ADD ROOM");
        add_Room.setBounds(250,380,200,30);
        add_Room.setBackground(Color.white);
        add_Room.setForeground(Color.BLACK);
        add_Room.setFont(new Font("Tahuma",Font.BOLD,15));
        add_Room.addActionListener(this);
        add(add_Room);

        add_Drivers=new JButton("ADD DRIVERS");
        add_Drivers.setBounds(250,530,200,30);
        add_Drivers.setBackground(Color.white);
        add_Drivers.setForeground(Color.BLACK);
        add_Drivers.setFont(new Font("Tahuma",Font.BOLD,15));
        add_Drivers.addActionListener(this);
        add(add_Drivers);

        Logout=new JButton("LOG OUT");
        Logout.setBounds(10,800,95,30);
        Logout.setBackground(Color.white);
        Logout.setForeground(Color.BLACK);
        Logout.setFont(new Font("Tahuma",Font.BOLD,15));
        Logout.addActionListener(this);
        add( Logout);

        back=new JButton("BACK");
        back.setBounds(110,800 ,95,30);
        back.setBackground(Color.white);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tahuma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);

        ImageIcon l1= new ImageIcon(ClassLoader.getSystemResource("Icons/employees.png"));
        Image l11=l1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon= new ImageIcon(l11);
        JLabel label=new JLabel(imageIcon);
        label.setBounds( 70,180,120,120);
        add(label);


        ImageIcon imageIcon1= new ImageIcon(ClassLoader.getSystemResource("Icons/room.png"));
        Image image= imageIcon1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11= new ImageIcon(image);
        JLabel label1=new JLabel(imageIcon11);
        label1.setBounds( 70,340,120,120);
        add(label1);

        ImageIcon imageIcon2= new ImageIcon(ClassLoader.getSystemResource("Icons/driver.png"));
        Image image1= imageIcon2 .getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon12= new ImageIcon(image1);
        JLabel label2=new JLabel(imageIcon12);
        label2.setBounds( 70,500 ,120,120);
        add(label2);


        ImageIcon imageIcon3= new ImageIcon(ClassLoader.getSystemResource("Icons/cccc.gif"));
        Image image2 = imageIcon3 .getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon13 = new ImageIcon(image2);
        JLabel label3=new JLabel(imageIcon13);
        label3.setBounds( 800,200,400,400);
        add(label3);


        getContentPane().setBackground(Color.orange);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add_Employee){
            new AddEmployee();

        }
        else if(e.getSource()==add_Room){
            new Addroom();

        }
        else if(e.getSource()==add_Drivers) {
            new AddDriver();

        }
        else if(e.getSource()==Logout){
            System.exit(102);
        }
        else if(e.getSource()==back){
            new Dashboard();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Admin();

    }
}
