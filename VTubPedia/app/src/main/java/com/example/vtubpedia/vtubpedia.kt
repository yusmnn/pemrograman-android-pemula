package com.example.vtubpedia

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Vtubpedia(
    val name: String,
    val agency: String,
    val description: String,
    val photo: String
) : Parcelable
