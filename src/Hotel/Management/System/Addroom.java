package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addroom extends JFrame implements ActionListener {
    JTextField t2,t4 ;
    JComboBox t3,t5,t6;
    JButton b1,b2;

    Addroom(){

        JPanel panel = new JPanel();
            panel.setBounds(5,5,875,490);
            panel.setBackground(Color.ORANGE);
            panel.setLayout(null);
            add(panel);
            JLabel l1=new JLabel("Add Rooms");
            l1.setBounds(205,10,160,22);
            l1.setFont(new Font("Tahuma" ,Font.BOLD,22));
            l1.setForeground(Color.BLACK);
            panel.add(l1);

            JLabel l2= new JLabel("Room Number");
            l2.setBounds(64,70,152,22);
            l2.setFont(new Font("Tahuma",Font.BOLD,14));
            l2.setForeground(Color.BLACK);
            panel.add(l2);

            t2=new JTextField();
            t2.setBounds(200,70,156,22);
            t2.setFont(new Font("Tahuma" ,Font.PLAIN,15));
            t2.setForeground(Color.BLACK);
            t2.setBackground(Color.white);
            panel.add(t2);


            JLabel l3 = new JLabel("Availability");
            l3.setBounds(64,110,152,22);
            l3.setFont(new Font("Tahuma",Font.BOLD,14));
            l3.setForeground(Color.BLACK);
            panel.add(l3);
            t3=new JComboBox(new String[] {"Available","Occupied"});
            t3.setBounds(200,110,156,22);
            t3.setFont(new Font("Tahuma" ,Font.PLAIN,15));
            t3.setForeground(Color.BLACK);
            t3.setBackground(Color.white);
            panel.add(t3);

        JLabel l4 = new JLabel("Price");
        l4.setBounds(64,150,152,22);
        l4.setFont(new Font("Tahuma",Font.BOLD,14));
        l4.setForeground(Color.BLACK);
        panel.add(l4);
        t4=new JTextField();
        t4.setBounds(200,150,156,22);
        t4.setFont(new Font("Tahuma" ,Font.PLAIN,15));
        t4.setForeground(Color.BLACK);
        t4.setBackground(Color.white);
        panel.add(t4);

        JLabel l5= new JLabel("Cleaning Status");
        l5.setBounds(64,190,152,22);
        l5.setFont(new Font("Tahuma",Font.BOLD,14));
        l5.setForeground(Color.BLACK);
        panel.add(l5);
        t5=new JComboBox(new String[] {"Cleaned","Dirty"});
        t5.setBounds(200,190,156,22);
        t5.setFont(new Font("Tahuma" ,Font.PLAIN,15));
        t5.setForeground(Color.BLACK);
        t5.setBackground(Color.white);
        panel.add(t5);

        JLabel l6= new JLabel("Bed Type");
        l6.setBounds(64,230,152,22);
        l6.setFont(new Font("Tahuma",Font.BOLD,14));
        l6.setForeground(Color.BLACK);
        panel.add(l6);
        t6=new JComboBox(new String[] {"Single Bed","Double Bed"});
        t6.setBounds(200,230,156,22);
        t6.setFont(new Font("Tahuma" ,Font.PLAIN,15));
        t6.setForeground(Color.BLACK);
        t6.setBackground(Color.white);
        panel.add(t6);

        b1=new JButton("Add");
        b1.setBounds(64,321,111,33);
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        panel.add(b1);

        b2=new JButton("Back");
        b2.setBounds(198,321,111,33);
        b2.setBackground(Color.white);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/roomser.png"));
        Image image=imageIcon .getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label=new JLabel( imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);


        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(885,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            try {
                con c = new con ();
                String room =t2.getText();
                String ava= (String)t3.getSelectedItem();
                String status=(String) t5.getSelectedItem();
                String price=t4.getText();
                String type= (String)t6.getSelectedItem();

                String q="insert into room values('"+ room+"', '"+ ava+"','"+status+"','"+price +"','"+type+"')" ;
                c .statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Room Successfully Added");
                this.setVisible(false);
            }
            catch(Exception E){
                E.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Addroom();
    }
}
