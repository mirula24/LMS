package amirulschool.lms.utils.page;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WebResponse<T> {
    private String status;
    private String message;
    private T data;
}
