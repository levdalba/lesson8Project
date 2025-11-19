package com.example.lesson8project.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.lesson8project.R

data class Day(
    @StringRes val dayRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)

object DayRepository {
    val days = listOf(
        Day(
            dayRes = R.string.day1,
            titleRes = R.string.title1,
            descriptionRes = R.string.desc1,
            imageRes = R.drawable.chess_1 
        ),
        Day(
            dayRes = R.string.day2,
            titleRes = R.string.title2,
            descriptionRes = R.string.desc2,
            imageRes = R.drawable.chess_2
        ),
        Day(
            dayRes = R.string.day3,
            titleRes = R.string.title3,
            descriptionRes = R.string.desc3,
            imageRes = R.drawable.chess_3
        ),
        Day(
            dayRes = R.string.day4,
            titleRes = R.string.title4,
            descriptionRes = R.string.desc4,
            imageRes = R.drawable.chess_4
        ),
        Day(
            dayRes = R.string.day5,
            titleRes = R.string.title5,
            descriptionRes = R.string.desc5,
            imageRes = R.drawable.chess_5
        )
    )
}
