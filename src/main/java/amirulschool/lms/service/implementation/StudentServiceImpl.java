package amirulschool.lms.service.implementation;

import amirulschool.lms.model.Student;
import amirulschool.lms.repository.StudentRepository;
import amirulschool.lms.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public Student save(Student student) {
        String prefixNIM = student.getName()+student.getBirthDate();
        student.setNim(prefixNIM);
        return studentRepository.save(student);
    }

    @Override
    public Page<Student> findAll(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @Override
    public Student findOne(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);

    }

    @Override
    public Student update(Integer id, Student student) {
        Student student1 = this.findOne(id);
        student1.setName(student.getName());
        student1.setNim(student.getNim());
        student1.setBirthDate(student.getBirthDate());
        return studentRepository.save(student1);
    }
}
