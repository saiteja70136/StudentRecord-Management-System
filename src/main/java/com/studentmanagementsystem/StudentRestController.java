package com.studentmanagementsystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/loginpage")
    public String returnLoginPage() {
    	   return "login";
    }
    @GetMapping("/indexs")
    public String returnIndexPage() {
    	   return "index";
    }
    @GetMapping("/updateform/{id}")
    public String returnUpdateForm(@PathVariable("id")Long id) {
    	   return "updateform";
    }
    @GetMapping("/addstudent")
    public String addstudent() {
    	   return "addstudent";
    }
    // GET all students
    @GetMapping(value="/getallstudents",produces="application/json")
    @ResponseBody
    public List<Student> getAllStudents() {
        return studentService.getAll();
    }
    // GET student by ID
    @GetMapping("/getstudent/id")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.get(id);
    }
    // POST - Add new student
    @PostMapping("/addstudentdb")
    @ResponseBody
    public int createStudent(@RequestBody Student student) {
    	   if(studentService.save(student)==null)
    		   return 1;
        return 0;
    }
    // PUT - Update student
    @ResponseBody
    @PutMapping("/update/{id}")
    public int updateStudent(@PathVariable("id")Long id, @RequestBody Student st) {
    	    if(studentService.update(st, id)==null)
    	    	   return 1;
        return 0;
    }
    @GetMapping("favicon.ico")
    @ResponseBody
    void handleFavicon() {
        // do nothing
    }
    // DELETE - Remove student
    @DeleteMapping("/deletee/{id}")
    @ResponseBody
    public void deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
    }
}