package com.teacher.professions.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@NoArgsConstructor
@Document

public class Teacher {

    @Id
    private String idTeacher;
    private int yearsOfTeacher;
    private String nameTeacher;






}
