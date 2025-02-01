package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JTextField textField1;
    JPasswordField passwordField1;
    JButton b1,b2;

    Login() {
        JLabel label1 = new JLabel("Username:");
        label1.setBounds(20, 60, 100, 30);
        label1.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(label1);

        JLabel label2 = new JLabel("Password:");
        label2.setBounds(20, 110, 100, 30);
        label2.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(label2);

        textField1=new JTextField();
        textField1.setBounds(110,60,200,30);
        textField1.setForeground(Color.black);
        setFont(new Font("Tahuma",Font.PLAIN,15));
        textField1.setBackground(Color.white);
        add(textField1);

        passwordField1=new JPasswordField();
         passwordField1.setBounds(110,110,200,30);
         passwordField1.setForeground(Color.black);
        passwordField1.setBackground(Color.white);
        add(passwordField1);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/A.gif"));
        JLabel label=new JLabel(imageIcon);
        label.setBounds(345,-13,255,300);
        add(label);

        b1=new JButton("Login");
        b1.setBounds(40,180,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("Cancel");
        b2.setBounds(180,180,120  ,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.orange);
        label1.setForeground(Color.black);
        setLayout(null);
        setLocation(400, 270);
        setSize(600, 300);
        setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e){
       if(e.getSource() == b1){
         try{
              con c=new con();
              String user=textField1.getText();
              String pass=passwordField1.getText();

              String q="select * from login where username = '"+user+"'and password = '"+pass+"'";
             ResultSet resultSet = c.statement.executeQuery(q);
             if(resultSet.next()){
                 new Dashboard();
                 setVisible(false);
             }
             else{
                 JOptionPane.showMessageDialog(null,"Invalid Credentials");
             }
         }
         catch(Exception E){
             E.printStackTrace();
         }
       }else{
           System.exit(102);
       }
    }
    public static void main(String[] args) {
        new Login();
    }
}