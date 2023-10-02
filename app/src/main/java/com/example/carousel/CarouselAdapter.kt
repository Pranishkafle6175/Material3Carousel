package com.example.carousel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.carousel.databinding.ActivityMainBinding
import com.example.carousel.databinding.CarouselLayoutBinding
import kotlinx.coroutines.NonDisposableHandle.parent


class CarouselAdapter(private val list: ArrayList<Model>,val context:Context) :
    RecyclerView.Adapter<CarouselAdapter.ViewHolder>() {


    class ViewHolder(val binding: CarouselLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        val binding = CarouselLayoutBinding
            .inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemlist = list[position]
        holder.binding.carouselImageView.setImageResource(itemlist.image)
        holder.binding.nametext.text=itemlist.name
    }

    override fun getItemCount() = list.size

}
