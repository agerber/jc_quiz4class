package edu.uchicago.gerber.quiz4class

import android.app.Application

class CapitalsApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        app = this
    }
    companion object {
        lateinit var app: CapitalsApplication
            private set
    }
}