package com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source

import androidx.room.*
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * La couche DAO pour faire les requêtes.
 */
@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun recupererParIdObligatoire(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun enregistrerNote(note: Note)

    @Delete
    suspend fun supprimerNote(note: Note)
}