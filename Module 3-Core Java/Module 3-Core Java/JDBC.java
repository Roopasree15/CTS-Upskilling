import java.sql.*;

public class JDBC {
    public static void main(String[] args) {

        String url =
            "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root";

        try {
            Connection con =
                DriverManager.getConnection(
                    url, user, password);

            Statement stmt =
                con.createStatement();

            ResultSet rs =
                stmt.executeQuery(
                    "SELECT * FROM students");

            while(rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name"));
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}