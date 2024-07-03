package amirulschool.lms.service.implementation;


import amirulschool.lms.model.Teacher;
import amirulschool.lms.repository.TeacherRepository;
import amirulschool.lms.service.TeacherService;
import amirulschool.lms.utils.DTO.TeacherDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;
    @Override
    public Teacher createTeacher(TeacherDTO teacher) {
        Teacher newTeacher = Teacher.builder()
                .name(teacher.getName())
                .birthDate(teacher.getBirthDate().toString())
                .build();
        return teacherRepository.save(newTeacher);

    }

    @Override
    public Teacher getTeacherById(Integer id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Teacher> getAllTeachers(Pageable pageable) {
        return teacherRepository.findAll(pageable);
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
