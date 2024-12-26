package com.bapuyu.sregeb.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bapuyu.sregeb.ui.theme.WhiteSmoke

@Composable
fun BaseHomeScreen(
    content: @Composable () -> Unit,
) {
    Scaffold(
        modifier = Modifier
            .background(WhiteSmoke)
            .padding(bottom = 64.dp)
            .windowInsetsPadding(WindowInsets.statusBars)
    ) {contentPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(WhiteSmoke)
                .padding(contentPadding)
        ) {
            content()
        }
    }
}