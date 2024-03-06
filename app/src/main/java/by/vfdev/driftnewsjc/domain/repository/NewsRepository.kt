package by.vfdev.driftnewsjc.domain.repository

import androidx.paging.PagingData
import by.vfdev.driftnewsjc.domain.model.Article
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    fun getNews(sources: List<String>): Flow<PagingData<Article>>

    fun searchNews(searchQuery: String, sources: List<String>): Flow<PagingData<Article>>
}