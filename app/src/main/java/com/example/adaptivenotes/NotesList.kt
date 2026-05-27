package com.example.adaptivenotes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun NotesList(
    notes: List<Note>,
    onClick: (Note) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(notes, key = { it.id }) { note ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .heightIn(min = 48.dp)
                    .clickable { onClick(note) }
                    .semantics { 
                        contentDescription = "" // Will be set below
                    }
            ) {
                val label = stringResource(R.string.note_label, note.title)
                Column(
                    Modifier
                        .padding(16.dp)
                        .semantics(mergeDescendants = true) {
                            contentDescription = label
                        }
                ) {
                    Text(
                        note.title,
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(note.text, maxLines = 1)
                }
            }
        }
    }
}
