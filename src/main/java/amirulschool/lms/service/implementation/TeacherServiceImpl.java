package amirulschool.lms.service.implementation;


import amirulschool.lms.model.Teacher;
import amirulschool.lms.repository.TeacherRepository;
import amirulschool.lms.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;
    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher getTeacherById(Integer id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public void deleteTeacherById(Integer id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public Teacher updateTeacher(Integer id, Teacher teacher) {
        Teacher request = teacherRepository.findById(id).orElse(null);
        request.setName(teacher.getName());
        request.setBirthDate(teacher.getBirthDate());

        return null;
    }
}
