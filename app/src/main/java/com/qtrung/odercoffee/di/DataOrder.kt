package com.qtrung.odercoffee.di

import com.qtrung.odercoffee.R
import com.qtrung.odercoffee.model.Drink

object DataOrder {
    val listCoffee = arrayListOf(
        Drink(R.drawable.den_da, name = "Phin Đen Đá", price = "29000"),
        Drink(R.drawable.sua_da,name = "Phin Sữa Đá", price = "29000"),
        Drink(R.drawable.bac_xiu,name = "Bạc Xỉu Đá", price = "29000"),
        Drink(R.drawable.hanhx,name = "Phindi Hạnh Nhân", price = "45000"),
        Drink(R.drawable.kem_sua,name = "Phindi Kem Sua", price = "45000"),
        Drink(R.drawable.choco,name = "Phindi Choco", price = "45000"),
    )
    val listTea = arrayListOf(
        Drink(R.drawable.senvang_t,name = "Trà Sen Vàng", price = "45000"),
        Drink(R.drawable.vai_t,name = "Trà Thạch Vải", price = "45000"),
        Drink(R.drawable.thanhdao_t,name = "Trà Thanh Đào", price = "45000"),
        Drink(R.drawable.daudo_t,name = "Trà Xanh Đậu Đỏ", price = "45000"),
        Drink(R.drawable.thachdao_t,name = "Trà Thạch Đào", price = "45000"),
        Drink(R.drawable.vangnang_t,name = "Trà Sen Vàng(Củ Năng)", price = "45000"),
    )
    val listFreeze = arrayListOf(
        Drink(R.drawable.caramel_fz,name = "Caramel Phin Freeze", price = "55000"),
        Drink(R.drawable.caramel_fz,name = "Classic Phin Freeze", price = "55000"),
        Drink(R.drawable.matcha_fz,name = "Freeze Trà Xanh", price = "55000"),
        Drink(R.drawable.scl_fz,name = "Freeze Sô Cô La", price = "55000"),
        Drink(R.drawable.cookies_fz,name = "Cookies & Cream", price = "55000"),
    )
    val listTropical = arrayListOf(
        Drink(R.drawable.oi_t, name = "Trà Ổi Hồng", price = "55000"),
        Drink(R.drawable.mo_t,name = "Trà Mơ Sơ Ri", price = "55000"),
        Drink(R.drawable.xoai_t,name = "Trà Xoài Nhiệt Đới", price = "55000"),
    )
    val listCake = arrayListOf(
        Drink(R.drawable.phomai_cafe,name = "Bánh Phô Mai Cà Phê", price = "29000"),
        Drink(R.drawable.tiramisu,name = "Bánh Tiramisu", price = "35000"),
        Drink(R.drawable.phomai_matcha,name = "Bánh Phô Mai Trà Xanh", price = "35000"),
        Drink(R.drawable.phomai_chanhday,name = "Bánh Phô Mai Chanh Dây", price = "29000"),
        Drink(R.drawable.mousse_dao,name = "Bánh Mousse Đào", price = "35000"),
        Drink(R.drawable.mousse_cacao,name = "Bánh Mousse Cacao", price = "35000"),
        Drink(R.drawable.chuoi,name = "Bánh Chuối", price = "29000"),
        Drink(R.drawable.scl_hl,name = "Bánh Sô Cô La Highlands", price = "35000"),
        Drink(R.drawable.caramel_phomai,name = "Bánh Caramel Phô Mai", price = "35000"),
    )
}