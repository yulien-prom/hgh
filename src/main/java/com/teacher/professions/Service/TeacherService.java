package com.teacher.professions.Service;

import com.teacher.professions.model.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    List<Teacher> getAllTeacher();

    Optional<Teacher> getTeacherById(String IdTeacher);

    String SaveTeacher(Teacher teacherV);

}
