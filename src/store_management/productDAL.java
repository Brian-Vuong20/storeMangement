/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author apple
 */
public class productDAL {
    public int addData(productDTO p) throws SQLException {
       Connection conn = MyConnection.getConnection();
       PreparedStatement ps;
        
           int i = 0;
           String sql = "insert into Product(idProduct, productName, Date_d, QTy, Price) values (?, ?, ?, ?, ?) ";
           ps = conn.prepareStatement(sql);
           ps.setString(1, p.getProductId());
           ps.setString(2, p.getProductName());
           ps.setString(3, p.getDate());
           ps.setString(4, p.getQtys());
           ps.setString(5, p.getPrice());
           i = ps.executeUpdate();
           
           return i;
      
   }
    public int deleteData(productDTO p) throws SQLException {
        Connection conn = MyConnection.getConnection();
        String sql1 = "delete from Product where idProduct = ?";
        PreparedStatement ps;
        int j = 0;
        ps = conn.prepareStatement(sql1);
        ps.setString(1, p.getProductId());
        j = ps.executeUpdate();
        return j;
    }
    
    public int updateData(productDTO p)  throws SQLException {
        Connection conn = MyConnection.getConnection();
        PreparedStatement ps;
        String sql2 = "update Product set productName = ?,   Date_d = ?,  Qty = ?, Price = ? where idProduct = ?";
        ps = conn.prepareStatement(sql2);
        ps.setString(1, p.getProductName());
        ps.setString(2, p.getDate());
        ps.setString(3, p.getQtys());
        ps.setString(4, p.getPrice());
        ps.setString(5, p.getProductId());
        int k = ps.executeUpdate();
        return k;
    }
}
