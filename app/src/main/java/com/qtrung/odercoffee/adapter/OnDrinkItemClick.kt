package com.qtrung.odercoffee.adapter

import com.qtrung.odercoffee.model.Drink

interface OnDrinkItemClick {
    fun onDrinkItemChange(drink: Drink)
}