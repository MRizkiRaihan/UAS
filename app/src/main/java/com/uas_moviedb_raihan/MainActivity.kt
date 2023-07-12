package com.uas_moviedb_raihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayoutMediator
import com.uas_moviedb_raihan.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPagerAdapter: ViewPageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPagerAdapter = ViewPageAdapter(supportFragmentManager, lifecycle)

        with(binding){
            viewPager.adapter = viewPagerAdapter

            TabLayoutMediator(botLayout, viewPager) { tab, position ->
                when(position){
                    0 -> tab.setIcon(R.drawable.baseline_movie_24).text = "Movie"
                    1 -> tab.setIcon(R.drawable.baseline_tv_24).text = "TV"
                }
            }.attach()
        }
    }
}