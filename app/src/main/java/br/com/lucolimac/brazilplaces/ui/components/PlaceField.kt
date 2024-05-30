package br.com.lucolimac.brazilplaces.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PlaceField(
    value: String = "",
    padding: PaddingValues, label: String, onValueChange: (String) -> Unit
) {
    var text by remember { mutableStateOf(value) }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(padding),
        value = text,
        label = { Text(label) },
        onValueChange = {
            text = it
            onValueChange.invoke(it)
        },
        shape = MaterialTheme.shapes.medium
    )
}

@Preview
@Composable
fun PlaceFieldPreview() {
    PlaceField(padding = PaddingValues(16.dp), label = "Nome do local") { }
}