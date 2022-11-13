package com.example.listapelisconget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listapelisconget.Adapter.FilmAdapter
import com.example.listapelisconget.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var adapter: FilmAdapter
    private var listapelisImagen = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()

        val decoration = DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        val manager = LinearLayoutManager(this)

       // binding.recycler.layoutManager =LinearLayoutManager(this)
       // binding.recycler.adapter = FilmAdapter(listapelisImagen)
        //binding.recycler.addItemDecoration(decoration)
    }

    private fun initRecyclerView(){
        adapter = FilmAdapter(listapelisImagen)
        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = adapter

    }


    private fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    private fun searchByName(query:String)  {
        CoroutineScope(Dispatchers.IO).launch {
            val call: Response<FilmResponse> = getRetrofit().create(APIService::class.java).getFilm("$query/images")

            }

    }

    private fun showError() {
        Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_SHORT).show()
    }




}