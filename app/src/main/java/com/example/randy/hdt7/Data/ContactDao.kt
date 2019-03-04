package com.example.randy.hdt7.Data
import androidx.room.*
import androidx.lifecycle.LiveData
interface ContactDao {
    @Insert
    fun insert(contact: Contact)

    @Update
    fun update(contact: Contact)

    @Delete
    fun delete(contact:Contact)

    @Query("DELETE FROM contacts_table")
    fun deleteAllNotes()

    @Query("SELECT * FROM contacts_table ORDER BY priority ASC")
    fun getAllNotes(): LiveData<List<Contact>>
}