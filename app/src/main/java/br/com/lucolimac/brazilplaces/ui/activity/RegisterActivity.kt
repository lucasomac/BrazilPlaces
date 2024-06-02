package br.com.lucolimac.brazilplaces.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import br.com.lucolimac.brazilplaces.model.Place
import br.com.lucolimac.brazilplaces.ui.screens.RegisterScreen
import br.com.lucolimac.brazilplaces.ui.theme.BrazilPlacesTheme
import br.com.lucolimac.brazilplaces.ui.viewModel.RegisterPlaceViewModel
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class RegisterActivity : ComponentActivity() {
    private val viewModel: RegisterPlaceViewModel by inject()
    private var namePlace = ""
    private var descriptionPlace = ""
    private var addressPlace = ""
    private fun saveName(name: String) {
        namePlace = name
    }

    private fun saveDescription(description: String) {
        descriptionPlace = description
    }

    private fun saveAddress(address: String) {
        addressPlace = address
    }

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BrazilPlacesTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp), topBar = {
                    TopAppBar(
                        title = { Text(text = "Cadastro de local") },
                        navigationIcon = {
                            IconButton(onClick = { onBackPressedDispatcher.onBackPressed() }) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                    contentDescription = "Localized description"
                                )
                            }
                        },
                    )
                }) { innerPadding ->
                    RegisterScreen(paddingValues = innerPadding,
                        saveName = ::saveName,
                        saveDescription = ::saveDescription,
                        saveAddress = ::saveAddress,
                        onSaveClick = {
                            val place = Place(
                                name = namePlace,
                                description = descriptionPlace,
                                location = addressPlace
                            )
                            savePlace(place)
                            onBackPressedDispatcher.onBackPressed()
                        })
                }
            }
        }
    }

    private fun savePlace(place: Place) {
        lifecycleScope.launch {
            viewModel.savePlace(place)
        }
    }
}


