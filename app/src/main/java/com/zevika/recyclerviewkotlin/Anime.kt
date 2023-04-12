package com.zevika.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

class Anime (
    val imganime: Int,
    val nameanime: String,
    val descanime: String
        ): Parcelable


