package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ManagerInfo extends JFrame {

    ManagerInfo(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(Color.orange);
        panel.setLayout(null);
        add(panel);

        JTable table=new JTable();
        table.setBounds( 10,34,980,450);
        table.setForeground(Color.black);
        table.setBackground(Color.orange);
        panel.add(table);

        try {
            con c=new con();
            String q= "select * from employee where job = 'Manager'";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        }
        catch(Exception e){
            e.printStackTrace( );

        }



        JButton back=new JButton("Back");
        back.setBounds(350,500,120,30);
        back.setBackground(Color.white);
        back.setForeground(Color.BLACK);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel name=new JLabel("Name");
        name.setBounds(41,11,70,19);
        name.setForeground(Color.black);
        name.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(name);

        JLabel age=new JLabel("Age");
        age.setBounds(159,11,70,19);
        age.setForeground(Color.black);
        age.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(age);

        JLabel gender=new JLabel("Gender");
        gender.setBounds(273,11,70,19);
        gender.setForeground(Color.black);
        gender.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(gender);

        JLabel job=new JLabel("Job");
        job.setBounds(416,11,70,19);
        job.setForeground(Color.black);
        job.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(job);

        JLabel salary=new JLabel("Salary");
        salary.setBounds(536,11,70,19);
        salary.setForeground(Color.black);
        salary.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(salary);

        JLabel phone=new JLabel("Phone");
        phone.setBounds(656,11,70,19);
        phone.setForeground(Color.black);
        phone.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(phone);

        JLabel gmail=new JLabel("Gmail");
        gmail.setBounds(786,11,70,19);
        gmail.setForeground(Color.black);
        gmail.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(gmail);

        JLabel aadhar=new JLabel("Aadhar ");
        aadhar.setBounds(896,11,70,19);
        aadhar.setForeground(Color.black);
        aadhar.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(aadhar);

        setUndecorated(true);
        setSize(1000,600);
        setVisible(true);
        setLayout(null);
        setLocation(430,100);


    }
    public static void main(String[] args) {
        new ManagerInfo();

    }
}
