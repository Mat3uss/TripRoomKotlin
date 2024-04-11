package br.senai.sp.jandira.triproom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.triproom.screens.Home
import br.senai.sp.jandira.triproom.screens.Login
import br.senai.sp.jandira.triproom.screens.SignUp
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripRoomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val controleNavegacao = rememberNavController()
                    NavHost(navController = controleNavegacao,
                        startDestination = "login"
                    ){
                        composable(route = "login"){ Login(controleNavegacao) }
                        composable(route = "home"){ Home(controleNavegacao) }
                        composable(route = "signup"){ SignUp(controleNavegacao) }
                    }
                }
            }
        }
    }
}

//@Composable
//fun Login() {
//
//    var emailState = remember {
//        mutableStateOf("")
//    }
//    var passwordState = remember {
//        mutableStateOf("")
//    }
//
//    Column (
//        modifier = Modifier
//            .fillMaxSize()
//    ){
//
//        Row (
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(200.dp),
//            horizontalArrangement = Arrangement.End
//        ){
//            Box(modifier = Modifier
//                .width(120.dp)
//                .height(40.dp)
//                .background(
//                    color = Color(0xFFCF06F0),
//                    shape = RoundedCornerShape(
//                        bottomStart = 16.dp
//                    )
//                )
//            ){}
//        }
//
//
//        Column (modifier = Modifier
//            .padding(22.dp)
//        ){
//            Text(text = "Login",
//                color = Color(0xffCF06F0),
//                fontSize = 48.sp,
//                fontWeight = FontWeight.Bold,
//            )
//            Text(text = "Please sign in to continue.",
//                color = Color(0xFFA09C9C)
//            )
//        }
//
//        // color = card defuls.card.color
//
//
//        Column (
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.SpaceAround,
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(200.dp)
//        ){
//
//            OutlinedTextField(
//                value = emailState.value,
//                onValueChange = {
//                    emailState.value = it
//                },
//                label = {
//                    Text(text = "E-mail")
//                },
//                leadingIcon = {
//                    Icon(imageVector = Icons.Default.Lock,
//                        contentDescription = "oi",
//                        tint = Color(0xffCF06F0),
//                    )
//                },
//                colors = OutlinedTextFieldDefaults
//                    .colors(
//                        focusedBorderColor = Color(0xffCF06F0),
//                        unfocusedBorderColor = Color(0xffCF06F0),
//                    ),
//                shape = RoundedCornerShape(16.dp),
//                modifier = Modifier
//                    .width(327.dp)
//            )
//
//            OutlinedTextField(
//                value = passwordState.value,
//                onValueChange = {
//                    passwordState.value = it
//                },
//                label = {
//                    Text(text = "Password")
//                },
//                leadingIcon = {
//                    Icon(imageVector = Icons.Default.Email,
//                        contentDescription = "oi",
//                        tint = Color(0xffCF06F0),)
//                },
//                colors = OutlinedTextFieldDefaults
//                    .colors(
//                        focusedBorderColor = Color(0xffCF06F0),
//                        unfocusedBorderColor = Color(0xffCF06F0)
//                    ),
//                shape = RoundedCornerShape(16.dp),
//                modifier = Modifier
//                    .width(327.dp)
//            )
//
//
//        }
//
//        Column (
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(170.dp)
//                .padding(28.dp),
//            verticalArrangement = Arrangement.SpaceBetween,
//            horizontalAlignment = Alignment.End
//        ){
//            Button(onClick = { /*TODO*/ },
//                shape = RoundedCornerShape(16.dp),
//                colors = ButtonDefaults.buttonColors(containerColor = Color((0xffCF06F0)))
//            ) {
//                Row (
//                    modifier = Modifier
//                        .width(134.dp)
//                        .height(48.dp)
//                    ,
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.SpaceAround
//                ){
//                    Text(text = "Sing in",
//                        fontSize = 26.sp)
//                    Icon(imageVector = Icons.Default.ArrowForward,
//                        contentDescription = "oi",
//                        tint = Color(0xFFFFFFFF),
//                    )
//                }
//            }
//            Row {
//                Text(text = "Don’t have an account?",
//                    color = Color(0xFFFA09C9C))
//                Text(text = "Sign in",
//                    color = Color(0xFFCF06F0),
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier
//                        .padding(start = 6.dp)
//                )
//            }
//        }
//
//        Row (
//            modifier = Modifier
//                .fillMaxWidth()
//                .fillMaxHeight(),
//            horizontalArrangement = Arrangement.Start,
//            verticalAlignment = Alignment.Bottom
//        ){
//            Box(modifier = Modifier
//                .width(120.dp)
//                .height(40.dp)
//                .background(
//                    color = Color(0xFFCF06F0),
//                    shape = RoundedCornerShape(
//                        topEnd = 16.dp
//                    )
//                )
//            ){}
//        }
//    }
//}
//@Composable
//fun SignUp() {
//
//    var usernameState = remember {
//        mutableStateOf("")
//    }
//    var phoneState = remember {
//        mutableStateOf("")
//    }
//    var emailState = remember {
//        mutableStateOf("")
//    }
//    var passwordState = remember {
//        mutableStateOf("")
//    }
//    var checkState = remember {
//        mutableStateOf(false)
//    }
//
//
//    Column(
//        modifier = Modifier.fillMaxSize()
//    ) {
//
//        Row (
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.End
//        ){
//            Box(modifier = Modifier
//                .width(120.dp)
//                .height(40.dp)
//                .background(
//                    color = Color(0xFFCF06F0),
//                    shape = RoundedCornerShape(
//                        bottomStart = 16.dp
//                    )
//                )
//            ){}
//        }
//
//        Column (modifier = Modifier
//            .fillMaxWidth()
//            .padding(22.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ){
//            Text(text = "Sign Up",
//                color = Color(0xffCF06F0),
//                fontSize = 48.sp,
//                fontWeight = FontWeight.Bold,
//            )
//            Text(text = "Create a new account",
//                color = Color(0xFFA09C9C)
//            )
//        }
//
//        Column (
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(160.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//
//        ) {
//
//            Box(modifier = Modifier
//                .width(100.dp)
//                .height(100.dp),
//            ){
//                Box(modifier = Modifier){
//                    Image(
//                        painter = painterResource(id = br.senai.sp.jandira.triproom.R.drawable.perfil),
//                        contentDescription = "",
//                        modifier = Modifier.size(100.dp),
//
//                        )
//                }
//
//                Icon(imageVector = Icons.Default.Person,
//                    contentDescription = "oi",
//                    tint = Color(0xffCF06F0),
//                    modifier = Modifier
//                        .size(90.dp)
//                        .offset(y = 0.dp, x = 5.dp)
//                )
//
//                Image(
//                    painter = painterResource(id = br.senai.sp.jandira.triproom.R.drawable.camera),
//                    contentDescription = "Mudar foto de perfil",
//                    modifier = Modifier
//                        .size(28.dp)
//                        .offset(y = 80.dp, x = 80.dp)
//                )
//
//            }
//        }
//
//        Column (
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.SpaceAround,
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(300.dp)
//        ){
//
//            OutlinedTextField(
//                value = usernameState.value,
//                onValueChange = {
//                    usernameState.value = it
//                },
//                label = {
//                    Text(text = "Username")
//                },
//                leadingIcon = {
//                    Icon(imageVector = Icons.Default.Person,
//                        contentDescription = "Cadeado",
//                        tint = Color(0xffCF06F0),
//                    )
//                },
//                colors = OutlinedTextFieldDefaults
//                    .colors(
//                        focusedBorderColor = Color(0xffCF06F0),
//                        unfocusedBorderColor = Color(0xffCF06F0),
//                    ),
//                shape = RoundedCornerShape(16.dp),
//                modifier = Modifier
//                    .width(327.dp)
//            )
//
//            OutlinedTextField(
//                value = phoneState.value,
//                onValueChange = {
//                    phoneState.value = it
//                },
//                label = {
//                    Text(text = "Phone")
//                },
//                leadingIcon = {
//                    Icon(imageVector = Icons.Default.Phone,
//                        contentDescription = "Email",
//                        tint = Color(0xffCF06F0),)
//                },
//                colors = OutlinedTextFieldDefaults
//                    .colors(
//                        focusedBorderColor = Color(0xffCF06F0),
//                        unfocusedBorderColor = Color(0xffCF06F0)
//                    ),
//                shape = RoundedCornerShape(16.dp),
//                modifier = Modifier
//                    .width(327.dp)
//            )
//
//            OutlinedTextField(
//                value = emailState.value,
//                onValueChange = {
//                    emailState.value = it
//                },
//                label = {
//                    Text(text = "E-mail")
//                },
//                leadingIcon = {
//                    Icon(imageVector = Icons.Default.Email,
//                        contentDescription = "Email",
//                        tint = Color(0xffCF06F0),)
//                },
//                colors = OutlinedTextFieldDefaults
//                    .colors(
//                        focusedBorderColor = Color(0xffCF06F0),
//                        unfocusedBorderColor = Color(0xffCF06F0)
//                    ),
//                shape = RoundedCornerShape(16.dp),
//                modifier = Modifier
//                    .width(327.dp)
//            )
//
//            OutlinedTextField(
//                value = passwordState.value,
//                onValueChange = {
//                    passwordState.value = it
//                },
//                label = {
//                    Text(text = "Password")
//                },
//                leadingIcon = {
//                    Icon(imageVector = Icons.Default.Lock,
//                        contentDescription = "Email",
//                        tint = Color(0xffCF06F0),)
//                },
//                colors = OutlinedTextFieldDefaults
//                    .colors(
//                        focusedBorderColor = Color(0xffCF06F0),
//                        unfocusedBorderColor = Color(0xffCF06F0)
//                    ),
//                shape = RoundedCornerShape(16.dp),
//                modifier = Modifier
//                    .width(327.dp)
//            )
//
//        }
//        Row (
//            modifier = Modifier
//                .width(200.dp)
//                .height(50.dp)
//                .padding(start = 37.dp),
//            verticalAlignment = Alignment.CenterVertically,
//
//            ){
//
//
//            Checkbox(
//                checked = checkState.value,
//                onCheckedChange  = {
//                    checkState.value = it
//                },
//                colors = CheckboxDefaults
//                    .colors(
//                        checkedColor = Color(0xffCF06F0),
//                        uncheckedColor = Color(0xffCF06F0)
//                    )
//            )
//            Text(text = "Over 18?")
//        }
//
//        Column (
//
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(80.dp),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ){
//            Button(onClick = { /*TODO*/ },
//                shape = RoundedCornerShape(16.dp),
//                colors = ButtonDefaults.buttonColors(containerColor = Color((0xffCF06F0)))
//            ) {
//                Row(
//                    modifier = Modifier
//                        .width(295.dp)
//                        .height(48.dp),
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.SpaceAround
//                ) {
//                    Text(
//                        text = "Create Account",
//                        fontSize = 26.sp
//                    )
//                }
//            }
//        }
//
//        Row (modifier = Modifier
//            .fillMaxWidth()
//            .height(100.dp)
//            .padding(end = 32.dp),
//            horizontalArrangement = Arrangement.End
//
//        ){
//            Text(text = "Already have an account?",
//                color = Color(0xFFFA09C9C))
//            Text(text = "Login",
//                color = Color(0xFFCF06F0),
//                fontWeight = FontWeight.Bold,
//                modifier = Modifier
//                    .padding(start = 6.dp)
//            )
//        }
//    }
//
//    Row (
//        modifier = Modifier
//            .fillMaxWidth()
//            .fillMaxHeight(),
//        horizontalArrangement = Arrangement.Start,
//        verticalAlignment = Alignment.Bottom
//    ){
//        Box(modifier = Modifier
//            .width(120.dp)
//            .height(40.dp)
//            .background(
//                color = Color(0xFFCF06F0),
//                shape = RoundedCornerShape(
//                    topEnd = 16.dp
//                )
//            )
//        ){}
//    }
//}

//@Composable
//fun Home(){
//
//    var buscarDestinoState = remember {
//        mutableStateOf("")
//    }
//
//    Column (
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color(0xDCFFFFFF)),
//    ){
//
//        Column(modifier = Modifier
//            .fillMaxWidth()
//            .height(220.dp)
//            .background(color = Color(0xFFCE7DC6)),
//        ){
//
//            Column(modifier = Modifier
//                .fillMaxWidth()
//                .padding(12.dp)
//            ) {
//                Column(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(120.dp),
//                    horizontalAlignment = Alignment.End
//                ){
//                    Box(modifier = Modifier
//                        .width(60.dp)
//                        .height(60.dp)){
//
//                    }
//                    Text(text = "Susanna Hoffs",
//                        color = Color.White,)
//                }
//
//                Column (modifier = Modifier
//                ){
//                    Row {
//                        Icon(
//                            imageVector = Icons.Default.Place,
//                            contentDescription = "Buscar",
//                            tint = Color.White
//                        )
//                        Text(text = "You're in Paris",
//                            color = Color.White
//                        )
//                    }
//                    Text(text = "My Trips",
//                        color = Color.White,
//                        fontSize = 34.sp,
//                        fontWeight = FontWeight.Bold
//                    )
//                }
//            }
//        }
//        Row (modifier = Modifier
//            .padding(16.dp)
//        ) {
//            Text(text = "Categories")
//        }
//        LazyRow(modifier = Modifier
//            .padding(start = 16.dp)
//
//        ){
//            items(10){
//                Card (modifier = Modifier
//                    .width(102.dp)
//                    .height(64.dp)
//                    .padding(end = 8.dp),
//                    colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),){
//                    Column (
//                        modifier = Modifier.fillMaxSize(),
//                        verticalArrangement = Arrangement.Center,
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ){
//                        Icon(
//                            imageVector = Icons.Default.Place,
//                            contentDescription = "Place",
//                            tint = Color.White
//                        )
//                        Text(text = "Montain",
//                            color = Color.White
//                        )
//                    }
//                }
//            }
//        }
//
//        Column (modifier = Modifier.padding(16.dp)){
//
//            OutlinedTextField(
//                value = buscarDestinoState.value,
//                onValueChange = {
//                    buscarDestinoState.value = it
//                },
//                modifier = Modifier
//                    .fillMaxWidth(),
//                placeholder = {
//                    Text(
//                        text = "Buscar personagens",
//                        color = Color.Gray
//                    )
//                },
//                shape = RoundedCornerShape(22.dp),
//                colors = TextFieldDefaults.colors(Color.White),
//                trailingIcon = {
//                    IconButton(onClick = { /*TODO*/ }) {
//                        Icon(
//                            imageVector = Icons.Default.Search,
//                            contentDescription = "Search your destiny",
//                            tint = Color.Gray
//                        )
//                    }
//                }
//            )
//
//            Spacer(modifier = Modifier.height(30.dp))
//            Text(text = "Past Trips")
//            Spacer(modifier = Modifier.height(20.dp))
//
//            LazyColumn(){
//
//                items(2){
//
//                    Card (
//
//                    ){
//                        Column (modifier = Modifier
//                            .padding(12.dp)){
//
//                            Surface(modifier = Modifier
//                                .fillMaxWidth()
//                                .height(80.dp)){
//                                Image(painter = painterResource(id = R.drawable.london)
//                                    , contentDescription = "Super foto de londres",
//                                contentScale = ContentScale.Crop)
//                            }
//
//                            Text(text = "London, 2019",
//                                color = Color(0xFFCF06F0),
//                                fontSize = 18.sp)
//                            Text(text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
//                                color = Color(0xFF7A7A7A),
//                                fontSize = 11.sp)
//
//                            Row (horizontalArrangement = Arrangement.End,
//                                modifier = Modifier.fillMaxWidth()){
//                                Text(text = "18 Feb - 21 Feb",
//                                    color = Color(0xFFCF06F0),
//                                    fontSize = 14.sp)
//                            }
//                        }
//                    }
//                    Spacer(modifier = Modifier.height(30.dp))
//                }
//            }
//        }
//
//
//    }
//}












//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun HomePreview() {
//      TripRoomTheme{
//          Home()
//    }
//}
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun GreetingPreview() {
//    TripRoomTheme {
//        Login()
//    }
//}
//@Preview(showBackground = true)
//@Composable
//fun SingUPpreview() {
//    TripRoomTheme {
//        SignUp()
//    }
//}