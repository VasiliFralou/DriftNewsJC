package by.vfdev.driftnewsjc.presentation.onboarding.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import by.vfdev.driftnewsjc.R
import by.vfdev.driftnewsjc.presentation.Dimens.MediumPadding1
import by.vfdev.driftnewsjc.presentation.Dimens.MediumPadding2
import by.vfdev.driftnewsjc.presentation.Dimens.MediumPadding4
import by.vfdev.driftnewsjc.presentation.onboarding.Page
import by.vfdev.driftnewsjc.presentation.onboarding.pages
import by.vfdev.driftnewsjc.ui.theme.DriftNewsJCTheme

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page,
) {
    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.60f),
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(MediumPadding1))
        Text(
            modifier = Modifier.padding(
                horizontal = MediumPadding2, vertical = MediumPadding4),
            text = page.title,
            fontSize = 30.sp,
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)
        )
        Text(
            modifier = Modifier.padding(horizontal = MediumPadding2),
            text = page.description,
            fontSize = 16.sp,
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun OnBoardingPagePreview() {
    DriftNewsJCTheme {
        OnBoardingPage(
            page = pages[0]
        )
    }
}