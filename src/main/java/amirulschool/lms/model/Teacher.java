package amirulschool.lms.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "teachers")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Teacher {
@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
private String name;

@Column(name = "birth_date")
@JsonFormat(pattern = "yyyy-MM-dd")
private String birthDate;
}
