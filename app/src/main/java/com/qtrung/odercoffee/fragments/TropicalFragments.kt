package com.qtrung.odercoffee.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.qtrung.odercoffee.adapter.DrinkAdapter
import com.qtrung.odercoffee.adapter.OnDrinkItemClick
import com.qtrung.odercoffee.databinding.FragmentTropicalBinding
import com.qtrung.odercoffee.di.DataOrder
import com.qtrung.odercoffee.model.Drink

class TropicalFragments : Fragment() {

    private lateinit var binding: FragmentTropicalBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTropicalBinding.inflate(inflater, container, false)
        binding.rvTropical.apply {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)
            adapter = DrinkAdapter(DataOrder.listTropical, onDrinkItemChanged)
        }
        return binding.root
    }
    private val onDrinkItemChanged = object: OnDrinkItemClick {
        override fun onDrinkItemChange(drink: Drink) {
        }
    }
}