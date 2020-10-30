package com.codecool.practiceapp.model

class FakeDBSingleton(
    val notes : ArrayList<Note>
){
    companion object {
        private var instance : FakeDBSingleton? = null
        fun getDatabase() : FakeDBSingleton {
            if (instance == null) {
                instance = FakeDBSingleton(arrayListOf())
            }
            return instance!!
        }
    }
}