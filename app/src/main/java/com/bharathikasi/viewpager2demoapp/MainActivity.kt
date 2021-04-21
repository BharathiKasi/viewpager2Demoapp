package com.bharathikasi.viewpager2demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.bharathikasi.viewpager2demoapp.adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lImageList = listOf<Int>(
            R.drawable.ic_audio_pause_icon,
            R.drawable.ic_audio_play_icon,
            R.drawable.ic_audio_player_retry,
            R.drawable.ic_call_setting,
            R.drawable.ic_inbound_search,
        )
        val lAdapter = ViewPagerAdapter(lImageList)
        val lViewPager = findViewById<ViewPager2>(R.id.ViewPager)
        lViewPager.adapter = lAdapter
    }
}