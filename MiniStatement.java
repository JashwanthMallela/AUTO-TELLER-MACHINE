
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class MiniStatement extends JFrame{

   String pin;
    MiniStatement(String pin) {
        this.pin = pin;
        setTitle("Mini Statement");

        setLayout(null);
        JLabel mini  = new JLabel();
        add(mini);

        JLabel bank = new JLabel("Our Bank");
        bank.setBounds(150,20,80,25);
        add(bank);

        JLabel balance = new JLabel();
        balance.setBounds(80,60,600,20);
        add(balance);

        JLabel details = new JLabel("Cash Deposit and WithDrawl Detais :");
        details.setBounds(30,75,600,25);
        add(details);

        JLabel card = new JLabel();
        card.setBounds(80,45,600,20);
        add(card);

        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pinValue='"+pin+"'");
            while(rs.next()) {
                card.setText("Card Number : "+"xxxxxxxxxxxx"+ rs.getString("cnumber").substring(12,16));

            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from bank where pin='"+pin+"'");
            int bal = 0;
            while(rs.next()) {
                mini.setText(mini.getText() + "<html>" +rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
                if(rs.getString("type").equals("Deposit")) {
                    bal +=Integer.parseInt( rs.getString("amount"));
                }
                else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your Current Balance is : "+bal);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        int bal = 0;


        mini.setBounds(30,20,600,300);
        getContentPane().setBackground(Color.white);
        setSize(400,450);
        setLocation(200,80);

        setVisible(true);
    }
    public static void main(String[] args) {
        new MiniStatement("");
    }
}
