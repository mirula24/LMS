package amirulschool.lms.service;

import amirulschool.lms.model.Student;
import amirulschool.lms.utils.DTO.StudentDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface StudentService {
    Student save(StudentDTO student);
    Page<Student> findAll( Pageable pageable);
    Student findOne(Integer id);
    void delete(Integer id);
    Student update(Integer id,Student student);
}
