package com.example.listapelisconget.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listapelisconget.Film
import com.example.listapelisconget.FilmProvider.Companion.filmList
import com.example.listapelisconget.R

class FilmAdapter(private val filmList:List<Film>):RecyclerView.Adapter<FilmViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val layoutInflate = LayoutInflater.from(parent.context)
        return FilmViewHolder(layoutInflate.inflate(R.layout.item_film,parent,false))
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val item = filmList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return filmList.size
    }
}