package com.teacher.professions.Repository;

import com.teacher.professions.model.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher,String> {

}
