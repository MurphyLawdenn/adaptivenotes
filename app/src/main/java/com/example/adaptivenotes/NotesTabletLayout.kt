package com.example.adaptivenotes

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun NotesTabletLayout() {
    var selected by remember { mutableStateOf(sampleNotes.first()) }
    Row(Modifier.fillMaxSize()) {
        NotesList(
            notes = sampleNotes,
            onClick = { selected = it },
            modifier = Modifier.weight(1f)
        )
        NoteDetails(
            note = selected,
            onBack = {},
            modifier = Modifier.weight(2f)
        )
    }
}
