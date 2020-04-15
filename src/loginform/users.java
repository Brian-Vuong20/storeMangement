/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

/**
 *
 * @author apple
 */
public class users {
    private String productId;
    private String productName;
    private String qtys;
    private String date;
    private String price;
 
    public users(String productId, String productName, String qtys, String date, String price) {
        this.productId = productId;
        this.productName = productName;
        this.qtys = qtys;
        this.date = date;
        this.price = price;
      }

   
    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public String getQtys() {
        return qtys;
    }
    public String getDate() {
        return date;
    }
    public String getPrice() {
        return price;
    }
}
