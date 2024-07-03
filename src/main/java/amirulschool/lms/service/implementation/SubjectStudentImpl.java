package amirulschool.lms.service.implementation;

import amirulschool.lms.model.Student;
import amirulschool.lms.model.SubjectStudent;
import amirulschool.lms.repository.SubjectStudentRepository;
import amirulschool.lms.service.SubjectStudentService;
import amirulschool.lms.utils.DTO.SubjectStudentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubjectStudentImpl implements SubjectStudentService {
    private final SubjectStudentRepository subjectStudentRepository;


    @Override
    public SubjectStudent create(SubjectStudentDTO subject){
        return null;
    }

    @Override
    public SubjectStudent update(Integer id, SubjectStudentDTO student) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Page<SubjectStudent> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public SubjectStudent findOne(Integer id) {
        return null;
    }
}
