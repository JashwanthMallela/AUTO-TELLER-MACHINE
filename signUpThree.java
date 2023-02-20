import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class signUpThree extends JFrame implements  ActionListener{


    JButton submit,cancel;
    JRadioButton savingsRadio,currentRadio,fixedRadio,recurringRadio;
    JCheckBox atm,mobile,cheque,internet,emailSms,eStatement,statement;
    String form;
    signUpThree(String form) {
        this.form = form;
        setLayout(null);


        JLabel label = new JLabel("Page 3 : Additional Details");
        label.setBounds(230,30,300,40);
        label.setFont(new Font("Rale way",Font.BOLD,18));
        label.setForeground(Color.black);
        add(label);

        JLabel accountLabel = new JLabel("Account Type");
        accountLabel.setBounds(70,100,150,18);
        accountLabel.setFont(new Font("Rale way",Font.BOLD,15));
        accountLabel.setForeground(Color.black);
        add(accountLabel);

         savingsRadio = new JRadioButton("Savings Account");
        savingsRadio.setBounds(70,130,140,15);
        savingsRadio.setFont(new Font("Rale way",Font.BOLD,12));
        savingsRadio.setForeground(Color.black);
        savingsRadio.setBackground(Color.white);
        add(savingsRadio);

         currentRadio = new JRadioButton("Current Account");
        currentRadio.setBounds(70,160,130,15);
        currentRadio.setFont(new Font("Rale way",Font.BOLD,12));
        currentRadio.setForeground(Color.black);
        currentRadio.setBackground(Color.white);
        add(currentRadio);

         fixedRadio = new JRadioButton("Fixed Deposit Account");
        fixedRadio.setBounds(300,130,200,15);
        fixedRadio.setFont(new Font("Rale way",Font.BOLD,12));
        fixedRadio.setForeground(Color.black);
        fixedRadio.setBackground(Color.white);
        add(fixedRadio);

         recurringRadio = new JRadioButton("Recurring Deposit Account");
        recurringRadio.setBounds(300,160,200,15);
        recurringRadio.setFont(new Font("Rale way",Font.BOLD,12));
        recurringRadio.setForeground(Color.black);
        recurringRadio.setBackground(Color.white);
        add(recurringRadio);

        ButtonGroup typeGroup = new ButtonGroup();
        typeGroup.add(savingsRadio);
        typeGroup.add(currentRadio);
        typeGroup.add(fixedRadio);
        typeGroup.add(recurringRadio);

        JLabel cardNumber  = new JLabel("Card Number");
        cardNumber.setBounds(70,200,150,18);
        cardNumber.setFont(new Font("Rale way",Font.BOLD,15));
        cardNumber.setForeground(Color.black);
        add(cardNumber);

        JLabel digits  = new JLabel("Your 16-Digit card number");
        digits.setBounds(70,220,150,18);
        digits.setFont(new Font("Rale way",Font.BOLD,8));
        digits.setForeground(Color.black);
        add(digits);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-1234");
        number.setBounds(305,200,400,18);
        number.setFont(new Font("Rale way",Font.BOLD,15));
        number.setForeground(Color.black);
        add(number);

        JLabel pinNumber = new JLabel("PIN");
        pinNumber.setBounds(70,250,50,18);
        pinNumber.setFont(new Font("Rale way",Font.BOLD,15));
        pinNumber.setForeground(Color.black);
        add(pinNumber);

        JLabel pinValue = new JLabel("XXXX");
        pinValue.setBounds(305,250,100,18);
        pinValue.setFont(new Font("Rale way",Font.BOLD,15));
        pinValue.setForeground(Color.black);
        add(pinValue);

        JLabel pin4  = new JLabel("Your 4 digit password");
        pin4.setBounds(70,270,150,20);
        pin4.setFont(new Font("Rale way",Font.BOLD,8));
        pin4.setForeground(Color.black);
        add(pin4);

        JLabel services  = new JLabel("Services Required");
        services.setBounds(70,320,150,18);
        services.setFont(new Font("Rale way",Font.BOLD,15));
        services.setForeground(Color.black);
        add(services);

         atm = new JCheckBox("ATM CARD");
        atm.setBounds(70,370,120,18);
        atm.setFont(new Font("Rale way",Font.BOLD,12));
        atm.setForeground(Color.black);
        atm.setBackground(Color.white);
        add(atm);

         mobile = new JCheckBox("Mobile Banking");
        mobile.setBounds(70,400,120,18);
        mobile.setFont(new Font("Rale way",Font.BOLD,12));
        mobile.setForeground(Color.black);
        mobile.setBackground(Color.white);
        add(mobile);

         cheque = new JCheckBox("Cheque Book");
        cheque.setBounds(70,430,120,18);
        cheque.setFont(new Font("Rale way",Font.BOLD,12));
        cheque.setForeground(Color.black);
        cheque.setBackground(Color.white);
        add(cheque);

        internet = new JCheckBox("Internet Banking");
        internet.setBounds(305,370,150,18);
        internet.setFont(new Font("Rale way",Font.BOLD,12));
        internet.setForeground(Color.black);
        internet.setBackground(Color.white);
        add(internet);

        emailSms = new JCheckBox("EMAIL & SMS alerts");
        emailSms.setBounds(305,400,200,18);
        emailSms.setFont(new Font("Rale way",Font.BOLD,12));
        emailSms.setForeground(Color.black);
        emailSms.setBackground(Color.white);
        add(emailSms);

        eStatement = new JCheckBox("E-Statement");
        eStatement.setBounds(305,430,120,18);
        eStatement.setFont(new Font("Rale way",Font.BOLD,12));
        eStatement.setForeground(Color.black);
        eStatement.setBackground(Color.white);
        add(eStatement);

        statement = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge.");
        statement.setBounds(70,480,1200,20);
        statement.setFont(new Font("Rale way",Font.BOLD,12));
        statement.setBackground(Color.white);
        statement.setForeground(Color.black);
        add(statement);

        submit = new JButton("Submit");
        submit.setBounds(150,530,90,30);
        submit.setFont(new Font("Rale way",Font.BOLD,12));
        submit.setForeground(Color.black);
        submit.setBackground(Color.lightGray);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(350,530,90,30);
        cancel.setFont(new Font("Rale way",Font.BOLD,12));
        cancel.setForeground(Color.black);
        cancel.setBackground(Color.lightGray);
        cancel.addActionListener(this);
        add(cancel);


        getContentPane().setBackground(Color.white);
        setSize(700, 700);
        setVisible(true);
        setLocation(450, 60);
    }
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == submit){
            String accountType = null;
            if(savingsRadio.isSelected()){
                accountType = "Savings Account";
            }
            else if(currentRadio.isSelected()) {
                accountType = "Current Account";
            }
            else if(fixedRadio.isSelected()) {
                accountType = "Fixed Deposit Account";
            }
            else if(recurringRadio.isSelected()) {
                accountType = "Recurring Deposit Account";
            }

            Random random = new Random();
            String cnumber =   ""+Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinValue = "" + Math.abs((random.nextLong() % 9000L)+1000L);
            String facilitites = "";

            if(atm.isSelected()) facilitites += "ATM CARD";
            else if(mobile.isSelected()) facilitites += "Mobile Banking";
            else if(internet.isSelected()) facilitites += "Internet Banking";
            else if(cheque.isSelected()) facilitites += "Cheque Book";
            else if(emailSms.isSelected()) facilitites += "EMAIL & SMS alerts";
            else if(statement.isSelected()) facilitites += "E-Statement";

            try {
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required");
                }
                else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+form+"','"+accountType+"','"+cnumber+"','"+pinValue+"','"+facilitites+"')";
                    String query2  ="insert into login values('"+form+"','"+cnumber+"','"+pinValue+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Card Number : " + cnumber + "\n Pin : " + pinValue );
                }
            }catch(Exception e) {
                System.out.println(e);
            }
        }
        else if(ae.getSource() == cancel) {

        }
    }
    public static void main(String[] args) {
        new signUpThree("");
    }
}
