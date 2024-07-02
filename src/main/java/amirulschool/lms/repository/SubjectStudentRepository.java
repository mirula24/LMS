package amirulschool.lms.repository;

import amirulschool.lms.model.SubjectStudent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectStudentRepository extends CrudRepository<SubjectStudent, Integer> {
}
