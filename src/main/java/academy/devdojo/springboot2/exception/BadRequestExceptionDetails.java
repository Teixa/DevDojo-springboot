package academy.devdojo.springboot2.exception;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

//A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, @Setter on all non-final fields,
// and @RequiredArgsConstructor!

@Getter
@SuperBuilder

public class BadRequestExceptionDetails extends ExceptionDetails{

}
