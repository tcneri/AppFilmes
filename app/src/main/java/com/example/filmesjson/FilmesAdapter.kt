package com.example.filmesjson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import javax.xml.transform.ErrorListener

class FilmesAdapter(private val listFilmes:ArrayList<Filme>, val listener: OnFilmeClickListener):RecyclerView.Adapter<FilmesAdapter.FilmesViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FilmesAdapter.FilmesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_filme, parent,false)
        return FilmesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FilmesAdapter.FilmesViewHolder, position: Int) {
        var filme = listFilmes.get(position)
        holder.tvNome.text = filme.nome
        holder.tvCategoria.text = filme.categoria
    }

    override fun getItemCount() = listFilmes.size

    interface OnFilmeClickListener{
        fun filmeClick(position: Int)
    }

    inner class FilmesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView),View.OnClickListener{
        val tvNome:TextView = itemView.findViewById(R.id.tvNome)
        val tvCategoria:TextView = itemView.findViewById(R.id.tvCategoria)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {

        }

    }
}