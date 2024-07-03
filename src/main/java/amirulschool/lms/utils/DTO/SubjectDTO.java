package amirulschool.lms.utils.DTO;
import amirulschool.lms.model.Subject;
import amirulschool.lms.model.Teacher;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SubjectDTO {
    private Integer id;
    @NotBlank
    private String name;
    @NotBlank
    private Integer teacher_id;
    public SubjectDTO parse(Subject subject) {
        this.id = subject.getId();
        this.name = subject.getName();
        this.teacher_id = subject.getTeacher().getId();
        return this;
    }

}
