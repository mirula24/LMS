package amirulschool.lms.service;

import amirulschool.lms.model.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher createTeacher(Teacher teacher);
    Teacher getTeacherById(Integer id);
    List<Teacher> getAllTeachers();
    void deleteTeacherById(Integer id);
    Teacher updateTeacher(Integer id,Teacher teacher);
}
