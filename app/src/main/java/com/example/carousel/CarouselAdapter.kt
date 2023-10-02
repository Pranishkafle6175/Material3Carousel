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
//        val view = LayoutInflater.from(viewGroup.context)
//            .inflate(R.layout.carousel_layout, viewGroup, false)
//
//        return ViewHolder(view)

        val binding = CarouselLayoutBinding
            .inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)


    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

    }

    override fun getItemCount() = list.size

}
