package ru.uzbekovve.autopl.ui.custom.navigation_bar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import ru.uzbekovve.autopl.R
import ru.uzbekovve.autopl.ui.theme.Grey

@Composable
fun NavigationBar(modifier: Modifier) {
    Column(modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Grey)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 18.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                modifier = Modifier.size(25.dp),
                painter = painterResource(id = R.drawable.ic_chat),
                colorFilter = ColorFilter.tint(Grey), // TODO implement tab selection
                contentDescription = stringResource(
                    id = R.string.chats
                )
            )
            Image(
                modifier = Modifier.size(25.dp),
                painter = painterResource(id = R.drawable.ic_profile),
                colorFilter = ColorFilter.tint(Grey),
                contentDescription = stringResource(
                    id = R.string.profile
                )
            )
        }
    }
}