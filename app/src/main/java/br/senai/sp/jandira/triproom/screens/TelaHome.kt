package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NotInterested
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.repositorio.CategoriaRepositorio
import br.senai.sp.jandira.triproom.repositorio.ViagemRepositorio
import br.senai.sp.jandira.triproom.utilitarios.encurtadorDeDatas

@Composable
fun Home(controleNavegacao: NavHostController) {

    var searchState = remember {
        mutableStateOf("")
    }

    val viagens = ViagemRepositorio().listarTodasAsViagens()
    val categorias = CategoriaRepositorio().listarTodasAsCategorias()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F4F4))
    ) {
        Surface (modifier = Modifier
            .fillMaxWidth()
            .height(220.dp)){
            Image(
                painter = painterResource(id = R.drawable.paris),
                contentDescription = "Paisagem",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
            )
            Row (
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 12.dp)
            ){
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Column (
                        horizontalAlignment = Alignment.End,
                        modifier = Modifier
                            .fillMaxWidth()
                    ){
                        Card (
                            modifier = Modifier
                                .width(80.dp)
                                .height(80.dp),
                            shape = CircleShape
                        ){
                            Image(
                                modifier = Modifier.fillMaxSize(),
                                painter = painterResource(id = R.drawable.fotoperfil),
                                contentDescription = "",
                                contentScale = ContentScale.Crop
                            )
                        }
                        Text(
                            text = "Susana Hoffs",
                            color =  Color.White,
                            fontSize = 16.sp
                        )
                    }
                    Spacer(modifier = Modifier.height(24.dp))
                    Row (){
                        Icon(
                            imageVector = Icons.Default.Place,
                            contentDescription = "Botão de pesquisa",
                            tint = Color.White,
                            modifier = Modifier
                                .size(24.dp)
                        )
                        Text(
                            text = stringResource(id = R.string.where_are_you),
                            color = Color.White,
                            fontSize = 18.sp
                        )
                    }
                    Text(
                        text = stringResource(id = R.string.app_name),
                        color = Color.White,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }



    }
    Column (
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .padding(top = 220.dp)
    ){
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = stringResource(id = R.string.categories),
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(12.dp))
        LazyRow() {
            items(categorias) {
                Card(
                    modifier = Modifier
                        .width(180.dp)
                        .height(100.dp)
                        .padding(end = 12.dp),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0xFFCF06F0)
                        ),
                    elevation = CardDefaults.cardElevation(10.dp)
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Icon(
                            imageVector = if (it.icone  == null) Icons.Default.NotInterested else it.icone!!,
                            contentDescription = "Montanha",
                            tint = Color(0xFFFFFFFF),
                            modifier = Modifier
                                .size(32.dp)
                        )
                        Text(
                            text = it.nome,
                            color = Color.White,
                            fontSize = 20.sp
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
        OutlinedTextField(
            value = searchState.value,
            onValueChange = {
                searchState.value = it
            },
            modifier = Modifier
                .fillMaxWidth(),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.search_your_destiny),
                    color = Color.Gray
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.White,
                unfocusedContainerColor = Color.White
            ),
            shape = RoundedCornerShape(16.dp),
            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Botão de pesquisa",
                        tint = Color.Gray,
                        modifier = Modifier
                            .size(32.dp)
                    )
                }
            }
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = stringResource(id = R.string.past_trips),
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 10.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))
        LazyColumn(){

            items(viagens) {

                Card(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = 12.dp),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color.White
                        ),
                    elevation = CardDefaults.cardElevation(10.dp)
                ) {
                    Surface (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .fillMaxWidth()
                            .padding(horizontal = 6.dp, vertical = 6.dp),
                        shape = RoundedCornerShape(12.dp)
                    ){
                        Image(
                            painter = if (it.imagem == null) painterResource(id = R.drawable.noimage) else it.imagem!!,
                            contentDescription = "Paisagem",
                            contentScale = ContentScale.Crop
                        )
                    }
                    Column (
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                    ){
                        Text(
                            text = "${it.destino}, ${it.dataChegada.year}",
                            color = Color(0xFFCF06F0),
                            fontWeight = FontWeight(480)
                        )
                        Text(
                            text = it.descricao,
                            color = Color.Gray,
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .padding(vertical = 4.dp)
                        )
                        Row (
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Text(
                                text = encurtadorDeDatas(it.dataChegada, it.dataPartida),
                                color = Color(0xFFCF06F0),
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(bottom = 12.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview (showBackground =  true, showSystemUi = true)
@Composable
fun GreetingHomePreview() {
    Home(controleNavegacao = rememberNavController())

}