package com.example.pokemon.api.service;

import com.example.pokemon.api.dto.PokemonDto;
import com.example.pokemon.api.dto.PokemonResponse;
import com.example.pokemon.api.models.Pokemon;

public interface PokemonService {
    PokemonDto createPokemon(PokemonDto pokemonDto);
    PokemonResponse getAllPokemon(int pageNo, int pageSize);
    PokemonDto getPokemonById(int id);
    PokemonDto updatePokemon(PokemonDto pokemonDto, int id);
    void deletePokemonId(int id);
}
