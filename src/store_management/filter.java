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
public class filter {
    
    private String productId;
    private String productName;
    private String date;
    private String qty;
    private String price;
    public filter() {
        
    }
    public filter(String productId, String productName, String date, String qty, String price) {
        this.productId = productId;
        this.productName = productName;
        this.date = date;
        this.qty = qty;
        this.price = price;
    }
    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public String getDate() {
        return date;
        
    }
    public String getQty() {
        return qty;
    }
    public String getPrice(){
        return price;
    }
}
