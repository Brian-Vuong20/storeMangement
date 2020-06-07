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
public class productDTO {
    private String productId;
    private String productName;
    private String qtys;
    private String date;
    private String price;
    public productDTO() {
        productId = null;
        productName = null;
        qtys = null;
        date = null;
        price = null;
    }
    public productDTO(String productId, String productName, String qtys, String date, String price) {
        this.productId = productId;
        this.productName = productName;
        this.qtys = qtys;
        this.date = date;
        this.price = price;
      }

   
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    } 
    public String getProductName() {
        
        return productName;
    
    }
    public void setProductName(String productName) {
        
        this.productName = productName;
        
    } 
    public String getQtys() {
        return qtys;
    }
    public void setQtys(String qtys) {
        this.qtys = qtys;
    } 
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}
