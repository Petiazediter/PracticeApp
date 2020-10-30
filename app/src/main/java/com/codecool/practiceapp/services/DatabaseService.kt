package com.codecool.practiceapp.services

import com.codecool.practiceapp.model.Note

interface DatabaseService {
    fun getNotes (view : DatabaseServiceCallback.GetNotesCallback)
}

object DatabaseServiceCallback{
    interface GetNotesCallback{
        fun onSuccess ( notes : List<Note> )
        fun onError ( message : String )
    }
}