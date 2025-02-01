package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener {
    JComboBox combobox;
    JTextField textFieldNumber, TextName, TextCountry ,TextDeposite;
    JRadioButton r1 ,r2;
    Choice c1;
    JLabel date;
    JButton add, back;

    NewCustomer(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setLayout(null);
        panel.setBackground(Color.orange);
        add(panel);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel imglabel=new JLabel(imageIcon1);
        imglabel.setBounds(550,150,200,200);
        panel.add(imglabel);

        JLabel labelName=new JLabel(" New Customer Form");
        labelName.setBounds(118,11,260,53);
        labelName.setFont(new Font("Tahuma",Font.BOLD,20));
        labelName.setForeground(Color.black);
        panel.add(labelName);

         JLabel labelID=new JLabel("ID:");
         labelID.setBounds(35,76,200,16);
         labelID.setForeground(Color.BLACK);
         labelID.setFont(new Font("Tahuma",Font.PLAIN,14));
         panel.add(labelID);

         combobox=new JComboBox(new String[]{"Passport", "Aadhar Card", "Voter Id", "Driving License"});
         combobox.setBounds(271,75,150,20);
         combobox.setBackground(Color.orange);
         combobox.setForeground(Color.black);
         combobox.setFont(new Font("Tahuma",Font.PLAIN,14));
         panel.add(combobox);

        JLabel labelNumber=new JLabel("Number:");
        labelNumber.setBounds(35,111,200,16);
        labelNumber.setForeground(Color.BLACK);
        labelNumber.setFont(new Font("Tahuma",Font.PLAIN,14));
        panel.add(labelNumber);

        textFieldNumber=new JTextField();
        textFieldNumber.setBounds(271,111,150,20);
        panel.add(textFieldNumber);

        JLabel labelname=new JLabel("Name:");
        labelname.setBounds(35,151,200,16);
        labelname.setForeground(Color.BLACK);
        labelname.setFont(new Font("Tahuma",Font.PLAIN,14));
        panel.add(labelname);

        TextName=new JTextField();
        TextName.setBounds(271,151,150,20);
        panel.add(TextName);

        JLabel labelGender=new JLabel("Gender:");
        labelGender.setBounds(35,191,200,16);
        labelGender.setForeground(Color.BLACK);
        labelGender.setFont(new Font("Tahuma",Font.PLAIN,14));
        panel.add(labelGender);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Tahuma",Font.BOLD,14));
        r1.setForeground(Color.BLACK);
        r1.setBackground(Color.white);
        r1.setBounds(271,191,80,12);
        panel.add(r1);

        r2 =new JRadioButton("Female");
        r2 .setFont(new Font("Tahuma",Font.BOLD,14));
        r2 .setForeground(Color.BLACK);
        r2 .setBackground(Color.white);
        r2 .setBounds(350,191,90,12);
        panel.add(r2 );

        JLabel labelCountry=new JLabel("Country:");
        labelCountry.setBounds(35,231,200,16);
        labelCountry.setForeground(Color.BLACK);
        labelCountry.setFont(new Font("Tahuma",Font.PLAIN,14));
        panel.add(labelCountry);
        TextCountry=new JTextField();
        TextCountry.setBounds(271,231,150,20);
        panel.add(TextCountry);

        JLabel labelRoom=new JLabel("Allocated Room Number:");
        labelRoom.setBounds(35,274,200,16);
        labelRoom.setForeground(Color.BLACK);
        labelRoom.setFont(new Font("Tahuma",Font.PLAIN,14));
        panel.add(labelRoom);

        c1 = new Choice();

        try {
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("select * from room");
            while (resultSet.next()) {
                c1.add(resultSet.getString("roomnumber"));
            }
        } catch(Exception e){
            e.printStackTrace();

        }
        c1.setBounds(271,274,150,20);
        c1.setFont(new Font("Tahuma",Font.BOLD,14));
        c1.setForeground( Color.black);
        c1.setBackground(Color.orange);
        panel.add(c1);

        JLabel labelCIS=new JLabel("Checked Inn");
        labelCIS.setBounds(35,316,200,16);
        labelCIS.setForeground(Color.BLACK);
        labelCIS.setFont(new Font("Tahuma",Font.PLAIN,14));
        panel.add(labelCIS);

       Date date1=new Date();

        date=new JLabel(""+date1);
        date.setBounds(261,316,250,16);
        date.setForeground(Color.BLACK);
        date.setFont(new Font("Tahuma",Font.PLAIN,14));
        panel.add(date);

        JLabel labelDeposite=new JLabel("Deposite");
        labelDeposite.setBounds(35,359,200,16);
        labelDeposite.setForeground(Color.BLACK);
        labelDeposite.setFont(new Font("Tahuma",Font.PLAIN,14));
        panel.add(labelDeposite);
        TextDeposite=new JTextField();
        TextDeposite.setBounds(271,359,150,20);
        panel.add(TextDeposite);

        add=new JButton("Add");
        add.setBounds(100,430,120,30);
        add.setForeground(Color.BLACK);
        add.setBackground(Color.white);
        add.addActionListener(this);
        panel.add(add);

        back=new JButton("Back");
        back.setBounds(260,430,120,30);
        back.setForeground(Color.BLACK);
        back.setBackground(Color.white);
        back.addActionListener(this);
        panel.add(back);

        setLayout(null);
        setLocation(500,150);
        setSize(850,550);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==add){
           con c=new con();
           String radiobtn=null;

           if(r1.isSelected()){
               radiobtn="Male";
           }
           else if (r2.isSelected()) {
               radiobtn="Female";
           }
           String s1=(String)combobox.getSelectedItem();
           String s2=textFieldNumber.getText();
           String s3=TextName.getText();
           String s4=radiobtn;
           String s5=TextCountry.getText();
           String s6=c1.getSelectedItem();
           String s7=date.getText();
           String s8=TextDeposite.getText();

           try{
               String q="insert into customer values('"+s2+"', '"+s2+"', '"+s3+"', '"+s4+"', '"+s5+"', '"+s6+"', '"+s7+"', '"+s8+"')";
               String q1="update room set availability= 'Occupied' where roomnumber= "+s6;
               c.statement.executeUpdate(q);
               c.statement.executeUpdate(q1);

               JOptionPane.showMessageDialog(null,"Added Successfully");
               setVisible(false);

           }
           catch(Exception E) {
               E.printStackTrace();
           }
       }
       else{
           setVisible(false);
       }
    }
    public static void main(String[] args) {
       new NewCustomer();
    }
}
