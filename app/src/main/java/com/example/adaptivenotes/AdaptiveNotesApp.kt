package com.example.adaptivenotes

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AdaptiveNotesApp(widthSizeClass: WindowWidthSizeClass) {
    when (widthSizeClass) {
        WindowWidthSizeClass.Compact -> NotesPhoneLayout()
        WindowWidthSizeClass.Medium,
        WindowWidthSizeClass.Expanded -> NotesTabletLayout()
        else -> NotesPhoneLayout()
    }
}

@Preview(name = "Phone", widthDp = 360, heightDp = 640, showBackground = true)
@Composable
fun PhonePreview() {
    AdaptiveNotesApp(WindowWidthSizeClass.Compact)
}

@Preview(name = "Tablet", widthDp = 1280, heightDp = 800, showBackground = true)
@Composable
fun TabletPreview() {
    AdaptiveNotesApp(WindowWidthSizeClass.Expanded)
}
