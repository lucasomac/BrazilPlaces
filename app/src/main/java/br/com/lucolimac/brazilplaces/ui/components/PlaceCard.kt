package br.com.lucolimac.brazilplaces.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.lucolimac.brazilplaces.R
import br.com.lucolimac.brazilplaces.model.Place

@Composable
fun PlaceCard(place: Place, onClickCardPlace: (Place) -> Unit = {}) {
    //create a card with the place information
    //the card will have the place name, description, image and location
    //the image will be a placeholder for now
    //the card will have a fixed size
    //the card will have a padding of 16dp
    //the card will have a corner radius of 8dp
    //the card will have an elevation of 4dp
    //the card will have a background color of white
    //the card will have a click listener that will navigate to the place details screen
    //the card will have a content that will have a column with the place name, description, image and location
    //the place name will have a text with the place name
    //the place description will have a text with the place description
    //the place image will have a placeholder image

    Surface(
        onClick = { onClickCardPlace.invoke(place) },
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shadowElevation = 4.dp,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.onSurface)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = place.name,
                    modifier = Modifier.padding(bottom = 8.dp),
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Italic
                )
                Row {
                    Text(
                        text = if (place.hasBeenVisited) "Visitado" else "Não visitado",
                        modifier = Modifier.padding(bottom = 8.dp),
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic
                    )
                    Image(
                        if (place.hasBeenVisited) painterResource(R.drawable.baseline_check_circle_24) else painterResource(
                            R.drawable.baseline_cancel_24
                        ), contentDescription = "Checked if the place has been visited"
                    )
                }
            }
            Text(
                text = place.description,
                modifier = Modifier.padding(bottom = 8.dp),
                color = androidx.compose.ui.graphics.Color.Gray
            )
            Text(text = place.location)

        }
    }
}

@Composable
@Preview
fun PlaceCardPreviewTrue() {
    PlaceCard(
        Place(
            1,
            name = "São Paulo",
            description = "The city of São Paulo is the largest city in Brazil and the capital of the state of São Paulo. It is the most populous city in Brazil, the Americas, the Western Hemisphere, and the Southern Hemisphere.",

            location = "São Paulo, SP",
            true
        )
    )
}

@Composable
@Preview
fun PlaceCardPreviewFalse() {
    PlaceCard(
        Place(
            2,
            name = "Teresina",
            description = "The city of Teresina is the capital of the state of Piauí, Brazil. It is the only capital in the northeastern states that was planned before its foundation, and it is the third capital of Brazil with the best quality of life, according to the United Nations Development Program (UNDP)",

            location = "Teresina, PI",
            false
        )
    )
}