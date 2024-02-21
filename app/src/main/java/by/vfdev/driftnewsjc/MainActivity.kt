package by.vfdev.driftnewsjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import by.vfdev.driftnewsjc.domain.usecases.app_entry.AppEntryUseCases
import by.vfdev.driftnewsjc.presentation.onboarding.OnBoardingScreen
import by.vfdev.driftnewsjc.ui.theme.DriftNewsJCTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var useCases: AppEntryUseCases
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        installSplashScreen()
        setContent {
            DriftNewsJCTheme(
                dynamicColor = false
            ) {
                Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
                    OnBoardingScreen()
                }
            }
        }
    }
}