package amirulschool.lms.service;

import amirulschool.lms.model.Teacher;
import amirulschool.lms.utils.DTO.TeacherDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TeacherService {
    Teacher createTeacher(TeacherDTO teacher);
    Teacher getTeacherById(Integer id);
    Page<Teacher> getAllTeachers(Pageable pageable);
    void deleteTeacherById(Integer id);
    Teacher updateTeacher(Integer id,Teacher teacher);
}
