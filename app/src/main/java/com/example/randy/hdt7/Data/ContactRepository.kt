package com.example.randy.hdt7.Data

class ContactRepository {
    private var repository: ContactRepository = ContactRepository(application)
    private var allContacts: LiveData<List<Contact>> = repository.getAllContacts()

    fun insert(contact: Contact){
        repository.insert(contact)
    }
    fun update(contact: Contact){
        repository.update(contact)
    }
    fun delete(contact: Contact){
        repository.delete(contact)
    }
    fun deleteAllContacts(){
        repository.deleteAllContacts()
    }
    fun getAllContacts(): LiveData<List<Contact>>{
        return allContacts
    }
}