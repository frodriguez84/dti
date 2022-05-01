package com.example.mydti.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Favoritos (

    var name : String,
    var temp: String,
    var clima: String,
    var aforo: Int,
    var parking: Int,
    var viento: String,
    var image : Int


) : Parcelable {
}