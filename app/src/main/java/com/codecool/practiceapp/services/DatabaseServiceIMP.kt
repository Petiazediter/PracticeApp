package com.codecool.practiceapp.services

import com.codecool.practiceapp.model.FakeDBSingleton

class DatabaseServiceIMP : DatabaseService {
    override fun getNotes(callback : DatabaseServiceCallback.GetNotesCallback){
        val list = FakeDBSingleton.getDatabase().notes
        callback.onSuccess(list)
    }
}