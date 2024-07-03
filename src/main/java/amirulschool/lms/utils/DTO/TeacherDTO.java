package amirulschool.lms.utils.DTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TeacherDTO {
    @NotBlank
    private String name;
    @Column(name = "birth_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
}
