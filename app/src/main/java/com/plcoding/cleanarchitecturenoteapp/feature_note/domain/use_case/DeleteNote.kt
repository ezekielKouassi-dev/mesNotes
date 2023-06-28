package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class supprimerNote(
    private val repository: NoteRepository
) {

    /**
     * Suppression d'une note.
     */
    suspend operator fun invoke(note: Note) {
        repository.supprimerNote(note)
    }
}