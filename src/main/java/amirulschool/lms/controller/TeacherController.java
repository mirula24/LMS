package amirulschool.lms.controller;


import amirulschool.lms.model.Teacher;
import amirulschool.lms.service.TeacherService;
import amirulschool.lms.utils.DTO.TeacherDTO;
import amirulschool.lms.utils.page.PageResponseWrapper;
import amirulschool.lms.utils.page.Res;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherService teacherService;
    @GetMapping
    public ResponseEntity<?> getTeacher (@PageableDefault(size = 10) Pageable pageable) {
        Page<Teacher> res = teacherService.getAllTeachers(pageable);
        PageResponseWrapper<Teacher> result = new PageResponseWrapper<>(res);
        return Res.renderJson(
                result,
                "The Teacher",
                HttpStatus.OK

        );
    }
    @PostMapping
    public Teacher createTeacher (@RequestBody TeacherDTO teacher) {
        return teacherService.createTeacher(teacher);
    }
}
