
import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
   JButton deposit,withDrawl ,fastCash,miniStatement,pinChange,balanceEnquiry,exit;
   String pin;
    Transactions(String pin) {
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon  i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);

        JLabel text = new JLabel("Please enter your transaction");
        text.setBounds(220,200,200,20);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,13));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(135,275,140,20);
        deposit.addActionListener(this);
        image.add(deposit);

        withDrawl = new JButton("Cash WithDrawl");
        withDrawl.setBounds(320,275,140,20);
        withDrawl.addActionListener(this);
        image.add(withDrawl);

        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(135,300,140,20);
        fastCash.addActionListener(this);
        image.add(fastCash);

        miniStatement = new JButton("Mini-Statement");
        miniStatement.setBounds(320,300,140,20);
        miniStatement.addActionListener(this);
        image.add(miniStatement);

        pinChange = new JButton("PIN Change");
        pinChange.setBounds(135,325,140,20);
        pinChange.addActionListener(this);
        image.add(pinChange);

        balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(320,325,140,20);
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);

        exit = new JButton("Exit");
        exit.setBounds(320,350,140,20);
        exit.addActionListener(this);
        image.add(exit);


        setSize(800,600);
        setLocation(350,100);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == exit) System.exit(0);
        else if(ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }
        else if(ae.getSource() == withDrawl) {
            setVisible(false);
            new WithDrawl(pin).setVisible(true);
        }
        else if(ae.getSource() == fastCash) {
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }
        else if(ae.getSource() == pinChange) {
            setVisible(false);
            new PinChange(pin).setVisible(true);
        }
        else if(ae.getSource() == balanceEnquiry) {
            setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }
        else if(ae.getSource() == miniStatement) {

            new MiniStatement(pin).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Transactions("");
    }
}
