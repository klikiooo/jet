package com.example.manoahmyapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class touractivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination() {
    androidx.compose.foundation.layout.Column(modifier = Modifier.fillMaxSize()) {


        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "DESTINATION", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, LayoutActivity::class.java))
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "ArrowBack",
                        tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = {

                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))


                }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "Share",
                        tint = Color.White
                    )
                }

                IconButton(onClick = {

                }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Settings",
                        tint = Color.White
                    )
                }
            }
        )
        //End of topappbar


        //the box starts
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.des1),
                contentDescription = "des1",
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
            Text(
                text = "Let's plan your Next vacation",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

        }//END OF BOX

        Spacer(modifier = Modifier.height(10.dp))
        var search by remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            placeholder = {
                Text(
                    text = " What's your next destination",
                    Modifier.padding(5.dp)
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search"
                )
            })
//end of search bar
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Recently viewed",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start = 20.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))
        Row (
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
        ){

            //card1

            Card(
                modifier = Modifier
                    .height(195.dp)
                    .width(195.dp)
            ) {
                androidx.compose.foundation.layout.Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp), contentAlignment = Alignment.Center
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.dest2),
                            contentDescription = "dest2",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Paris",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(start = 50.dp)
                    )
                }
            }

            Card(
                modifier = Modifier
                    .height(195.dp)
                    .width(195.dp)
            ) {
                androidx.compose.foundation.layout.Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp), contentAlignment = Alignment.Center
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.dest4),
                            contentDescription = "dest4",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "londan",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(start = 50.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            Card(
                modifier = Modifier
                    .height(195.dp)
                    .width(195.dp)
            ) {
                androidx.compose.foundation.layout.Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp), contentAlignment = Alignment.Center
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.des5),
                            contentDescription = "dest5",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "china",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(start = 50.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(
                modifier = Modifier
                    .height(195.dp)
                    .width(195.dp)
            ) {
                androidx.compose.foundation.layout.Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp), contentAlignment = Alignment.Center
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.dest2),
                            contentDescription = "dest2",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Nairobi",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(start = 50.dp)
                    )
                }
            }


            Spacer(modifier = Modifier.width(10.dp))
            Card(
                modifier = Modifier
                    .height(195.dp)
                    .width(195.dp)
            ) {
                androidx.compose.foundation.layout.Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp), contentAlignment = Alignment.Center
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.dest2),
                            contentDescription = "dest2",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Paris",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(start = 50.dp)
                    )
                }
            }




        }
        
        Spacer(modifier = Modifier.height(15.dp))
        
        Button(onClick = {

            mContext.startActivity(Intent(mContext, exploreactivity::class.java)) }) {
            Text(text = "More", modifier = Modifier.padding(start = 50.dp, end = 50.dp), fontSize = 20.sp)
        }
    }
}



        @Preview(showBackground = true)
        @Composable
        fun Destinationpreview() {
            Destination()
        }
