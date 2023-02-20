import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn() {
        try{
            //Class.forName("com.sql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///bankmangementsystem","root","jashwanth");
            s = c.createStatement();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
