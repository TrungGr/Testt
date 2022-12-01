package com.qtrung.odercoffee


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.GravityCompat
import com.google.android.material.tabs.TabLayoutMediator
import com.qtrung.odercoffee.adapter.MenuPagerAdapter
import com.qtrung.odercoffee.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabTitles = arrayOf("Coffee","Tea","Tropical Tea","Freeze","Cake")

        binding.vpMenu.adapter = MenuPagerAdapter(this)
        TabLayoutMediator(binding.tabMain, binding.vpMenu){
            tab, position -> tab.text = tabTitles[position]
        }.attach()

        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_menu_24)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.custom_menu,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            if (binding.drawer.isDrawerOpen(GravityCompat.START)){
                binding.drawer.closeDrawer(GravityCompat.START)
            }else{
                binding.drawer.openDrawer(GravityCompat.START)
            }
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}