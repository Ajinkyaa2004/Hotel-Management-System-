package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRoom extends JFrame implements ActionListener {
    JCheckBox checkBox;
    Choice choice;
    JTable table;
    JButton add, back;


    SearchRoom(){
        JPanel panel=new JPanel();
        panel.setBackground(Color.orange);
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);

        JLabel searchForRoom =new JLabel("Search For Room");
        searchForRoom.setBounds(250,11,186,31);
        searchForRoom.setForeground(Color.black);
        searchForRoom.setFont(new Font("Tahuma",Font.BOLD,20));
        panel.add(searchForRoom);

        JLabel rbt =new JLabel("Room Bed Type:" );
        rbt.setBounds(50,66,120,25);
        rbt.setForeground(Color.black);
        rbt.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(rbt);

        JLabel rn =new JLabel("Room Number" );
        rn.setBounds(23,162,120,25);
        rn.setForeground(Color.black);
        rn.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(rn);

        JLabel available =new JLabel("Availability" );
        available.setBounds(175,162,150,25);
        available.setForeground(Color.black);
        available.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(available);

        JLabel ss=new JLabel("Clean Status" );
        ss.setBounds(306,162,150,25);
        ss.setForeground(Color.black);
        ss.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(ss);

        JLabel price=new JLabel("Price" );
        price.setBounds(458,162,150,25);
        price.setForeground(Color.black);
        price.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(price);

        JLabel bt=new JLabel("Bed Type" );
        bt.setBounds(580,162,150,25);
        bt.setForeground(Color.black);
        bt.setFont(new Font("Tahuma",Font.BOLD,14));
        panel.add(bt);


        checkBox=new JCheckBox("Only Display Available");
        checkBox.setBounds(400,69,205,23);
        checkBox.setForeground(Color.black);
        checkBox.setBackground(Color.orange);
        panel.add(checkBox);

        choice=new Choice();
        choice.add("Single Bed");
        choice.add("Double Bed");
        choice.setBounds(175,70,120,20);
        panel.add(choice);

        table=new JTable();
        table.setBounds(0,187,700, 150);
        table.setBackground(Color.orange);
        table.setForeground(Color.white);
        panel.add(table);

        try{
            con c=new con();
            String q="select * from room";
            ResultSet resultSet=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(Exception e){
            e.printStackTrace();

        }

        add=new JButton( "Search");
        add.setBounds(200,400,120,30);
        add.setBackground(Color.white);
        add.setForeground(Color.black);
        add.addActionListener(this);
        panel.add(add);

        back=new JButton( "Back");
        back.setBounds(380,400,120,30);
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.addActionListener(this);
        panel.add(back);




        setUndecorated(true);
        setSize(700,500);
        setLayout(null);
        setLocation(500,200);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            String Q="select * from Room where bed_type ='"+choice.getSelectedItem()+"'";
            String Q1="select * from Room where availability ='Available'  And bed_type='"+choice.getSelectedItem()+"'";

             try{
                 con c=new con();
                 ResultSet resultSet= c.statement.executeQuery(Q);
                 table.setModel(DbUtils.resultSetToTableModel(resultSet));

                 if(checkBox.isSelected()){
                     ResultSet resultSet1=c.statement.executeQuery(Q1);
                     table.setModel(DbUtils.resultSetToTableModel(resultSet1));
                 }

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
        new SearchRoom();


    }
}
