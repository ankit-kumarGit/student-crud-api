package com.ankit.studentapi.controller;

import com.ankit.studentapi.model.Student;
import com.ankit.studentapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    // calling service class -> this call DI
    private final StudentService service;

    //Controller uses Service via Dependency Injection
    // constructor injection not @AutoWired
//    @Autowired
//    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    //get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // GET /students/{id}
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id)
    {
        return service.getStudentById(id);
    }

    //POST /students
    @PostMapping
    public String addStudent(@RequestBody Student st)
    {
        return service.addStudent(st);
    }

    //DELETE /students/{id}
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id)
    {
        return service.deleteStudent(id);
    }

    //search By name
    @GetMapping("/search")
    public List<Student> searchByName(@RequestParam String name)
    {
        return service.searchByName(name);
    }


}
