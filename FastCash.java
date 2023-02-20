
import java.sql.ResultSet;
import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class FastCash extends JFrame implements ActionListener{
    JButton deposit,withDrawl ,fastCash,miniStatement,pinChange,balanceEnquiry,exit;
    String pin;
    FastCash(String pin) {
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon  i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);

        JLabel text = new JLabel("SELECT THE WITHDRAWL AMOUNT");
        text.setBounds(220,200,200,20);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,13));
        image.add(text);

        deposit = new JButton("Rs 100");
        deposit.setBounds(135,275,140,20);
        deposit.addActionListener(this);
        image.add(deposit);

        withDrawl = new JButton("Rs 500");
        withDrawl.setBounds(320,275,140,20);
        withDrawl.addActionListener(this);
        image.add(withDrawl);

        fastCash = new JButton("Rs 1000");
        fastCash.setBounds(135,300,140,20);
        fastCash.addActionListener(this);
        image.add(fastCash);

        miniStatement = new JButton("Rs 200");
        miniStatement.setBounds(320,300,140,20);
        miniStatement.addActionListener(this);
        image.add(miniStatement);

        pinChange = new JButton("Rs 5000");
        pinChange.setBounds(135,325,140,20);
        pinChange.addActionListener(this);
        image.add(pinChange);

        balanceEnquiry = new JButton("Rs 10000");
        balanceEnquiry.setBounds(320,325,140,20);
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);

        exit = new JButton("BACK");
        exit.setBounds(320,350,140,20);
        exit.addActionListener(this);
        image.add(exit);


        setSize(800,600);
        setLocation(350,100);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == exit) {
            setVisible(false);
            new Transactions(pin).setVisible(true);
        }
        else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pin='"+pin+"'");
                int balance = 0;
                while(rs.next()) {
                    if(rs.getString("type").equals("Deposit")) {
                        balance +=Integer.parseInt( rs.getString("amount"));
                    }
                    else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource() != exit && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values('"+pin+"','"+date+"','WithDrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+amount+" Debited Successfully");
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        new FastCash("");
    }
}
