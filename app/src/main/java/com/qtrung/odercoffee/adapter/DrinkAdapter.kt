package com.qtrung.odercoffee.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ScrollCaptureCallback
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.qtrung.odercoffee.databinding.ItemDrinkBinding
import com.qtrung.odercoffee.model.Drink

class DrinkAdapter (
    private val drinks: List<Drink>,
    private val callback: OnDrinkItemClick
) :
    RecyclerView.Adapter<DrinkAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemDrinkBinding.inflate(LayoutInflater.from(parent.context))
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(drinks[position])
    }

    override fun getItemCount(): Int = drinks.size
    inner class ViewHolder(private val binding: ItemDrinkBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(drink: Drink) {
            with(binding) {
                imgAvatar.setImageResource(drink.avatar)
                tvName.text = drink.name
                tvPrice.text = drink.price
                btnUp.setOnClickListener {
                    drink.oderCount = drink.oderCount +1
                    tvAmount.text = drink.oderCount.toString()
                    callback.onDrinkItemChange(drink) }
                btnDown.setOnClickListener {
                    drink.oderCount = drink.oderCount -1
                    tvAmount.text = drink.oderCount.toString()
                    callback.onDrinkItemChange(drink) }
            }

        }

    }

}