package Hotel.Management.System;

import com.mysql.cj.protocol.Resultset;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame  {
    JTable table;
    JButton back;

    Room(){
       JPanel panel =new JPanel();
       panel.setBounds(5,5,890,590);
       panel.setBackground(Color.orange);
       panel.setLayout(null);
       add(panel);


       ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/roomm.png"));
       Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
       ImageIcon imageIcon1=new ImageIcon(image);
       JLabel label=new JLabel(imageIcon1);
       label.setBounds( 600,200,200,200);
       panel.add(label);

       table=new JTable();
       table.setBounds(10,40,500,400);
       table.setBackground(Color.YELLOW);
       table.setForeground(Color.black);
       panel.add(table);

       try{
           con c = new con();
           String RoomInfo= "select * from room";
           ResultSet resultSet=c.statement.executeQuery(RoomInfo);
           table.setModel(DbUtils.resultSetToTableModel(resultSet));

       }catch(Exception e){
           e.printStackTrace();
       }
       back=new JButton("Back");
       back.setBackground(Color.white);
       back.setForeground(Color.BLACK);
       back.setBounds(200,500,120,30);
       panel.add(back);
       back.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               setVisible(false);
           }
       });


        JLabel Room =new JLabel("Room No.");
        Room.setBounds(15,15,85,19);
        Room.setForeground(Color.black);
        Room.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(Room);

        JLabel availability =new JLabel("Availability");
        availability.setBounds(115,15,85,19);
        availability.setForeground(Color.black);
        availability.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(availability);

        JLabel Clean =new JLabel(" Clean Status ");
        Clean.setBounds(211,15,100,19);
        Clean.setForeground(Color.black);
        Clean.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add( Clean);

        JLabel Price  =new JLabel(" Price");
        Price.setBounds(330,15,80,19);
        Price.setForeground(Color.black);
        Price.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add( Price);

        JLabel Bed  =new JLabel(" Bed Type");
        Bed.setBounds(417,15,80,19);
        Bed.setForeground(Color.black);
        Bed.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(Bed);




        setUndecorated(true);
        setLayout(null);
        setLocation(500,100);
        setSize(900,600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Room();
    }
}
