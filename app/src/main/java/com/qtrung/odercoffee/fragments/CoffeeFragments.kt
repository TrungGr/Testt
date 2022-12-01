package com.qtrung.odercoffee.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.qtrung.odercoffee.adapter.DrinkAdapter
import com.qtrung.odercoffee.adapter.OnDrinkItemClick
import com.qtrung.odercoffee.databinding.FragmentCoffeeBinding
import com.qtrung.odercoffee.di.DataOrder
import com.qtrung.odercoffee.model.Drink

class CoffeeFragments : Fragment() {

    private lateinit var binding: FragmentCoffeeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCoffeeBinding.inflate(inflater, container, false)
        binding.rvCoffee.apply {
            layoutManager =
                LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
            adapter = DrinkAdapter(DataOrder.listCoffee, onDrinkItemChanged)
        }
        return binding.root


    }

    private val onDrinkItemChanged = object: OnDrinkItemClick{
        override fun onDrinkItemChange(drink: Drink) {
        }
    }
}