package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

/**
 * Classe représentant tout les cas d'utilisation pour une notes.
 */
data class NoteUseCases(
    val getNotes: GetNotes,
    val supprimerNote: supprimerNote,
    val addNote: AddNote,
    val getNote: GetNote
)
