package academy.devdojo.springboot2.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AnimePostRequestBody {
    @NotEmpty(message = "The name cannot be empty")
    // não é necessário, pois o NotEmpty ja checa  -  @NotNull(message = "The name cannot be null")
    private String name;
}
