/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store_management;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author apple
 */
public class staffDAL {
    
    public int addStaff(staffDTO d) {
        int i = 0;
        Connection conn = MyConnection.getConnection();
        PreparedStatement ps;
        
        String sql = "insert into myDatabase.`staff`(id, staff_name, staff_role, gender, phone,  address) values (?, ?, ?, ?, ?, ?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, d.getId());
            ps.setString(2, d.getName());
            ps.setString(3, d.getRoll());
            ps.setString(4, d.getGender());
            ps.setString(5, d.getPhoneNum());
            ps.setString(6, d.getAddress());
            i = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(staffDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        return i;
    }
    public int deleteStaff(staffDTO d) {
        int j = 0;
        Connection conn = MyConnection.getConnection();
        PreparedStatement ps;
        
        String sql = "delete from staff where staff_name = ?";
        try {
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, d.getName());
            
            j = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(staffDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        return j;
    }
    public int updateStaff(staffDTO d) {
        int k = 0;
        Connection conn = MyConnection.getConnection();
        PreparedStatement ps;
        
        String sql = "update myDatabase.`staff` set staff_name = ?, staff_role = ?, gender = ?, phone = ?, address = ? where id = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(6, d.getId());
            ps.setString(1, d.getName());
            ps.setString(2, d.getRoll());
            ps.setString(3, d.getGender());
            ps.setString(4, d.getPhoneNum());
            ps.setString(5, d.getAddress());
            k = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(staffDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        return k;
    }
}
