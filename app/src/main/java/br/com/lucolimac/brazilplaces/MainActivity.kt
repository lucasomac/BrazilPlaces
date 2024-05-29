package br.com.lucolimac.brazilplaces

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.lucolimac.brazilplaces.model.Place
import br.com.lucolimac.brazilplaces.ui.components.ListPlace
import br.com.lucolimac.brazilplaces.ui.screens.RegisterActivity
import br.com.lucolimac.brazilplaces.ui.theme.BrazilPlacesTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BrazilPlacesTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar = { TopAppBar(title = { Text("Locais do Brasil") }) },
                    floatingActionButton = {
                        FloatingActionButton(onClick = { navigateToRegisterPlace() }) {
                            Icon(Icons.Filled.Add, "Floating action button.")
                        }
                    }) { innerPadding ->
                    ListPlace(
                        placeList = listOf(
                            Place(1, "Rio de Janeiro", "Cidade maravilhosa", 0, "", false),
                            Place(2, "São Paulo", "Cidade que não para", 0, "", false),
                            Place(3, "Salvador", "Cidade do axé", 0, "", false),
                            Place(4, "Manaus", "Cidade do encontro das águas", 0, "", false),
                            Place(5, "Brasília", "Cidade do poder", 0, "", false),
                            Place(6, "Curitiba", "Cidade ecológica", 0, "", false)
                        ), paddingValues = innerPadding
                    )
                }
            }
        }
    }

    private fun navigateToRegisterPlace() {
        // Navega para a tela de cadastro de locais
        startActivity(Intent(this, RegisterActivity::class.java))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BrazilPlacesTheme {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .padding(PaddingValues(16.dp)),
            topBar = { TopAppBar(title = { Text("Locais do Brasil") }) },
        ) { innerPadding ->
            ListPlace(
                placeList = listOf(
                    Place(1, "Rio de Janeiro", "Cidade maravilhosa", 0, "", false),
                    Place(2, "São Paulo", "Cidade que não para", 0, "", false),
                    Place(3, "Salvador", "Cidade do axé", 0, "", false),
                    Place(4, "Manaus", "Cidade do encontro das águas", 0, "", false),
                    Place(5, "Brasília", "Cidade do poder", 0, "", false),
                    Place(6, "Curitiba", "Cidade ecológica", 0, "", false)
                ), paddingValues = innerPadding
            )
        }
    }
}