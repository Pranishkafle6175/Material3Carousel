package com.example.carousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.carousel.databinding.ActivityMainBinding
import com.google.android.material.carousel.CarouselLayoutManager

class MainActivity : AppCompatActivity() {

    private var list = ArrayList<Model>()
    private val context=this


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list.add(Model(R.drawable.nature,"Foreground"))
        list.add(Model(R.drawable.nature2,"Foreground"))
        list.add(Model(R.drawable.nature3,"Foreground"))
        list.add(Model(R.drawable.nature2,"Foreground"))
        list.add(Model(R.drawable.nature,"Foreground"))
        list.add(Model(R.drawable.nature3,"Foreground"))
        list.add(Model(R.drawable.nature2,"Foreground"))
        list.add(Model(R.drawable.nature,"Foreground"))

        val adapter= CarouselAdapter(list, context)

        binding.carouselRecylerView.setLayoutManager(CarouselLayoutManager())
        binding.carouselRecylerView.adapter=adapter


    }
}