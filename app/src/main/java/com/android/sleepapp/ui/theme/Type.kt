package com.android.sleepapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.android.sleepapp.R

// Set of Material typography styles to start with
val fontFamily = FontFamily(
    Font(R.font.gothica1_regular, FontWeight.Normal),
    Font(R.font.gothica1_bold, FontWeight.Bold)
)
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        color = TextWhite,
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    h2 = TextStyle(
        color = TextWhite,
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
)