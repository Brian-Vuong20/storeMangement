/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store_management;

/**
 *
 * @author apple
 */
public class staffBLL {
    staffDAL d = new staffDAL();
    public int addStaff(staffDTO s) {
        int i = d.addStaff(s);
        return i;
    }
    
    public int deleteStaff(staffDTO s) {
        int j = d.deleteStaff(s);
        return j;
    }
    
    public int updateStaff(staffDTO s) {
        int k = d.updateStaff(s);
        return k;
    }
}
