package mate.academy.rickandmorty.repository;

import mate.academy.rickandmorty.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CharacterRepository extends JpaRepository<Character, Long> {
    @Query("SELECT COUNT(c) FROM Character c")
    long countAll();

    List<Character> findAllByNameContains(String name);
}
