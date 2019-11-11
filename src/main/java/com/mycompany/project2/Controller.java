/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Abdulhamid MB Alkali
 */
@RestController
public class Controller {

    @Autowired
    private StudentServices sv;

    @RequestMapping("/student")
    public List<Student> sayHello() {
        return sv.getAllRecords();
    }
     @RequestMapping(method = RequestMethod.GET,value = "/update{id}")
    public void search(int id) {
        sv.SearchdById(id);
    }
    
    
    @RequestMapping(method = RequestMethod.POST, value = "/save")
    public void Save(Student s) {
        sv.SaveRecord(s);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/update{id}")
    public void update(Student s) {
        sv.UpdateRecord(s);
    }

   
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete{id}")
    public void delete(int id) {
        sv.DeleteById(id);
    }

}
