package amirulschool.lms.service;


import amirulschool.lms.model.SubjectStudent;
import amirulschool.lms.utils.DTO.SubjectStudentDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface SubjectStudentService {
    SubjectStudent create(SubjectStudentDTO student);
    SubjectStudent update(Integer id,SubjectStudentDTO student);
    void delete(Integer id);
    Page<SubjectStudent> findAll(Pageable pageable);
    SubjectStudent findOne(Integer id);

}
