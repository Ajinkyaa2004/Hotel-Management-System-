package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {
    JTextField nameText,ageText,salaryText, phoneText, aadharText, emailText;
    JRadioButton radioButtonM,radioButtonF;
    JComboBox comboBox;
    JButton add, back;

    AddEmployee(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(Color.ORANGE) ;
        add(panel);

    JLabel name=new JLabel("Name");
    name.setBounds(60,30,150,27);
    name.setFont(new Font("serif",Font.BOLD,17));
    name.setForeground(Color.black);
    panel.add(name);
    nameText=new JTextField();
    nameText.setBounds(200,30,150,27);
    nameText.setBackground(Color.white);
    nameText.setFont (new Font("Tahuma",Font.BOLD,14));
    nameText.setForeground(Color.black);
    panel.add(nameText);


        JLabel age=new JLabel("Age");
        age.setBounds(60,80,150,27);
        age.setFont(new Font("serif",Font.BOLD,17));
        age.setForeground(Color.black);
        panel.add(age);
        ageText=new JTextField();
        ageText.setBounds(200,80,150,27);
        ageText.setBackground(Color.white);
        ageText.setFont (new Font("Tahuma",Font.BOLD,14));
        ageText.setForeground(Color.black);
        panel.add(ageText);


        JLabel gender=new JLabel("Gender");
        gender.setBounds(60,130,150,27);
        gender.setFont(new Font("serif",Font.BOLD,17));
        gender.setForeground(Color.black);
        panel.add(gender);

        radioButtonM= new JRadioButton("Male");
        radioButtonM.setBounds(200,130,70,27);
        radioButtonM.setFont(new Font("Tahuma,",Font.BOLD,14));
        radioButtonM.setForeground(Color.white);
        panel.add(radioButtonM);

        radioButtonF= new JRadioButton("Female");
        radioButtonF.setBounds(280,130,100,27);
        radioButtonF.setFont(new Font("Tahuma,",Font.BOLD,14));
        radioButtonF.setForeground(Color.white);
        panel.add(radioButtonF);


        JLabel job=new JLabel("Job");
        job.setBounds(60,180,150,27);
        job.setFont(new Font("serif",Font.BOLD, 17));
        job.setForeground(Color.black);
        panel.add(job);

        comboBox = new JComboBox(new String[]{"Front Desk","Housekeeping","Kitchen Staff","Room Service","Manager","Accountant","Chef"});
        comboBox.setBackground(Color.white);
        comboBox.setBounds(200,180,150,30);
        comboBox.setFont(new Font("Tahuma",Font.BOLD,14));
        comboBox.setForeground(Color.BLACK);
        panel.add(comboBox);


        JLabel salary=new JLabel("Salary");
        salary.setBounds(60,220,150,27);
        salary.setFont(new Font("serif",Font.BOLD,17));
        salary.setForeground(Color.black);
        panel.add( salary);
        salaryText=new JTextField();
        salaryText.setBounds(200,220,150,27);
        salaryText.setBackground(Color.white);
        salaryText.setFont (new Font("Tahuma",Font.BOLD,14));
        salaryText.setForeground(Color.black);
        panel.add(salaryText);

        JLabel phone=new JLabel("Phone No.");
        phone.setBounds(60,270,150,27);
        phone.setFont(new Font("serif",Font.BOLD,17));
        phone.setForeground(Color.black);
        panel.add(phone);
        phoneText=new JTextField();
        phoneText.setBounds(200,270,150,27);
        phoneText.setBackground(Color.white);
        phoneText.setFont (new Font("Tahuma",Font.BOLD,14));
        phoneText.setForeground(Color.black);
        panel.add(phoneText);

        JLabel aadhar=new JLabel("Aadhar");
        aadhar.setBounds(60,320,150,27);
        aadhar.setFont(new Font("serif",Font.BOLD,17));
        aadhar.setForeground(Color.black);
        panel.add(aadhar);
        aadharText=new JTextField();
        aadharText.setBounds(200,320,150,27);
        aadharText.setBackground(Color.white);
        aadharText.setFont (new Font("Tahuma",Font.BOLD,14));
        aadharText.setForeground(Color.black);
        panel.add(aadharText);

        JLabel email=new JLabel("Email");
        email.setBounds(60,370,150,27);
        email.setFont(new Font("serif",Font.BOLD,17));
        email.setForeground(Color.black);
        panel.add(email);
        emailText=new JTextField();
        emailText.setBounds(200,370,150,27);
        emailText.setBackground(Color.white);
        emailText.setFont (new Font("Tahuma",Font.BOLD,14));
        emailText.setForeground(Color.black);
        panel.add(emailText);

        JLabel AED=new JLabel("Add Employee Details");
        AED.setBounds(450,24,445,35);
        AED.setFont(new Font("Tahuma",Font.BOLD,28));
        AED.setForeground(Color.black);
        panel.add(AED);

        add=new JButton("ADD");
        add.setBounds(80,420,100,30);
        setBackground(Color.white);
        setForeground(Color.BLACK);
        add.addActionListener(this);
        panel.add(add);

        back=new JButton("BACK");
        back.setBounds(200,420,100,30);
        setBackground(Color.white);
        setForeground(Color.BLACK);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 =new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(500,100,300,300);
        panel.add(label);

        setUndecorated(true);
        setLocation(60,160);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            String name=nameText.getText();
            String age=ageText.getText();
            String salary=salaryText.getText();
            String phone=phoneText.getText();
            String email=emailText.getText();
            String aadhar=aadharText.getText();

            String job=(String )comboBox.getSelectedItem();

            String gender=null;
            if(radioButtonM.isSelected()){
                gender="Male";
            }
            else if(radioButtonF.isSelected()){
                gender="Female";
            }
            try{
                con c=new con();
                String q="insert into employee values ('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+aadhar+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Employe Added");
                setVisible(false);

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
        new AddEmployee();
    }
}
