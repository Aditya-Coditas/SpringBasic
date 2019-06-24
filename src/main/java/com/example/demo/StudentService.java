package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    StudentRepository studRepo;

    public List<Student> getAllStudent()
    {
        List<Student> studentList = studRepo.findAll();
        System.out.println("StudentList==========================>"+studentList);
        return studentList;
    }

    public int getRollNo()
    {
        return studRepo.get_Roll_No("Adi");
    }

    public String getName()
    {
        return studRepo.getName(4);
    }

    public List<String> getNames()
    {
        List<String> names=studRepo.getAllName();
        return names;
    }

    public void addStudent()
    {
        Student s=new Student();
         s.setName("Ram");
         s.setRollNo(8);
         studRepo.save(s);
    }

    public void updateName()
    {
        Student s=new Student();
        s.setRollNo(3);
        s.setName("Aditya");
        studRepo.save(s);
    }

    public void deleteStudent()
    {
        Student s=new Student();
        s.setName("Aditya");
        s.setRollNo(11);
        studRepo.delete(s);

    }






}
