package com.qtrung.odercoffee.model

import com.qtrung.odercoffee.R

data class Drink (
    val avatar: Int = R.mipmap.ic_launcher,
    val name: String,
    var price: String,
    var oderCount: Int =0,
    val id: Int = 0
)