package com.codecool.practiceapp.model

class FakeDBSingleton {



    companion object {
        var instance : FakeDBSingleton? = null
        fun getDatabase() : FakeDBSingleton {
            if (instance == null) {
                instance = FakeDBSingleton()
            }
            return instance!!
        }
    }
}