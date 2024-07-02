package amirulschool.lms.controller;


import amirulschool.lms.model.Student;
import amirulschool.lms.service.StudentService;
import amirulschool.lms.utils.Res;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.save(student);
    }


    @GetMapping
    public ResponseEntity getAllStudents() {
        return Res.renderJson(
                studentService.findAll(),
                "I get it",
                HttpStatus.OK
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> getStudentById(@PageableDefault(size = 10) Pageable pageable) {
        Page<Student> students = studentService.findAll(pageable);


        return Res.renderJson(
                studentService.findOne(id),
                "this is",
                HttpStatus.OK
        );
    }
    @DeleteMapping("/{id}")
   public void delete(@PathVariable Integer id) {
        studentService.delete(id);
    }

    @PostMapping("/update/{id}")
    public Student updateStudent(@PathVariable Integer id,
                                 @RequestBody Student student) {
        return studentService.update(id, student);
    }
}
