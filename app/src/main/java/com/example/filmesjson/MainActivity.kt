package com.example.filmesjson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity(), FilmesAdapter.OnFilmeClickListener {
    private val viewModel:MainViewModel by viewModels()
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listFilmes = viewModel.getFilmesGson()


    }

    override fun filmeClick(position: Int) {
        TODO("Not yet implemented")
    }
}