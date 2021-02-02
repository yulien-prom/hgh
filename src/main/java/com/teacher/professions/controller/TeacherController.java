package com.teacher.professions.controller;

import com.teacher.professions.Service.implementation.TeacherServiceImplementation;
import com.teacher.professions.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Teacher")

public class TeacherController {

    @Autowired
    TeacherServiceImplementation TeachervServiceImplementation;

    @GetMapping
    List<Teacher> getAllTeacher() {
        return TeachervServiceImplementation.getAllTeacher();
    }

    @GetMapping("/{idTeacher}")
    public Optional<Teacher> getTeacherById(@PathVariable String idTeacher) {
        return TeachervServiceImplementation.getTeacherById(idTeacher);

    }

    @PostMapping
    public String saveTeacher(@RequestBody Teacher teacherV){
        return TeachervServiceImplementation.SaveTeacher(teacherV);


    }

}

