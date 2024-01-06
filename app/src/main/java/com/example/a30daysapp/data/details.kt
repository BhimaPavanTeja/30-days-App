package com.example.a30daysapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysapp.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Fit(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val hobbies: Int
)

val images = listOf(
    Fit(R.drawable.gym1, R.string.name1, R.string.des1),
    Fit(R.drawable.gym2, R.string.name1, R.string.des2),
    Fit(R.drawable.gym3, R.string.name1, R.string.des3),
    Fit(R.drawable.gym4, R.string.name1, R.string.des4),
    Fit(R.drawable.gym5, R.string.name1, R.string.des5),
    Fit(R.drawable.gym6, R.string.name1, R.string.des6),
    Fit(R.drawable.gym7, R.string.name1, R.string.des7),
    Fit(R.drawable.gym8, R.string.name1, R.string.des8),
    Fit(R.drawable.gym9, R.string.name1, R.string.des9),
    Fit(R.drawable.gym10, R.string.name1, R.string.des10)
)