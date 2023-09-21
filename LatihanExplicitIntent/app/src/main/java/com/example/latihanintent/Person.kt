package com.example.latihanintent

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Person (
    val name: String?,
    val  age: Int?,
    val email: String?,
    val city: String?
    ) : Parcelable

/*
Parcelable adalah suatu interface yang memungkinkan kita melakukan pengiriman satu objek sekaligus dari suatu Activity ke Activity lain.
Objek yang diimplementasikan dengan Parcelable akan memudahkan Anda dalam mengirimkan data dari satu Activity ke Activity lainnya.

Anotasi @Parcelize yang terletak di atas nama kelas digunakan untuk memberi tanda bahwa kelas tersebut dipilih untuk menjadi parcelable.
@Parcelize juga otomatis men-generate semua kode yang digunakan untuk implemetasi parcelize sebelumnya.
*/





