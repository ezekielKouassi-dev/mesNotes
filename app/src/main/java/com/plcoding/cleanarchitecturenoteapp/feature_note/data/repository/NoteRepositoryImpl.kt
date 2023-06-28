package com.plcoding.cleanarchitecturenoteapp.feature_note.data.repository

import com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source.NoteDao
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

/**
 * Classe d'implementation de l'interface noteRepository.
 * Ici on l'implementation de toutes les méthodes du repository.
 */
class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {

    /**
     * Retourne la liste de toutes les notes.
     *
     * @return la liste des notes.
     */
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    /**
     * Récupère une note par son id.
     *
     * @return la note qui correspond  l'id.
     */
    override suspend fun recupererParIdObligatoire(id: Int): Note? {
        return dao.recupererParIdObligatoire(id)
    }

    /**
     * Enregistre une note dans la base de donnée.
     */
    override suspend fun enregistrerNote(note: Note) {
        dao.enregistrerNote(note)
    }

    /**
     * Supprime une note de la base donnée.
     */
    override suspend fun supprimerNote(note: Note) {
        dao.supprimerNote(note)
    }
}