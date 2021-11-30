package com.andile.studentsoapservice;

import com.andile.studentsoapservice.school.Student;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
@Setter
public class StudentRepository {

    private final Map<String, Student> students = new HashMap<>();

    @PostConstruct
    public void initData(){
    Student student = new Student();
    student.setName("Andile");
    student.setStandard(12);
    student.setAddress("");
    students.put(student.getName(),student);

    }
    public Student findStudent(String name) {
        return students.get(name);
    }
}
