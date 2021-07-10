package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class AnimeService {
   // old private static List<Anime> animes;
   // old static { animes = new ArrayList<>(List.of(new Anime(1L,"Boku No Hero"), new Anime(2L,"Berserk"))); }

    private final AnimeRepository animeRepository;
    public List<Anime> listAll(){
        return animeRepository.findAll();
    }

    public Anime findById(long id){
        return animeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
    }

    public Anime save(Anime anime){
        anime.setId(ThreadLocalRandom.current().nextLong(3,1000000));
        animes.add(anime);
        return anime;
    }


    public void delete(long id) {
        animes.remove(findById(id));
    }

    public void replace(Anime anime){
        delete(anime.getId());
        animes.add(anime);
    }
}
