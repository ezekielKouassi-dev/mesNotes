package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.InvalidNoteException
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

/**
 * Cas d'utilisation de l'ajout d'une note dans la base.
 */
class AddNote(
    private val repository: NoteRepository
) {

    /**
     * On lève une exception lorsque le titre ou le contenu de la note est vide.
     */
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("Le titre d'une note ne peut être vide.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("Le contenu ne peut être vide.")
        }
        repository.enregistrerNote(note)
    }
}