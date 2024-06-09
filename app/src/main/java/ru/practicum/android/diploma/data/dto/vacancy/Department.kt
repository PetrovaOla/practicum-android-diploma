package ru.practicum.android.diploma.data.dto.vacancy


import com.google.gson.annotations.SerializedName

data class Department(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)
