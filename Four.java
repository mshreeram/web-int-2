import java.sql.*;
import java.util.*;

public class Four {
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "Lakshmi@123");

    Scanner sc = new Scanner(System.in);
    String uname = sc.next();
    String new_phno = sc.next();

    CallableStatement cs = con.prepareCall("{call updatePhone(?,?)}");
    cs.setString(1, uname);
    cs.setString(2, new_phno);

    cs.execute();
    System.out.println("Successfully updated");
  }

}
