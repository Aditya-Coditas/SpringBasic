package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;


@RestController
public class StudController {
    @Autowired
    private StudentService studserv;

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudent()
    {
        return studserv.getAllStudent();
    }

    @GetMapping("/studentRollNo")
    public int getRollNo()
    {
        return studserv.getRollNo();
    }

    @GetMapping("/studentName")
    public String getName()
    {
        return studserv.getName();
    }



    @GetMapping("/studentNames")
    public List<String> getNames()
    {
        return studserv.getNames();
    }

    @RequestMapping("/addStudent")
    public void addStudent()
    {
      studserv.addStudent();
    }

    @RequestMapping("/getUpdatedName")
    public void updateName()
    {
        studserv.updateName();
    }

    @RequestMapping("/deleteStudent")
    public void deleteStudent()
    {
       studserv.deleteStudent();
    }




}


