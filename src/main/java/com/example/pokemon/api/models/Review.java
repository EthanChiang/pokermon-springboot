package com.example.pokemon.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Review {
    @Id
    private int id;
    private String title;
    private String content;
    private int stars;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="pokemon_id")
    private Pokemon pokemon;

}
