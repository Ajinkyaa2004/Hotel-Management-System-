package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame  {

    Reception(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,2,1238,900);
        panel.setBackground(Color.white);
        add(panel);

        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(10,2,270,1000);
        panel1.setBackground(Color.orange);
        add(panel1);

        ImageIcon i111 =new ImageIcon(ClassLoader.getSystemResource( "icons/cccc.gif"));
        Image i22= i111  .getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 =new ImageIcon(i22);
        JLabel label11=new JLabel(imageIcon111);
        label11.setBounds(300,20,800,800);
        panel.add(label11 );

        JButton btnNCF = new JButton("New Customer Form");
        btnNCF.setBounds(30,30,210,35);
        btnNCF.setBackground(Color.BLACK);
        btnNCF.setForeground(Color.BLACK);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  try{

                  }
                  catch(Exception E){
                      E.printStackTrace();
                }
            }
        });
        JButton btnRoom = new JButton("Room");
        btnRoom.setBounds(30,70,210,35);
        btnRoom.setBackground(Color.BLACK);
        btnRoom.setForeground(Color.BLACK);
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Room();
                }
                catch(Exception E){
                    E.printStackTrace();
                }
            }
        });
        JButton btnDepartment = new JButton("Department");
        btnDepartment.setBounds(30,110,210,35);
        btnDepartment.setBackground(Color.BLACK);
        btnDepartment.setForeground(Color.BLACK);
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Department();
                }
                catch(Exception E){
                    E.printStackTrace();
                }
            }
        });
        JButton btnAEI = new JButton("All Employe Information ");
        btnAEI.setBounds(30,150,210,35);
        btnAEI.setBackground(Color.BLACK);
        btnAEI.setForeground(Color.BLACK);
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Employee();
                }
                catch(Exception E){
                    E.printStackTrace();
                }
            }
        });
        JButton btnCI = new JButton("Customer Information");
        btnCI.setBounds(30,190,210,35);
        btnCI.setBackground(Color.BLACK);
        btnCI.setForeground(Color.BLACK);
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new CustomerInfo();
 
                }
                catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnMI = new JButton("Manager Information");
        btnMI.setBounds(30,230,210,35);
        btnMI.setBackground(Color.BLACK);
        btnMI.setForeground(Color.BLACK);
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new ManagerInfo();

                }
                catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCQ = new JButton("Check Out");
        btnCQ.setBounds(30,270,210,35);
        btnCQ.setBackground(Color.BLACK);
        btnCQ.setForeground(Color.BLACK);
        panel1.add(btnCQ);
        btnCQ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                }
                catch(Exception E){
                    E.printStackTrace();
                }
            }
        });
        JButton btnUC = new JButton("Update Check Inn Details");
        btnUC.setBounds(30,310,210,35);
        btnUC.setBackground(Color.BLACK);
        btnUC.setForeground(Color.BLACK);
        panel1.add(btnUC);
        btnUC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                }
                catch(Exception E){
                    E.printStackTrace();
                }
            }
        });
        JButton btnURS = new JButton("Update Room Status");
        btnURS.setBounds(30,350,210,35);
        btnURS.setBackground(Color.BLACK);
        btnURS.setForeground(Color.BLACK);
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                }
                catch(Exception E){
                    E.printStackTrace();
                }
            }
        });
        JButton btnPUS = new JButton("Pickup Service");
        btnPUS.setBounds(30,390,210,35);
        btnPUS.setBackground(Color.BLACK);
        btnPUS.setForeground(Color.BLACK);
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                }
                catch(Exception E){
                    E.printStackTrace();
                }
            }
        });
        JButton btnSR = new JButton("Search Room");
        btnSR.setBounds(30,430,210,35);
        btnSR.setBackground(Color.BLACK);
        btnSR.setForeground(Color.BLACK);
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new SearchRoom();


                }
                catch(Exception E){
                    E.printStackTrace();
                }
            }
        });
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);

}
    public static void main(String[] args) {
        new Reception();
}
}