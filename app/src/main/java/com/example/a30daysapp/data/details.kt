package com.example.a30daysapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.example.a30daysapp.R
import java.util.UUID

/**
 * A data class to represent the information presented in the dog card
 */
/**
 * @Immutable is marked as static for composition to avoid re-composition.

 *If the data changes in future, then do not use
  the @Immutable */
@Immutable
data class Fit(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val hobbies: Int,
    val id: String = UUID.randomUUID().toString() // Randomly generates an id whenever this class is called.
)

val images = listOf(
    Fit(R.drawable.gym1_min, R.string.name1, R.string.des1),
    Fit(R.drawable.gym2_min, R.string.name1, R.string.des2),
    Fit(R.drawable.gym3_min, R.string.name1, R.string.des3),
    Fit(R.drawable.gym4_min, R.string.name1, R.string.des4),
    Fit(R.drawable.gym5_min, R.string.name1, R.string.des5),
    Fit(R.drawable.gym6_min, R.string.name1, R.string.des6),
    Fit(R.drawable.gym7_min, R.string.name1, R.string.des7),
    Fit(R.drawable.gym8_min, R.string.name1, R.string.des8),
    Fit(R.drawable.gym9_min, R.string.name1, R.string.des9),
    Fit(R.drawable.gym10_min, R.string.name1, R.string.des10)
)
