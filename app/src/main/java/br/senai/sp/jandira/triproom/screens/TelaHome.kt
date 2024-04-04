package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.R

@Composable
fun Home(){

    var buscarDestinoState = remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xDCFFFFFF)),
    ){

        Column(modifier = Modifier
            .fillMaxWidth()
            .height(220.dp)
            .background(color = Color(0xFFCE7DC6)),
        ){

            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                    horizontalAlignment = Alignment.End
                ){
                    Box(modifier = Modifier
                        .width(60.dp)
                        .height(60.dp)){

                    }
                    Text(text = "Susanna Hoffs",
                        color = Color.White,)
                }

                Column (modifier = Modifier
                ){
                    Row {
                        Icon(
                            imageVector = Icons.Default.Place,
                            contentDescription = "Buscar",
                            tint = Color.White
                        )
                        Text(text = "You're in Paris",
                            color = Color.White
                        )
                    }
                    Text(text = "My Trips",
                        color = Color.White,
                        fontSize = 34.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Row (modifier = Modifier
            .padding(16.dp)
        ) {
            Text(text = "Categories")
        }
        LazyRow(modifier = Modifier
            .padding(start = 16.dp)

        ){
            items(10){
                Card (modifier = Modifier
                    .width(102.dp)
                    .height(64.dp)
                    .padding(end = 8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),){
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Icon(
                            imageVector = Icons.Default.Place,
                            contentDescription = "Place",
                            tint = Color.White
                        )
                        Text(text = "Montain",
                            color = Color.White
                        )
                    }
                }
            }
        }

        Column (modifier = Modifier.padding(16.dp)){

            OutlinedTextField(
                value = buscarDestinoState.value,
                onValueChange = {
                    buscarDestinoState.value = it
                },
                modifier = Modifier
                    .fillMaxWidth(),
                placeholder = {
                    Text(
                        text = "Buscar personagens",
                        color = Color.Gray
                    )
                },
                shape = RoundedCornerShape(22.dp),
                colors = TextFieldDefaults.colors(Color.White),
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search your destiny",
                            tint = Color.Gray
                        )
                    }
                }
            )

            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Past Trips")
            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){

                items(2){

                    Card (

                    ){
                        Column (modifier = Modifier
                            .padding(12.dp)){

                            Surface(modifier = Modifier
                                .fillMaxWidth()
                                .height(80.dp)){
                                Image(painter = painterResource(id = R.drawable.london)
                                    , contentDescription = "Super foto de londres",
                                    contentScale = ContentScale.Crop)
                            }

                            Text(text = "London, 2019",
                                color = Color(0xFFCF06F0),
                                fontSize = 18.sp)
                            Text(text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                                color = Color(0xFF7A7A7A),
                                fontSize = 11.sp)

                            Row (horizontalArrangement = Arrangement.End,
                                modifier = Modifier.fillMaxWidth()){
                                Text(text = "18 Feb - 21 Feb",
                                    color = Color(0xFFCF06F0),
                                    fontSize = 14.sp)
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(30.dp))
                }
            }
        }


    }
}