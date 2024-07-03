package amirulschool.lms.controller;


import amirulschool.lms.model.Student;
import amirulschool.lms.service.StudentService;
import amirulschool.lms.utils.DTO.StudentDTO;
import amirulschool.lms.utils.page.PageResponseWrapper;
import amirulschool.lms.utils.page.Res;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody StudentDTO student) {
        return studentService.save(student);
    }


    @GetMapping
    public ResponseEntity<?> getAllStudents( @PageableDefault(size=10)Pageable pageable
    ) {

            Page<Student> res = studentService.findAll(pageable);
            PageResponseWrapper<Student> result = new PageResponseWrapper<>(res);
            return Res.renderJson(
                    result,
                    "KETEMU",
                    HttpStatus.OK
            );
    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id) {
        return studentService.findOne(id);
    }

}
