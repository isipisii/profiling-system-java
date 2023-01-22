/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.informationsystem;

/**
 *
 * @author Alessandro
 */
public class Resident extends Person{
    
    String baranggay, category;
    
    public void setBaranggay(String baranggay){
        this.baranggay = baranggay;
    } 
    
    public String getBaranggay(){
        return baranggay;
    }
    public void setAgeCategory(String c){
        category = c;
    }
    
    public String getAgeCategory(){
        return category;
    }

    
}
