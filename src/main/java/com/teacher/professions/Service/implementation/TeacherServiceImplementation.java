package com.teacher.professions.Service.implementation;

import com.teacher.professions.Repository.TeacherRepository;
import com.teacher.professions.Service.TeacherService;
import com.teacher.professions.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

 @Service
public class TeacherServiceImplementation implements TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }

    @Override
    public Optional<Teacher> getTeacherById(String IdTeacher) {
        return teacherRepository.findById(IdTeacher);
    }

    @Override
    public String SaveTeacher(Teacher teacherV) {
        teacherRepository.save(teacherV);
        return "thanks";

    }
}
