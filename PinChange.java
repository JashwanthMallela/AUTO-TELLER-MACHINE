import javax.swing.*;

import java.sql.ResultSet;
import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class PinChange extends JFrame implements ActionListener {

    JButton change,back;
    JPasswordField reNewPinText,newPinText;
    String pin;
    PinChange(String pin) {
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon  i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);

        JLabel changePin = new JLabel("CHANGE YOUR PIN");
        changePin.setBounds(240,200,200,20);
        changePin.setForeground(Color.white);
        changePin.setFont(new Font("System",Font.BOLD,13));
        image.add(changePin);

        JLabel newPin = new JLabel("Enter New PIN :");
        newPin.setBounds(150,250,200,20);
        newPin.setForeground(Color.white);
        newPin.setFont(new Font("System",Font.BOLD,13));
        image.add(newPin);

         newPinText = new JPasswordField();
        newPinText.setBounds(280,250,180,20);
        newPinText.setFont(new Font("Rale way",Font.BOLD,13));
        image.add(newPinText);

        JLabel reNewPin = new JLabel("Re-Enter New PIN :");
        reNewPin.setBounds(150,290,200,20);
        reNewPin.setForeground(Color.white);
        reNewPin.setFont(new Font("System",Font.BOLD,13));
        image.add(reNewPin);

         reNewPinText = new JPasswordField();
        reNewPinText.setBounds(280,290,180,20);
        reNewPinText.setFont(new Font("Rale way",Font.BOLD,13));
        image.add(reNewPinText);

        change = new JButton("Change");
        change.setBounds(355,323,100,20);
        change.addActionListener(this);
        image.add(change);

         back = new JButton("Go Back");
        back.setBounds(355,347,100,20);
        back.addActionListener(this);
        image.add(back);

        setSize(800,600);
        setLocation(350,100);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == change) {
            try {
                String npin = newPinText.getText();
                String rpin = reNewPinText.getText();
                if(!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null,"Entered PIN doesn't match");
                    return;
                }
                if(npin.equals("")) {
                    JOptionPane.showMessageDialog(null,"Please enter the pin");
                    return;
                }
                if(rpin.equals("")) {
                    JOptionPane.showMessageDialog(null,"Please re-enter the PIN");
                    return;
                }
                Conn conn = new Conn();
                String query1 = "update bank set pin = '"+rpin+"' where pin = '"+pin+"'";
                String query2 = "update login set pinValue='"+rpin+"' where pinValue = '"+pin+"'";
                String query3 = "update signupthree set pinValue='"+rpin+"' where pinValue = '"+pin+"'";
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
        else {
            setVisible(false);
            new Transactions(pin).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}
