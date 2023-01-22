/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.informationsystem;

/**
 *
 * @author Alessandro
 */
public class Person {
    private String name, sex, baranggay, category;
    private int age;
    
    public void setName( String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setSex( String sex){
        this.sex = sex;
    } 
    
    public void setAge(int age){
        this.age = age;
    } 
    
    public int getAge(){
        return age;
    }
    
    
    public String getSex(){
        return sex;
    }
    }
