/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author apple
 */
public class Product {
    
    public void insertDeleteUpdateProduct(char operation,Integer Id, String productID, String product_Name, String qtys, String date, 
            String product_price){
        
       Connection conn = MyConnection.getConnection();
       PreparedStatement ps;
       if(operation == 'i') {
       try {
       ps = conn.prepareStatement("insert into Product (idProduct, ProductName, Date_d, QTY, Price) values (?, ?, ?, ?, ?)");
       ps.setString(1, productID);
       ps.setString(2, product_Name);
       ps.setString(3, date);
       ps.setString(4, qtys);
       ps.setString(5, product_price);
       if(ps.executeUpdate() > 0) {
           JOptionPane.showMessageDialog(null, "1 row has been added to database");
          
        }
       
        }catch(SQLException e) {
           
        }
       }
    }

    

   
}
