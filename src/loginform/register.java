/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author apple
 */
public class register {
    
    public void addRegister(char objective, Integer i, String user_Name, String user_Password) {
        Connection conn = MyConnection.getConnection();
        PreparedStatement ps;
        if(objective == 'i') {
            try {
                ps = conn.prepareStatement("insert into user (userName, password) values (?, ?)");
                ps.setString(1, user_Name);
                ps.setString(2, user_Password);
                
                if(ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "You successfully registered your account");
                }
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    
}
