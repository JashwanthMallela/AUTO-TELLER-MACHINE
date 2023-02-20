
import java.sql.ResultSet;
import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class BalanceEnquiry extends JFrame implements ActionListener{
  JButton back;
  String pin;
    BalanceEnquiry(String pin) {
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon  i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);

        back = new JButton("BACK");
        back.setBounds(320,350,140,20);
        back.addActionListener(this);
        image.add(back);

        Conn c = new Conn();
        int balance = 0;
        try {
            ResultSet rs = c.s.executeQuery("select * from bank where pin='" + pin + "'");

            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        JLabel text = new JLabel("Your Current Account Balance is Rs "+balance);
        text.setForeground(Color.white);
        text.setBounds(170,100,400,300);
        image.add(text);

        setSize(800,600);
        setLocation(350,100);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
          setVisible(false);
          new Transactions(pin).setVisible(true);
    }
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
