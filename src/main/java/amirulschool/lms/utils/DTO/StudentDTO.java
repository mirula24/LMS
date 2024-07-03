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

public class StudentDTO {

    @NotBlank
    private String name;
    private String nim;
    @Column(name = "birth_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
}
