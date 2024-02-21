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
        title = "Что такое дрифт?",
        description = "Дрифт (англ. Drift) — техника прохождения поворотов и вид автоспорта, характеризующийся использованием управляемого заноса на максимально возможных для удержания на трассе скорости и угла к траектории.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Команда RACING.BY",
        description = "Команда RACING.BY специализируется на проведении крупных автоспортивных соревнований по дрифтингу в РБ. Являются организаторами этапов Чемпионата Беларуси по дрифтингу, Кубка Беларуси по дрифтингу, Восточноевропейского чемпионата по дрифтингу (EEDC) и других серьёзных мероприятий.",
        image = R.drawable.onboarding3
    )
)