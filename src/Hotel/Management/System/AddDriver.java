package Hotel.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDriver extends JFrame implements ActionListener {
    JTextField nameText,ageText,carCText, carNText,locText;
    JComboBox comboBox,comboBox1;
    JButton add,back;

    AddDriver(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(Color.orange);
        add(panel);


        JLabel label=new JLabel("Add Drivers");
        label.setBounds(194,24,445,35);
        label.setFont(new Font("Tahuma",Font.BOLD,28));
        label.setForeground(Color.black);
        panel.add(label);


        JLabel name =new JLabel("Name");
        name.setBounds(64,70,102,22);
        name.setFont(new Font("Tahuma",Font.BOLD,18));
        name.setForeground(Color.black);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(174,70,150,22);
        nameText.setForeground(Color.BLACK);
        nameText.setFont(new Font("Tahuma",Font.BOLD,14));
        nameText.setBackground(Color.white);
        panel.add(nameText);


        JLabel age =new JLabel("Age");
        age.setBounds(64,110,102,22);
        age.setFont(new Font("Tahuma",Font.BOLD,18));
        age.setForeground(Color.black);
        panel.add(age);
        ageText = new JTextField();
        ageText.setBounds(174,110,150,22);
        ageText.setForeground(Color.BLACK);
        ageText.setFont(new Font("Tahuma",Font.BOLD,14));
        ageText.setBackground(Color.white);
        panel.add(ageText);


        JLabel gender =new JLabel("Gender");
        gender.setBounds(64,150,102,22);
        gender.setFont(new Font("Tahuma",Font.BOLD,18));
        gender.setForeground(Color.black);
        panel.add(gender);
        comboBox=new JComboBox(new String[]{"Male","Female"});
        comboBox.setBounds(176,150,154,20);
        comboBox.setForeground(Color.BLACK);
        comboBox.setFont(new Font("Tahuma",Font.BOLD,14));
        comboBox.setBackground(Color.white);
        panel.add(comboBox);


        JLabel carC =new JLabel("Car Company");
        carC.setBounds(64,190,135,22);
        carC.setFont(new Font("Tahuma",Font.BOLD,18));
        carC.setForeground(Color.black);
        panel.add(carC );
        carCText = new JTextField();
        carCText.setBounds(200,190,150,22);
        carCText.setForeground(Color.BLACK);
        carCText.setFont(new Font("Tahuma",Font.BOLD,14));
        carCText.setBackground(Color.white);
        panel.add(carCText);


        JLabel carN =new JLabel(" Car Name");
        carN.setBounds(58,230,102,22);
        carN.setFont(new Font("Tahuma",Font.BOLD,18));
        carN.setForeground(Color.black);
        panel.add(carN);
        carNText = new JTextField();
        carNText.setBounds(174,230,150,22);
        carNText.setForeground(Color.BLACK);
        carNText.setFont(new Font("Tahuma",Font.BOLD,14));
        carNText.setBackground(Color.white);
        panel.add(carNText);


        JLabel available =new JLabel("Available");
        available.setBounds(64,270,102,22);
        available.setFont(new Font("Tahuma",Font.BOLD,18));
        available.setForeground(Color.black);
        panel.add(available);
        comboBox1=new JComboBox(new String[]{"Yes","No"});
        comboBox1.setBounds(176,270,154,20);
        comboBox1.setForeground(Color.BLACK);
        comboBox1.setFont(new Font("Tahuma",Font.BOLD,14));
        comboBox1.setBackground(Color.white);
        panel.add(comboBox1);


        JLabel loc =new JLabel("Location");
        loc.setBounds(64,310,102,22);
        loc.setFont(new Font("Tahuma",Font.BOLD,18));
        loc.setForeground(Color.black);
        panel.add(loc);
        locText = new JTextField();
        locText.setBounds(174,310,150,22);
        locText.setForeground(Color.BLACK);
        locText.setFont(new Font("Tahuma",Font.BOLD,14));
        locText.setBackground(Color.white);
        panel.add(locText);


        add =new JButton("Add");
        add.setBounds(64,380,111,33);
        add.setBackground(Color.white);
        add.setForeground(Color.BLACK);
        add.addActionListener(this);
        panel.add(add);


        back=new JButton("Back");
        back.setBounds(198,380,111,33);
        back.setBackground(Color.white);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        panel.add(back);


       ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/license.png"));
       Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
       ImageIcon imageIcon1= new ImageIcon(image);
       JLabel label1= new JLabel(imageIcon1);
       label1.setBounds(500,60,300,300);
       panel.add(label1);

        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            String name=nameText.getText();
            String age=ageText.getText();
            String gender=(String) comboBox.getSelectedItem();
            String company=carCText.getText();
            String carname=carNText.getText();
            String available=(String) comboBox1.getSelectedItem();
            String location=locText.getText();

            try{
                con c=new con();
                String q="insert into driver values('"+ name+"', '"+ age+"','"+gender+"','"+company +"','"+carname+"','"+available+"','"+location+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Driver Added");
                setVisible(false);
            }catch(Exception E){
                E.printStackTrace();

            }
        }
        else {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new AddDriver();
    }
}
