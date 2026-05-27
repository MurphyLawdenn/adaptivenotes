package com.example.adaptivenotes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun NotesPhoneLayout() {
    var selected by remember { mutableStateOf<Note?>(null) }
    if (selected == null) {
        NotesList(
            notes = sampleNotes,
            onClick = { selected = it }
        )
    } else {
        NoteDetails(
            note = selected!!,
            onBack = { selected = null }
        )
    }
}
