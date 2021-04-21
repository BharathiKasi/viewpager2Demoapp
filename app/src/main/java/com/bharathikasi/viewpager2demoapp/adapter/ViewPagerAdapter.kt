package com.bharathikasi.viewpager2demoapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.bharathikasi.viewpager2demoapp.R

class ViewPagerAdapter(val pImages : List<Int>) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val lView = LayoutInflater.from(parent.context).inflate(R.layout.item_viewpager,parent,false)
        return ViewPagerViewHolder(lView)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val lCurrentImage = pImages[position]
        holder.lImage.setImageResource(lCurrentImage)
    }

    override fun getItemCount(): Int {
        return pImages.size
    }

    inner class ViewPagerViewHolder(pItemView:View) : RecyclerView.ViewHolder(pItemView){
        val lImage = pItemView.findViewById<AppCompatImageView>(R.id.IvImage)
    }
}