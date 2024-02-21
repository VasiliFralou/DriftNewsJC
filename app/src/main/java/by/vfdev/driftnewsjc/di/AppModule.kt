package by.vfdev.driftnewsjc.di

import android.app.Application
import by.vfdev.driftnewsjc.data.manger.LocalUserMangerImpl
import by.vfdev.driftnewsjc.domain.manger.LocalUserManger
import by.vfdev.driftnewsjc.domain.usecases.app_entry.AppEntryUseCases
import by.vfdev.driftnewsjc.domain.usecases.app_entry.ReadAppEntry
import by.vfdev.driftnewsjc.domain.usecases.app_entry.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
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

}