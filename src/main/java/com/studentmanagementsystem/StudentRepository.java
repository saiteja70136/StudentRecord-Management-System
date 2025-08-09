package com.studentmanagementsystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>  {
     public Student findByemail(String email);
}
