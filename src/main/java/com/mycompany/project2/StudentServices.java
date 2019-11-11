/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Abdulhamid MB Alkali
 */
@Service
public class StudentServices {

        @Autowired
        private StudentDao sdao;
    public List<Student> getAllRecords() {
        List<Student> student = new ArrayList<>();
        sdao.findAll().forEach(student::add);
        return student;
    }
    
    public void SearchdById(int id){
         sdao.findById(id).get();
      }
    public void SaveRecord(Student student){
        sdao.save(student);
    }
    public void UpdateRecord(Student student){
        sdao.save(student);
    }
    public void DeleteById(int id){
        sdao.deleteById(id);
    }
}
