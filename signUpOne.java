import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.toedter.calendar.*;
public class signUpOne extends JFrame implements ActionListener {
   long random;
   JTextField nameText,fatherText,emailText,addressText,cityText,stateText,pinText;
   JButton next;
   JRadioButton male,female,married,unMarried,other;
   JDateChooser dateChooser;

    signUpOne() {
        
        setTitle("SIGN UP PAGE");
        
        setLayout(null);

        Random r = new Random();
         random = Math.abs((r.nextLong() % 9000L) + 1000L);

        JLabel form = new JLabel("APPLICATION NO : "+ random );
        form.setBounds(160,20,400,80);
        form.setFont(new Font("Raleway",Font.BOLD,30));
        form.setForeground(Color.black);
        add(form);

        JLabel personDetails = new JLabel("Page 1 : Personal Details");
        personDetails.setBounds(230,80,300,40);
        personDetails.setFont(new Font("Raleway",Font.BOLD,18));
        personDetails.setForeground(Color.black);
        add(personDetails);

        JLabel name = new JLabel("Name : ");
        name.setBounds(90,130,100,30);
        name.setFont(new Font("Raleway",Font.BOLD,15));
        name.setForeground(Color.black);
        add(name);

         nameText = new JTextField();
        nameText.setFont(new Font("Raleway",Font.BOLD,15));
        nameText.setBounds(250,130,300,25);
        add(nameText);

        JLabel fName = new JLabel("Father's Name : ");
        fName.setBounds(90,170,150,30);
        fName.setFont(new Font("Raleway",Font.BOLD,15));
        fName.setForeground(Color.black);
        add(fName);

         fatherText = new JTextField();
        fatherText.setFont(new Font("Raleway",Font.BOLD,15));
        fatherText.setBounds(250,170,300,25);
        add(fatherText);

        JLabel dob = new JLabel("Date of Birth : ");
        dob.setBounds(90,210,150,30);
        dob.setFont(new Font("Raleway",Font.BOLD,15));
        dob.setForeground(Color.black);
        add(dob);

         dateChooser = new JDateChooser();
        dateChooser.setBounds(250,210,300,25);
        add(dateChooser);

        JLabel gender = new JLabel("Gender : ");
        gender.setBounds(90,250,150,30);
        gender.setFont(new Font("Raleway",Font.BOLD,15));
        gender.setForeground(Color.black);
        add(gender);

         male = new JRadioButton("Male");
        male.setBounds(250,250,80,30);
        male.setBackground(Color.white);
        add(male);

         female = new JRadioButton("Female");
        female.setBounds(330,250,80,30);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("E-mail Id : ");
        email.setBounds(90,290,150,30);
        email.setFont(new Font("Raleway",Font.BOLD,15));
        email.setForeground(Color.black);
        add(email);
        
         emailText = new JTextField();
        emailText.setFont(new Font("Raleway",Font.BOLD,15));
        emailText.setBounds(250,290,300,25);
        add(emailText);

        JLabel matrial = new JLabel("Matrial Status : ");
        matrial.setBounds(90,330,150,30);
        matrial.setFont(new Font("Raleway",Font.BOLD,15));
        matrial.setForeground(Color.black);
        add(matrial);

         married = new JRadioButton("Married");
        married.setBounds(250,330,80,30);
        married.setBackground(Color.white);
        add(married);

         unMarried = new JRadioButton("UnMarried");
        unMarried.setBounds(330,330,100,30);
        unMarried.setBackground(Color.white);
        add(unMarried);

         other = new JRadioButton("Other");
        other.setBounds(430,330,80,30);
        other.setBackground(Color.white);
        add(other);

        ButtonGroup martialGroup = new ButtonGroup();
        martialGroup.add(married);
        martialGroup.add(unMarried);
        martialGroup.add(other);

        JLabel address = new JLabel("Address : ");
        address.setBounds(90,370,150,30);
        address.setFont(new Font("Raleway",Font.BOLD,15));
        address.setForeground(Color.black);
        add(address);
        
         addressText = new JTextField();
        addressText.setFont(new Font("Raleway",Font.BOLD,15));
        addressText.setBounds(250,370,300,25);
        add(addressText);

        JLabel city = new JLabel("City : ");
        city.setBounds(90,410,150,30);
        city.setFont(new Font("Raleway",Font.BOLD,15));
        city.setForeground(Color.black);
        add(city);
        
         cityText = new JTextField();
        cityText.setFont(new Font("Raleway",Font.BOLD,15));
        cityText.setBounds(250,410,300,25);
        add(cityText);

        JLabel state = new JLabel("State : ");
        state.setBounds(90,450,150,30);
        state.setFont(new Font("Raleway",Font.BOLD,15));
        state.setForeground(Color.black);
        add(state);
        
         stateText = new JTextField();
        stateText.setFont(new Font("Raleway",Font.BOLD,15));
        stateText.setBounds(250,450,300,25);
        add(stateText);

        JLabel pinCode = new JLabel("Pin Code : ");
        pinCode.setBounds(90,490,150,30);
        pinCode.setFont(new Font("Raleway",Font.BOLD,15));
        pinCode.setForeground(Color.black);
        add(pinCode);
        
         pinText = new JTextField();
        pinText.setFont(new Font("Raleway",Font.BOLD,15));
        pinText.setBounds(250,490,300,25);
        add(pinText);

         next = new JButton("Next");
        next.setBounds(350,550,80,20);
        next.setFont(new Font("Raleway",Font.BOLD,15));
        next.setBackground(Color.lightGray);
        next.setForeground(Color.black);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.white);
        setSize(700, 700);
        setVisible(true);
        setLocation(450, 80);
    }
    public void actionPerformed(ActionEvent ae) {
        String form = random + "";
        String name = nameText.getText();
        String fName = fatherText.getText();
        String dob  = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()) {
            gender = "Male";
        }
        else if(female.isSelected()) {
            gender = "Female";
        }
        String email = emailText.getText();
        String martial = null;
        if(married.isSelected()) {
            martial = "Married";
        }
        else if(unMarried.isSelected()) {
            martial = "UnMarried";
        }
        else if(other.isSelected()) {
            martial = "Other";
        }
        String address = addressText.getText();
        String city = cityText.getText();
        String state = stateText.getText();
        String pin = pinText.getText();
        try{
            if(name.equals("")) {
                JOptionPane.showMessageDialog(null,"Name is Required");
            }
            else {
                Conn c = new Conn();
                String query = "insert into signup values('"+form+"','"+name+"','"+fName+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+state+"','"+pin+"') ";
                c.s.executeUpdate(query);
                setVisible(false);
                new signUpTwo(random+"").setVisible(true);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        new signUpOne();
    }
}