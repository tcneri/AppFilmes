package com.example.filmesjson

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

class MainViewModel(application: Application): AndroidViewModel(application) {

    private val context = getApplication<Application>().applicationContext
    
    fun getFilmesGson(): List<Filme> {

        var listFilmes: ArrayList<Filme> = arrayListOf()

        try {
            val jsonString = context.assets.open("filmes.json")
                .bufferedReader()
                .use { it.readText() }

            listFilmes = Gson().fromJson(jsonString, object : TypeToken<List<Filme>>() {}.type)
            return listFilmes
        } catch (ioException: IOException) {
            Log.i("MainViewModel", ioException.toString())
            return listFilmes
        }
    }
}