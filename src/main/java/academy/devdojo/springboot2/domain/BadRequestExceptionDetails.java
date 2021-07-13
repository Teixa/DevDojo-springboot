package academy.devdojo.springboot2.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

//A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, @Setter on all non-final fields,
// and @RequiredArgsConstructor!

@Data
@Builder
public class BadRequestExceptionDetails {
    private String title;
    private int status;
    private String details;
    private String developerMessage;
    private LocalDateTime timestamp;
}
