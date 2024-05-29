package br.com.lucolimac.brazilplaces.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.lucolimac.brazilplaces.model.Place

@Composable
fun ListPlace(placeList: List<Place>, paddingValues: PaddingValues) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(), contentPadding = paddingValues
    ) {
        itemsIndexed(placeList) { index, item ->
            PlaceCard(place = item)
            if (index < placeList.lastIndex) Surface {
                Spacer(modifier = Modifier.height(8.dp).width(16.dp))
            }
        }
    }
}

@Composable
@Preview
fun ListPlacePreview() {
    ListPlace(
        placeList = listOf(
            Place(
                1,
                name = "Rio de Janeiro",
                description = "Rio de Janeiro is a large city in Brazil, famed for its Copacabana and Ipanema beaches, 38m Christ the Redeemer statue atop Mount Corcovado and for Sugarloaf Mountain, a granite peak with cable cars to its summit. The city is also known for its sprawling favelas (shanty towns). Its raucous Carnaval festival, featuring parade floats, flamboyant costumes and samba dancers, is considered the world’s largest.",
                image = 0,
                location = "Rio de Janeiro, Brazil",
                hasBeenVisited = false
            ), Place(
                2,
                name = "São Paulo",
                description = "São Paulo is a sprawling metropolis in Brazil's southeast. It is known for its unpredictable weather, traffic congestion, and the sheer size of its helicopter fleet. It is also known for its cultural institutions, such as the Latin American Memorial, the Museum of Art of São Paulo (MASP), and the Ibirapuera Park. The city is also home to the São Paulo Museum of Art, a modernist building with a notable collection of European art.",
                image = 0,
                location = "São Paulo, Brazil",
                hasBeenVisited = false
            ), Place(
                3,
                name = "Salvador",
                description = "Salvador, the capital of Brazil's northeastern state of Bahia, is known for its Portuguese colonial architecture, Afro-Brazilian culture, and a tropical coastline. The Pelourinho neighborhood is its historic heart, with cobblestone alleys opening onto large squares, colorful buildings, and baroque churches such as São Francisco, featuring gilt woodwork. The city's Lower City has a modern waterfront and the Elevador Lacerda, a more than 70-meter-high elevator.",
                image = 0,
                location = "Salvador, Brazil",
                hasBeenVisited = false
            ), Place(
                4,
                name = "Manaus",
                description = "Manaus is a Brazilian city of 2.2 million people in the Amazon rainforest. It's a major port for the region's riverboats, with floating docks" + " and a fish market. The rubber boom of the 19th century made it one of the wealthiest cities in the world. Rubber barons built the opulent" + " Teatro Amazonas opera house in 1896. The Rio",
                image = 0,
                location = "Manaus, Brazil",
                hasBeenVisited = false
            ), Place(
                5,
                name = "Brasília",
                description = "Brasília is the capital of Brazil and the seat of government of the Federal District. The city is located atop the Brazilian highlands in the country's central-western region. It was founded on April 21, 1960, to serve as the new national capital. Brasília and its metro area are home to over 4 million people, making it the fourth-largest city in Brazil.",
                image = 0,
                location = "Brasília, Brazil",
                hasBeenVisited = false
            ), Place(
                6,
                name = "Curitiba",
                description = "Curitiba is the capital of the southern Brazilian state of Paraná. It is known for its well-planned urban areas, including parks and green spaces. The Museu Oscar Niemeyer is a contemporary art museum designed by the architect of the same name. The Jardim Botânico is a botanical garden with a greenhouse and a lagoon. The city is also known for its cultural institutions, such as the Teatro Guaíra, the largest theater in Brazil.",
                image = 0,
                location = "Curitiba, Brazil",
                hasBeenVisited = false
            )
        ), paddingValues = PaddingValues(16.dp)
    )
}