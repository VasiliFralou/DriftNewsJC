package by.vfdev.driftnewsjc.domain.usecases.app_entry

import by.vfdev.driftnewsjc.domain.manger.LocalUserManger
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManger: LocalUserManger
) {

    operator fun invoke(): Flow<Boolean> {
        return localUserManger.readAppEntry()
    }

}