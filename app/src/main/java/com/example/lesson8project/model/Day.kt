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
        Day(R.string.day1, R.string.title1, R.string.desc1, R.drawable.chess_1),
        Day(R.string.day2, R.string.title2, R.string.desc2, R.drawable.chess_2),
        Day(R.string.day3, R.string.title3, R.string.desc3, R.drawable.chess_3),
        Day(R.string.day4, R.string.title4, R.string.desc4, R.drawable.chess_4),
        Day(R.string.day5, R.string.title5, R.string.desc5, R.drawable.chess_5),
        Day(R.string.day6, R.string.title6, R.string.desc6, R.drawable.chess_6),
        Day(R.string.day7, R.string.title7, R.string.desc7, R.drawable.chess_7),
        Day(R.string.day8, R.string.title8, R.string.desc8, R.drawable.chess_8),
        Day(R.string.day9, R.string.title9, R.string.desc9, R.drawable.chess_9),
        Day(R.string.day10, R.string.title10, R.string.desc10, R.drawable.chess_10),
        Day(R.string.day11, R.string.title11, R.string.desc11, R.drawable.chess_11),
        Day(R.string.day12, R.string.title12, R.string.desc12, R.drawable.chess_12),
        Day(R.string.day13, R.string.title13, R.string.desc13, R.drawable.chess_13),
        Day(R.string.day14, R.string.title14, R.string.desc14, R.drawable.chess_14),
        Day(R.string.day15, R.string.title15, R.string.desc15, R.drawable.chess_15),
        Day(R.string.day16, R.string.title16, R.string.desc16, R.drawable.chess_16),
        Day(R.string.day17, R.string.title17, R.string.desc17, R.drawable.chess_17),
        Day(R.string.day18, R.string.title18, R.string.desc18, R.drawable.chess_18),
        Day(R.string.day19, R.string.title19, R.string.desc19, R.drawable.chess_19),
        Day(R.string.day20, R.string.title20, R.string.desc20, R.drawable.chess_20),
        Day(R.string.day21, R.string.title21, R.string.desc21, R.drawable.chess_21),
        Day(R.string.day22, R.string.title22, R.string.desc22, R.drawable.chess_22),
        Day(R.string.day23, R.string.title23, R.string.desc23, R.drawable.chess_23),
        Day(R.string.day24, R.string.title24, R.string.desc24, R.drawable.chess_24),
        Day(R.string.day25, R.string.title25, R.string.desc25, R.drawable.chess_25),
        Day(R.string.day26, R.string.title26, R.string.desc26, R.drawable.chess_26),
        Day(R.string.day27, R.string.title27, R.string.desc27, R.drawable.chess_27),
        Day(R.string.day28, R.string.title28, R.string.desc28, R.drawable.chess_28),
        Day(R.string.day29, R.string.title29, R.string.desc29, R.drawable.chess_29),
        Day(R.string.day30, R.string.title30, R.string.desc30, R.drawable.chess_30)
    )
}
