package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame {
    CustomerInfo(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(Color.orange);
        panel.setLayout(null);
        add(panel);

        JTable table=new JTable();
        table.setBounds(10,40,900,450);
        table.setBackground(Color.orange);
        table.setForeground(Color.black);
        panel.add(table);
         try{
             con c=new con();
             String q="select * from Customer";
             ResultSet resultSet=c.statement.executeQuery(q);
             table.setModel(DbUtils.resultSetToTableModel(resultSet));

         }
         catch(Exception e){
           e.printStackTrace();
         }

         JLabel id =new JLabel("ID");
         id.setBounds(31,11,100,14);
         id.setForeground(Color.black);
         id.setFont(new Font("Tahuma",Font.BOLD,14));
         panel.add(id);

        JLabel number =new JLabel("Number");
        number.setBounds(150,11,100,14);
        number.setForeground(Color.black);
        number.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(number);

        JLabel name =new JLabel("Name");
        name.setBounds(270,11,80,14);
        name.setForeground(Color.black);
        name.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(name);

        JLabel gender =new JLabel("Gender");
        gender.setBounds(360,11,100,14);
        gender.setForeground(Color.black);
        gender.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(gender);

        JLabel country =new JLabel("Country");
        country.setBounds(480,11,100,18);
        country.setForeground(Color.black);
        country.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(country);

        JLabel room =new JLabel("Room");
        room.setBounds(600,11,100,14);
        room.setForeground(Color.black);
        room.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(room);

        JLabel Time =new JLabel("CI Time");
        Time.setBounds(700,11,100,14);
        Time.setForeground(Color.black);
        Time.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(Time);

        JLabel Deposit =new JLabel("Deposit");
        Deposit.setBounds(800,11,100,18);
        Deposit.setForeground(Color.black);
        Deposit.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(Deposit);

        JButton back=new JButton("Back");
        back.setBounds(450,510,120,30);
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(back);

























        setUndecorated(true);
        setSize(900,600);
        setLocation(500,100);
        setVisible(true );
        setLayout(null);

    }
    public static void main(String[] args) {
        new CustomerInfo();

    }

}

