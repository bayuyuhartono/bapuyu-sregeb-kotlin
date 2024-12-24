package com.bapuyu.sregeb.ui.screens.dashboard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bapuyu.sregeb.R
import com.bapuyu.sregeb.ui.theme.DarkBlue
import com.bapuyu.sregeb.ui.theme.PrimaryBlue
import com.bapuyu.sregeb.ui.theme.WhiteSmoke

@Composable
fun TopBar(
    school: String,
    name: String,
    classified: String,
) {
    val borderSize = 60.dp
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(bottomStart = borderSize, bottomEnd = borderSize)
            )
            .clip(RoundedCornerShape(bottomStart = borderSize, bottomEnd = borderSize))
            .fillMaxWidth()
            .background(PrimaryBlue)
            .height(180.dp)
            .padding(32.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Column {
                    Text(
                        color = WhiteSmoke,
                        text = name,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 2.sp
                    )
                    Text(
                        color = WhiteSmoke,
                        text = classified,
                        fontSize = 12.sp,
                        lineHeight = 2.sp
                    )
                }
            }
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .border(2.dp, DarkBlue, CircleShape)
            )
        }
        Text(
            color = WhiteSmoke,
            text = school,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
    }
}