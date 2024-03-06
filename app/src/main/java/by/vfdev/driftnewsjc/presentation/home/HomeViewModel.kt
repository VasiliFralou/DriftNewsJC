package by.vfdev.driftnewsjc.presentation.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import by.vfdev.driftnewsjc.domain.usecases.news.NewsUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val newsUseCases: NewsUseCases
): ViewModel() {

    var state = mutableStateOf(HomeState())
        private set

    val news = newsUseCases.getNews(
        sources = listOf("espn")
    ).cachedIn(viewModelScope)
}