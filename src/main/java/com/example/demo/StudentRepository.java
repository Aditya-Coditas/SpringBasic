package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

   @Query("select s.name from Student s")
    List<String> getAllName();

   @Query("select roll_no from Student s where s.name like ?1")
    int get_Roll_No(String name);

   @Query("select name from Student s where s.roll_no=?1")
    String getName(int roll_no);


}
