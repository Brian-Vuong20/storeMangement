package loginform;
import java.sql.*;
public class LoginForm {
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
        String userName = "root";
        String password = "vcv27082000";
        try {
            
            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement st = conn.createStatement();
            String s = "select * from client";
            ResultSet rs = st.executeQuery(s);
            while(rs.next()) {
                System.out.println(rs.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
}
