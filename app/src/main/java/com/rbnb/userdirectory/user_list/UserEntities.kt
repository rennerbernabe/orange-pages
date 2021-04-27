package com.rbnb.userdirectory.user_list

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class User(
    val id: Int,
    val name: String,
    val username: String,
    val email: String,
    val address: @RawValue Address,
    val phone: String,
    val website: String,
    val company: @RawValue Company
) : Parcelable {
    data class Address(
        val street: String,
        val suite: String,
        val city: String,
        val zipcode: String,
        val geo: Geo
    ) {
        data class Geo(
            val lat: String,
            val lng: String
        )
    }
    data class Company(
        val name: String,
        val catchPhrase: String,
        val bs: String
    )
}