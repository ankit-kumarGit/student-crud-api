package com.ankit.studentapi.service;

import com.ankit.studentapi.model.Student;
import org.springframework.stereotype.Service;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    // business logic layer

    // Temporary database to store student info
    List<Student> students = new ArrayList<>();

    // add student
    public String addStudent(Student st)
    {
        students.add(st);
        return "Student added successfully";
    }

    // get all students
    public List<Student> getAllStudents()
    {
        return students;
    }

    //get student by id
    public Student getStudentById(int id)
    {
        for(Student s : students)
        {
            if(s.getId()==id)
            {
                return s;
            }
        }
        return null;
    }

    // delete student
    public String deleteStudent(int id)
    {
        for(Student s : students)
        {
            if(s.getId()==id)
            {
                students.remove(s);
                return "Student deleted Successfully";
            }
        }
        return "Student not found";
    }

    // search By name
    public List<Student> searchByName(String name)
    {
        List<Student> result = new ArrayList<>();
        for(Student s: students)
        {
            if(s.getName().equalsIgnoreCase(name))
            {
                result.add(s);
            }
        }
        return result;
    }


}
