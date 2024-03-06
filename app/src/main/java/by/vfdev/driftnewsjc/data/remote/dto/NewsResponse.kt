package by.vfdev.driftnewsjc.data.remote.dto

import by.vfdev.driftnewsjc.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)