package com.tiagomaniero.pokedex.repository;

import com.tiagomaniero.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokemonRepository extends ReactiveMongoRepository<Pokemon, String> {

}
