package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    int roll_no;
    String name;

    public int getRollNo()
    {
        return roll_no;
    }
    public String getName()
    {
        return name;
    }

    public void setRollNo(int roll_no)
    {
      this.roll_no=roll_no;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                '}';
    }
}
