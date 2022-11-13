package com.example.listapelisconget.Adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listapelisconget.Film
import com.example.listapelisconget.databinding.ItemFilmBinding

class FilmViewHolder(view: View) :RecyclerView.ViewHolder(view) {

    val binding =ItemFilmBinding.bind(view)
    fun render(filmModel: Film) {
        binding.FilmName.text=filmModel.film



        Glide.with(binding.FilmPhoto.context).load(filmModel.photo).into(binding.FilmPhoto)

        //IMAGEN
        binding.FilmPhoto.setOnClickListener{Toast.makeText(binding.FilmPhoto.context,filmModel.film,Toast.LENGTH_LONG).show()}

        //Hacer clic sobre la celda
        itemView.setOnClickListener{Toast.makeText(binding.FilmPhoto.context,filmModel.film,Toast.LENGTH_LONG).show()}



    }
}