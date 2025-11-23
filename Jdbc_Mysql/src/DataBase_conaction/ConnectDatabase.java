package DataBase_conaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDatabase {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/taskhub";
    private static final String USER = "root";     // your mysql username
    private static final String PASS = "";     // your mysql password

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded!");

            // Connect to Taskhub DB
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to Taskhub Database!");

            // Create statement
            stmt = conn.createStatement();

            // Query users table
            String sql = "SELECT user_id, name, email FROM users"; 
            rs = stmt.executeQuery(sql);

            System.out.println("=== Users Table Data ===");
            while (rs.next()) {
                int id = rs.getInt("user_id");
                String uname = rs.getString("name");
                String email = rs.getString("email");

                System.out.println("ID: " + id + ", Username: " + uname + ", Email: " + email);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    }
}
