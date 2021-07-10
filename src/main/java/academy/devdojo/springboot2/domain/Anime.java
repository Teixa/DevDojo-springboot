package academy.devdojo.springboot2.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//como estou usando lombok não preciso criar os getters and setters e os toString que o @Data ja gera pra mim
@Data
//cria um construtor para todos os argumentos
@AllArgsConstructor
//cria um sonctrutor sem argumentos
@NoArgsConstructor
//precisa ser uma entidade
@Entity
//?
@Builder
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}