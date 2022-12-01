package com.qtrung.odercoffee.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.qtrung.odercoffee.databinding.ActivityMainBinding
import com.qtrung.odercoffee.fragments.*
import java.lang.IllegalArgumentException

class MenuPagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity){
    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> CoffeeFragments()
            1 -> TeaFragments()
            2 -> TropicalFragments()
            3 -> FreezeFragments()
            4 -> CakeFragments()
            else -> throw IllegalArgumentException(" Unknown fragment for position $position")
        }
    }
}