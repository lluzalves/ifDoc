package com.app.daniel.ifdoc.data.dao

import androidx.room.*
import com.app.daniel.ifdoc.data.entities.DocumentEntity

@Dao
interface DocumentDao {

    @Query("select * from " + DocumentEntity.NAME)
    fun allDocuments(): List<DocumentEntity>

    @Update
    fun updateDocument(documentEntity: DocumentEntity)

    @Insert
    fun insertDocument(documentEntity: DocumentEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDocuments(documentEntity: List<DocumentEntity>) : Array<Long>

    @Delete
    @Query("delete * from " + DocumentEntity.NAME + "where " + DocumentEntity.Companion.Field.ID + " =  :id")
    fun deleteDocument(id: String)
}