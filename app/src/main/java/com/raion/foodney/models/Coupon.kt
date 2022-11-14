package com.raion.foodney.models

data class Coupon(
    val id: String,
    val name: String,
    val couponDesc: String,
    val cost: Int,
    val image: Int?
) {
    constructor() : this("", "", "", 0, null)
}

object CouponDummy {
    val couponData = arrayListOf(
        // TODO: INSERT DUMMY DATA HERE
        Coupon(
            "coupon_01",
            "Mie Bakar Celaket",
            "Beli makanan apa saja dan dapatkan potongan sebesar Rp 10.000,00",
            10000,
            null
        ),
        Coupon(
            "coupon_02",
            "Pecel Sambal Tumpang Bu Djarot",
            "Beli makanan apa saja dan dapatkan potongan sebesar Rp 5.000,00",
            5000,
            null
        ),
        Coupon(
            "coupon_03",
            "Es Setrup \" Slamet \"",
            "Beli makanan apa saja dan dapatkan potongan sebesar Rp 7.500,00",
            7500,
            null
        ),
        Coupon(
            "coupon_04",
            "Lalapan Cak Midi",
            "Beli makanan apa saja dan dapatkan potongan sebesar Rp 8.000,00",
            8000,
            null
        ),
        Coupon(
            "coupon_05",
            "Lalapan Belut Fresh",
            "Beli makanan apa saja dan dapatkan potongan sebesar Rp 15.000,00",
            15000,
            null
        ),
        Coupon(
            "coupon_06",
            "Tahu Campur Dan Tahu Telor Cak Roon",
            "Beli makanan apa saja dan dapatkan potongan sebesar Rp 10.000,00",
            10000,
            null
        )
    )
}
