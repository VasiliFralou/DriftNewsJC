package by.vfdev.driftnewsjc.domain.usecases.news

import android.util.Log
import androidx.paging.PagingData
import by.vfdev.driftnewsjc.domain.model.Article
import by.vfdev.driftnewsjc.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetNews(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.getNews(sources = sources)
    }
}