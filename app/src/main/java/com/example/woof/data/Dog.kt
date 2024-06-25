package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.golden, R.string.dog_name_1, 15, R.string.dog_description_1),
    Dog(R.drawable.labrador, R.string.dog_name_2, 15, R.string.dog_description_2),
    Dog(R.drawable.german, R.string.dog_name_3, 15, R.string.dog_description_3),
    Dog(R.drawable.poodle, R.string.dog_name_4, 15, R.string.dog_description_4),
    Dog(R.drawable.bulldog, R.string.dog_name_5, 15, R.string.dog_description_5),
    Dog(R.drawable.beagle, R.string.dog_name_6, 15, R.string.dog_description_6),
    Dog(R.drawable.daschund, R.string.dog_name_7, 15, R.string.dog_description_7),
    Dog(R.drawable.chihuahua, R.string.dog_name_8, 15, R.string.dog_description_8),
    Dog(R.drawable.pug, R.string.dog_name_9, 15, R.string.dog_description_9)
)
