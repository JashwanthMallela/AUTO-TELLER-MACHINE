
import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class WithDrawl extends JFrame implements ActionListener{

    JTextField amount;
    JButton withDrawl,back;
    String pin;
    WithDrawl(String pin) {
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon  i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);

        JLabel text = new JLabel("Please enter the amount you want to deposit");
        text.setBounds(160,200,280,20);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,13));
        image.add(text);

        amount = new JTextField();
        amount.setBounds(160,230,280,20);
        image.add(amount);

        withDrawl = new JButton("WithDrawl");
        withDrawl.setBounds(355,323,100,20);
        withDrawl.addActionListener(this);
        image.add(withDrawl);

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
        if(ae.getSource() == withDrawl) {
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")) {
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to WithDrawl");
            }
            else {

                try {
                    Conn conn = new Conn();
                    String query = "insert into bank values('"+pin+"','"+date+"','WithDrawl','"+number+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Rs "+number+" WithDrawl Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
                catch(Exception e) {
                    System.out.println(e);
                }

            }
        }
        else if(ae.getSource() == back) {
            new Transactions(pin).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new WithDrawl("");
    }
}
