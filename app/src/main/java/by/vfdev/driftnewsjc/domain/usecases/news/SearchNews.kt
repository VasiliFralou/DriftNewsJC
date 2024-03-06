package by.vfdev.driftnewsjc.domain.usecases.news

import androidx.paging.PagingData
import by.vfdev.driftnewsjc.domain.model.Article
import by.vfdev.driftnewsjc.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SearchNews(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(searchQuery: String, sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.searchNews(
            searchQuery = searchQuery,
            sources = sources
        )
    }
}