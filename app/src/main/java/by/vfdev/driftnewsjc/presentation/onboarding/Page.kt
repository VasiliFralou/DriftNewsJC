package by.vfdev.driftnewsjc.presentation.onboarding

import androidx.annotation.DrawableRes
import by.vfdev.driftnewsjc.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Приложение DriftNews",
        description = "DriftNewsApp - это бесплатное мобильное Android-приложение для любителей белорусского автоспорта «Дрифтинг». В приложении представлены все самые свежие новости в мире дрифтинга",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Приложение DriftNews",
        description = "DriftNewsApp - это бесплатное мобильное Android-приложение для любителей белорусского автоспорта «Дрифтинг». В приложении представлены все самые свежие новости в мире дрифтинга",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Приложение DriftNews",
        description = "DriftNewsApp - это бесплатное мобильное Android-приложение для любителей белорусского автоспорта «Дрифтинг». В приложении представлены все самые свежие новости в мире дрифтинга",
        image = R.drawable.onboarding3
    )
)