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
public class staffDTO {
    private String name;
    private String Roll;
    private String address;
    private String PhoneNum;
    private String gender;
    private String id;
    public staffDTO() {
        
    }
    public staffDTO(String id,String name, String Roll, String gender, String PhoneNum, String address) {
         this.id = id;
         this.name = name;
        this.Roll = Roll;
        this.gender = gender;
        this.PhoneNum = PhoneNum;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(String Roll) {
        this.Roll = Roll;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(String id) {
        this.id = id;
    }

  
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getRoll() {
        return Roll;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNum() {
        return PhoneNum;
    }
    public String getGender() {
        return gender;
    }
 }
