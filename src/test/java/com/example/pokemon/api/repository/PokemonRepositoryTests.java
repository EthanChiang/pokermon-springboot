package com.example.pokemon.api.repository;


import com.example.pokemon.api.models.Pokemon;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class PokemonRepositoryTests {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Test
    public void PokemonRepository_SaveAll_ReturnSavedPokemon(){

    //Arrange
    Pokemon pokemon = Pokemon.builder()
            .name("pikachu")
            .type("electric").build();

        Pokemon pokemon2 = Pokemon.builder()
                .name("pikachu2")
                .type("electric2").build();

    //Act
    Pokemon savedPokemon = pokemonRepository.save(pokemon);
    pokemonRepository.save(pokemon2);

    List<Pokemon> PokemonList = pokemonRepository.findAll();

    //Assert
    Assertions.assertThat(savedPokemon).isNotNull();
    Assertions.assertThat(savedPokemon.getId()).isGreaterThan(0);
    Assertions.assertThat(PokemonList.size()).isEqualTo(1);
    }

}
