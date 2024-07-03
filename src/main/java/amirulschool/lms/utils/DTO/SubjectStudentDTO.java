package amirulschool.lms.utils.DTO;
import amirulschool.lms.model.Student;
import amirulschool.lms.model.Subject;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SubjectStudentDTO {
    private Integer id;
    @NotBlank
    private Integer studentId;
    @NotBlank
    private Integer subjectId;

    @Column(name = "birth_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date StartDate;

    @Column(name = "birth_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private Boolean Complted;





}
