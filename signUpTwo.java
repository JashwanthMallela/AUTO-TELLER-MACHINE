import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.toedter.calendar.*;
public class signUpTwo extends JFrame implements ActionListener {
    long random;
    JTextField panText,aadhaarText,existingText;
    JButton next;
    JRadioButton sno,syes,eno,eyes;
    JDateChooser dateChooser;

    JComboBox religionText,categoryText,incomeText,educationText,occupationText;

    String form;

    signUpTwo(String form) {
        this.form = form;

        setTitle("SIGN UP PAGE");

        setLayout(null);

        Random r = new Random();
        random = Math.abs((r.nextLong() % 9000L) + 1000L);

        JLabel personDetails = new JLabel("Page 2 : Additional Details");
        personDetails.setBounds(230,80,300,40);
        personDetails.setFont(new Font("Rale way",Font.BOLD,18));
        personDetails.setForeground(Color.black);
        add(personDetails);

        JLabel religion = new JLabel("Religion : ");
        religion.setBounds(90,130,100,30);
        religion.setFont(new Font("Rale way",Font.BOLD,15));
        religion.setForeground(Color.black);
        add(religion);

         religionText = new JComboBox(new String[]{"Hindu","Christian","Muslim"});
        religionText.setBounds(250,130,300,25);
        religionText.setBackground(Color.WHITE);
        add(religionText);

        JLabel category = new JLabel("Category : ");
        category.setBounds(90,170,150,30);
        category.setFont(new Font("Rale way",Font.BOLD,15));
        category.setForeground(Color.black);
        add(category);

         categoryText = new JComboBox(new String[]{"General","OBC","SC","ST","Other"});
        categoryText.setBounds(250,170,300,25);
        categoryText.setBackground(Color.WHITE);
        add(categoryText);

        JLabel Income = new JLabel("Income : ");
        Income.setBounds(90,210,150,30);
        Income.setFont(new Font("Rale way",Font.BOLD,15));
        Income.setForeground(Color.black);
        add(Income);

         incomeText = new JComboBox(new String[]{"Null","< 1,50,000","< 2,50,000","< 5,00,000","Up To 1,00,000"});
        incomeText.setBackground(Color.WHITE);
        incomeText.setBounds(250,210,300,25);
        add(incomeText);


        JLabel Education = new JLabel("Education : ");
        Education.setBounds(90,250,150,30);
        Education.setFont(new Font("Rale way",Font.BOLD,15));
        Education.setForeground(Color.black);
        add(Education);

         educationText = new JComboBox(new String[]{"Non-Graduate","Graduate","Post-Graduate","Other"});
        educationText.setBackground(Color.WHITE);
        educationText.setBounds(250,250,300,25);
        add(educationText);

        JLabel occupation = new JLabel("Occupation : ");
        occupation.setBounds(90,290,150,30);
        occupation.setFont(new Font("Rale way",Font.BOLD,15));
        occupation.setForeground(Color.black);
        add(occupation);

         occupationText = new JComboBox(new String[]{"Student","Private-Employee","Govt.-Employee","Self-Employee","Business","Other"});
        occupationText.setBackground(Color.WHITE);
        occupationText.setBounds(250,290,300,25);
        add(occupationText);


        JLabel pan = new JLabel("PAN Number : ");
        pan.setBounds(90,330,150,30);
        pan.setFont(new Font("Rale way",Font.BOLD,15));
        pan.setForeground(Color.black);
        add(pan);

        panText = new JTextField();
        panText.setFont(new Font("Rale way",Font.BOLD,15));
        panText.setBounds(250,330,300,25);
        add(panText);

        JLabel aadhaar = new JLabel("Aadhaar Number : ");
        aadhaar.setBounds(90,370,150,30);
        aadhaar.setFont(new Font("Rale way",Font.BOLD,15));
        aadhaar.setForeground(Color.black);
        add(aadhaar);

        aadhaarText = new JTextField();
        aadhaarText.setFont(new Font("Raleway",Font.BOLD,15));
        aadhaarText.setBounds(250,370,300,25);
        add(aadhaarText);

        JLabel senior = new JLabel("Senior Citizen : ");
        senior.setBounds(90,410,150,30);
        senior.setFont(new Font("Rale way",Font.BOLD,15));
        senior.setForeground(Color.black);
        add(senior);

         syes = new JRadioButton("Yes");
        syes.setBounds(250,420,50,15);
        syes.setFont(new Font("Rale way",Font.BOLD,12));
        syes.setBackground(Color.white);
        add(syes);

         sno = new JRadioButton("No");
        sno.setBounds(300,420,500,15);
        sno.setFont(new Font("Rale way",Font.BOLD,12));
        sno.setBackground(Color.white);
        add(sno);

        ButtonGroup isSenior = new ButtonGroup();
        isSenior.add(syes);
        isSenior.add(sno);



        JLabel existingAccount = new JLabel("Existing Account : ");
        existingAccount.setBounds(90,450,150,30);
        existingAccount.setFont(new Font("Raleway",Font.BOLD,15));
        existingAccount.setForeground(Color.black);
        add(existingAccount);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(250,460,50,15);
        eyes.setFont(new Font("Rale way",Font.BOLD,12));
        eyes.setBackground(Color.white);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(300,460,50,15);
        eno.setFont(new Font("Rale way",Font.BOLD,12));
        eno.setBackground(Color.white);
        add(eno);

        ButtonGroup isExisting = new ButtonGroup();
        isExisting.add(eno);
        isExisting.add(eyes);

        next = new JButton("Next");
        next.setBounds(350,550,80,20);
        next.setFont(new Font("Rale way",Font.BOLD,15));
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
            String religion = (String)religionText.getSelectedItem();
            String category = (String)categoryText.getSelectedItem();
            String income = (String)incomeText.getSelectedItem();
            String education = (String)educationText.getSelectedItem();
            String occupation = (String)occupationText.getSelectedItem();
             String seniorCititzen = null;
            if(syes.isSelected()) {
                seniorCititzen = "Yes";
            }
            else {
                seniorCititzen = "No";
            }
            String existingAccount = null;
            if(eyes.isSelected()) existingAccount = "Yes";
            else if(eno.isSelected()) existingAccount = "No";
            String panNo = panText.getText();
            String aadhaarNo = aadhaarText.getText();
        try{
            if(religion.equals("")) {
                JOptionPane.showMessageDialog(null,"religion is Required");
            }
            else {
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+form+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+seniorCititzen+"','"+existingAccount+"','"+panNo+"','"+aadhaarNo+"') ";
                c.s.executeUpdate(query);
                setVisible(false);
                new signUpThree(form).setVisible(true);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }


    public static void main(String[] args) {
        new signUpTwo("");
    }
}