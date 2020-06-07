/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store_management;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author apple
 */
public class productBLL {
    productDAL DAL = new productDAL();
   
   
    public int addData(productDTO productDTO) throws SQLException{
        int i = DAL.addData(productDTO);
        return i;
    }
    public int deleteData(productDTO p) throws SQLException {
        int j = DAL.deleteData(p);
        return j;
    }
    public int updateData(productDTO p) throws SQLException {
        int k = DAL.updateData(p);
        return k;
    }
}
