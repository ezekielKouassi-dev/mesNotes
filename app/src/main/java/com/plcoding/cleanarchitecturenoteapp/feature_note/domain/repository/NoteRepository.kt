package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Cette interface expose toutes les méthodes CRUD de notes.
 */
interface NoteRepository {

    /**
     * Méthode utilisé pour avoir un flow de toutes les notes.
     */
    fun getNotes(): Flow<List<Note>>

    /**
     * Récupère une note par son id.
     */
    suspend fun recupererParIdObligatoire(id: Int): Note?

    /**
     * Enregistre une note.
     */
    suspend fun enregistrerNote(note: Note)

    /**
     * Supprime une note.
     */
    suspend fun supprimerNote(note: Note)
}