package com.studentmanagementsystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAll() {
        return repo.findAll();
    }
    public Student save(Student student) {
    	    Student ss = repo.findByemail(student.getEmail());
    	    if(ss==null)
          return repo.save(student);
    	    else
    	    	  return null;
    }
    public void delete(Long id) {
        repo.deleteById(id);
    }
    public Student get(Long id) {
        return repo.findById(id).orElse(null);
    }
    public Student update(Student st,Long id){
    	    Student find = repo.findByemail(st.getEmail());
    	    if(find==null||find.getId()==id){
	    	    Student s=repo.findById(id).orElse(null);
	    	    s.setAge(st.getAge());
	    	    s.setEmail(st.getEmail());
	    	    s.setName(st.getName());
	    	    return repo.save(s);
    	    }else 
    	    	    return null;
    }
    
}
