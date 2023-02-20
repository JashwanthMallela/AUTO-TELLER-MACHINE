
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JButton login,clear,signUp;
    JTextField cardText;
    JPasswordField pinText;

    Login() {
        setLayout(null);
        setTitle("AUTOMATTED TELLER MACHINE");

        ImageIcon bankLogo = new ImageIcon(ClassLoader.getSystemResource("icons/bankimage.png"));
        Image img1 = bankLogo.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon realImage = new ImageIcon(img1);
        JLabel label1 = new JLabel(realImage);
        label1.setBounds(150, 70, 50, 50);
        add(label1);

        JLabel text = new JLabel("WELCOME TO OUR BANK");
        text.setForeground(Color.black);
        text.setBounds(230,40,500,100);
        text.setFont(new Font("Osward",Font.BOLD,30));
        add(text);

        JLabel cardNo = new JLabel("CARD-NO :");
        cardNo.setForeground(Color.black);
        cardNo.setBounds(180,200,150,50);
        cardNo.setFont(new Font("Osward",Font.BOLD,18));
        add(cardNo);

        cardText = new JTextField();
        cardText.setBounds(300,215,200,22);
        cardText.setFont(new Font("Arial",Font.BOLD,14));
        add(cardText);
        

        JLabel pinNo = new JLabel("PIN-NO :");
        pinNo.setForeground(Color.black);
        pinNo.setBounds(205,240,100,50);
        pinNo.setFont(new Font("Osward",Font.BOLD,18));
        add(pinNo);

        pinText = new JPasswordField();
        pinText.setBounds(300,255,200,22);
        pinText.setFont(new Font("Arial",Font.BOLD,14));
        add(pinText);

        login = new JButton("SIGN IN");
        login.setBounds(300,300,80,22);
        login.setBackground(Color.white);
        login.setForeground(Color.black);
        login.addActionListener(this);
        add(login);

        
        clear = new JButton("CLEAR");
        clear.setBounds(420,300,80,22);
        clear.setBackground(Color.white);
        clear.setForeground(Color.black);
        clear.addActionListener(this);
        add(clear);

        signUp = new JButton("SIGN UP");
        signUp.setBounds(300,345,200,22);
        signUp.setBackground(Color.white);
        signUp.setForeground(Color.black);
        signUp.addActionListener(this);
        add(signUp);



        getContentPane().setBackground(Color.lightGray);
        setSize(700, 500);
        setVisible(true);
        setLocation(450, 150);

    }
    public void actionPerformed(ActionEvent ae) {

          if(ae.getSource() == clear) {
            cardText.setText("");
            pinText.setText("");
          }
          else if(ae.getSource() == login) {
              Conn conn = new Conn();
              String card = cardText.getText();
              String pin = pinText.getText();
              String query = "select * from login where cnumber = '"+card+"' and pinValue = '"+pin+"'";
              try {
                  ResultSet rs = conn.s.executeQuery(query);
                  if(rs.next()) {
                      setVisible(false);
                      new Transactions(pin).setVisible(true);
                  }
                  else {
                      JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                  }
              }
              catch(Exception e) {
                  System.out.println(e);
              }
          }
          else if(ae.getSource() == signUp) {
              setVisible(false);
              new signUpOne().setVisible(true);
          }

    }

    public static void main(String[] args) {
        new Login();
    }
}