/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2;

/**
 *
 * @author Abdulhamid MB Alkali
 */
public class Student {
        
     private int id;
    private String name;
    private long regno;

    public Student(int id, String name, long regno) {
        this.id = id;
        this.name = name;
        this.regno = regno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRegno() {
        return regno;
    }

    public void setRegno(long regno) {
        this.regno = regno;
    }
    
    
}
