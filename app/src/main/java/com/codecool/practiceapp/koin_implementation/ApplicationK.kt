package com.codecool.practiceapp.koin_implementation

import android.app.Application
import com.codecool.practiceapp.services.DatabaseService
import com.codecool.practiceapp.services.DatabaseServiceIMP
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.dsl.module

class ApplicationK : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@ApplicationK)
            modules(koinModule)
        }
    }
}

val koinModule = module {
    single<DatabaseService> { DatabaseServiceIMP() }
}