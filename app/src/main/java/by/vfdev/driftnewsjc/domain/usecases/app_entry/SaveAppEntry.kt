package by.vfdev.driftnewsjc.domain.usecases.app_entry

import by.vfdev.driftnewsjc.domain.manger.LocalUserManger

class SaveAppEntry(
    private val localUserManger: LocalUserManger
) {

    suspend operator fun invoke(){
        localUserManger.saveAppEntry()
    }

}