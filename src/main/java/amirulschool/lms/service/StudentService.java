package amirulschool.lms.service;

import amirulschool.lms.model.Student;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {
    Student save(Student student);
    Page<Student> findAll( Pageable pageable);
    Student findOne(Integer id);
    void delete(Integer id);
    Student update(Integer id,Student student);
}
