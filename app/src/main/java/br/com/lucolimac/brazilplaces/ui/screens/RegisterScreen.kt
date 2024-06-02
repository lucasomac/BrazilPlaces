package br.com.lucolimac.brazilplaces.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.lucolimac.brazilplaces.ui.components.PlaceField
import br.com.lucolimac.brazilplaces.ui.theme.BrazilPlacesTheme

@Composable
fun RegisterScreen(
    onSaveClick: () -> Unit = {},
    paddingValues: PaddingValues,
    saveName: (String) -> Unit,
    saveDescription: (String) -> Unit,
    saveAddress: (String) -> Unit
) {

    Column(
        modifier = Modifier.padding(paddingValues), verticalArrangement = Arrangement.Top
    ) {
        PlaceField(padding = paddingValues, label = "Nome do local", onValueChange = saveName)
        PlaceField(
            padding = paddingValues, label = "Descrição do local", onValueChange = saveDescription
        )
        PlaceField(
            padding = paddingValues, label = "Endereço do local", onValueChange = saveAddress
        )

        ElevatedButton(
            onClick = {
                onSaveClick.invoke()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingValues)
                .defaultMinSize(minHeight = 48.dp)
        ) {
            Row {
                Text(text = "Cadastrar local")
                Box(modifier = Modifier.padding(8.dp))
                Icon(Icons.AutoMirrored.Filled.Send, "Cadastrar local")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BrazilPlacesTheme {
//        RegisterScreen(paddingValues = PaddingValues(16.dp))
    }
}