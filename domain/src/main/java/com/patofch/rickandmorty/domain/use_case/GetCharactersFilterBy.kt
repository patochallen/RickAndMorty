package com.patofch.rickandmorty.domain.use_case

import com.patofch.rickandmorty.domain.model.Character
import com.patofch.rickandmorty.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow

class GetCharactersFilterBy(
    private val characterRepository: CharacterRepository
) {

    suspend operator fun invoke(
        name: String?,
        status: String?,
        species: String?,
        type: String?,
        gender: String?
    ): Flow<List<Character>> = characterRepository.getCharactersFilterBy(
        name = name,
        status = status,
        species = species,
        type = type,
        gender = gender
    )
}