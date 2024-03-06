package by.vfdev.driftnewsjc.di

import android.app.Application
import by.vfdev.driftnewsjc.data.manger.LocalUserMangerImpl
import by.vfdev.driftnewsjc.data.remote.NewsApi
import by.vfdev.driftnewsjc.data.repository.NewsRepositoryImpl
import by.vfdev.driftnewsjc.domain.manger.LocalUserManger
import by.vfdev.driftnewsjc.domain.repository.NewsRepository
import by.vfdev.driftnewsjc.domain.usecases.app_entry.AppEntryUseCases
import by.vfdev.driftnewsjc.domain.usecases.app_entry.ReadAppEntry
import by.vfdev.driftnewsjc.domain.usecases.app_entry.SaveAppEntry
import by.vfdev.driftnewsjc.domain.usecases.news.GetNews
import by.vfdev.driftnewsjc.domain.usecases.news.NewsUseCases
import by.vfdev.driftnewsjc.domain.usecases.news.SearchNews
import by.vfdev.driftnewsjc.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManger = LocalUserMangerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManger
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )

    @Provides
    @Singleton
    fun provideApiInstance(): NewsApi {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideNewsRepository(
        newsApi: NewsApi
    ): NewsRepository {
        return NewsRepositoryImpl(newsApi)
    }

    @Provides
    @Singleton
    fun provideNewsUseCases(
        newsRepository: NewsRepository
    ): NewsUseCases {
        return NewsUseCases(
            getNews = GetNews(newsRepository),
            searchNews = SearchNews(newsRepository)
        )
    }

}