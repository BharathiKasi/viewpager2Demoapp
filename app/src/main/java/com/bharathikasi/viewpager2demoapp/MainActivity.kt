package com.bharathikasi.viewpager2demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.bharathikasi.viewpager2demoapp.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

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

        val lTablayout = findViewById<TabLayout>(R.id.TabLayout)
        TabLayoutMediator(lTablayout,lViewPager,object :TabLayoutMediator.TabConfigurationStrategy{
            override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                tab.text = "Tab ${position}"
            }
        }).attach()

        lTablayout.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }
}