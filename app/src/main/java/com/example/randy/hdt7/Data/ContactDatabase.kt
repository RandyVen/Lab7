package com.example.randy.hdt7.Data

import android.content.Context

class ContactDatabase {
    companion object {
        private var instace:ContactDatabase? = null

        fun getInstace(context: Context):ContactDatabase?{
            if (instace==null){
                synchronized(ContactDatabase::class){
                    instace = Room.databaseBuilder(
                        context.applicationContext,
                        ContactDatabase::class.java,"contacts_database"
                    ).fallbackToDestructiveMigration().addCallback(roomCallback).build()
                }
            }
            return instace
        }
        fun destroyInstace(){
            instace=null
        }
        private val roomCallback = object : RoomDatabase.Callback(){
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                PopulateDbAsyncTask(instace).execute()
            }
        }
    }
}