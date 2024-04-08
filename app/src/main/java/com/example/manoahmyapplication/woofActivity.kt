package com.example.manoahmyapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.manoahmyapplication.ui.theme.MANOAHMyApplicationTheme

class woofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            woof()
        }
    }
}

@Composable
fun woof(){
    androidx.compose.foundation.layout.Column (modifier = Modifier.fillMaxSize()){

       Text(text = "Woof", fontSize = 35.sp, fontWeight = FontWeight.ExtraBold, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
//card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(50.dp)
            .fillMaxWidth()) {
Row {

    Box(modifier = Modifier.fillMaxWidth(),
        ) {
        Image(painter =  painterResource(id =R.drawable.des5),
            contentDescription = "des5",
            modifier = Modifier
                .padding(start = 5.dp, top = 4.dp)
                .size(40.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop)


        androidx.compose.foundation.layout.Column {
            Text(text = "Koda", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(start = 80.dp, top = 4.dp))
            
            Text(text = "2 Years old", fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 80.dp))
        }
    }



}
        }
        //end of card1

        Spacer(modifier = Modifier.height(10.dp))
        //card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(50.dp)
            .fillMaxWidth()) {
            Row {

                Box(modifier = Modifier.fillMaxWidth(),
                ) {
                    Image(painter =  painterResource(id =R.drawable.des5),
                        contentDescription = "des5",
                        modifier = Modifier
                            .padding(start = 5.dp, top = 4.dp)
                            .size(40.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)


                    androidx.compose.foundation.layout.Column {
                        Text(text = "Lola", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(start = 80.dp, top = 4.dp))

                        Text(text = "16 Years old", fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 80.dp))
                    }
                }



            }
        }
        //end of card1

        Spacer(modifier = Modifier.height(10.dp))
//card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(50.dp)
            .fillMaxWidth()) {
            Row {

                Box(modifier = Modifier.fillMaxWidth(),
                ) {
                    Image(painter =  painterResource(id =R.drawable.des5),
                        contentDescription = "des5",
                        modifier = Modifier
                            .padding(start = 5.dp, top = 4.dp)
                            .size(40.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)


                    androidx.compose.foundation.layout.Column {
                        Text(text = "Frankie", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(start = 80.dp, top = 4.dp))

                        Text(text = " 2 Years old", fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 80.dp))
                    }
                }



            }
        }
        //end of card1

        Spacer(modifier = Modifier.height(10.dp))

//card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(50.dp)
            .fillMaxWidth()) {
            Row {

                Box(modifier = Modifier.fillMaxWidth(),
                ) {
                    Image(painter =  painterResource(id =R.drawable.des5),
                        contentDescription = "des5",
                        modifier = Modifier
                            .padding(start = 5.dp, top = 4.dp)
                            .size(40.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)


                    androidx.compose.foundation.layout.Column {
                        Text(text = "Nox", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(start = 80.dp, top = 4.dp))

                        Text(text = "8 Years old", fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 80.dp))
                    }
                }



            }
        }
        //end of card1

        Spacer(modifier = Modifier.height(10.dp))

//card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(50.dp)
            .fillMaxWidth()) {
            Row {

                Box(modifier = Modifier.fillMaxWidth(),
                ) {
                    Image(painter =  painterResource(id =R.drawable.des5),
                        contentDescription = "des5",
                        modifier = Modifier
                            .padding(start = 5.dp, top = 4.dp)
                            .size(40.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)


                    androidx.compose.foundation.layout.Column {
                        Text(text = "Faye", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(start = 80.dp, top = 4.dp))

                        Text(text = " 8 Years old", fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 80.dp))
                    }
                }



            }
        }
        //end of card1

        Spacer(modifier = Modifier.height(10.dp))

//card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(50.dp)
            .fillMaxWidth()) {
            Row {

                Box(modifier = Modifier.fillMaxWidth(),
                ) {
                    Image(painter =  painterResource(id =R.drawable.des5),
                        contentDescription = "des5",
                        modifier = Modifier
                            .padding(start = 5.dp, top = 4.dp)
                            .size(40.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)


                    androidx.compose.foundation.layout.Column {
                        Text(text = "Bella", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(start = 80.dp, top = 4.dp))

                        Text(text = "14 Years old", fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 80.dp))
                    }
                }



            }
        }
        //end of card1

        Spacer(modifier = Modifier.height(10.dp))

//card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(50.dp)
            .fillMaxWidth()) {
            Row {

                Box(modifier = Modifier.fillMaxWidth(),
                ) {
                    Image(painter =  painterResource(id =R.drawable.des5),
                        contentDescription = "des5",
                        modifier = Modifier
                            .padding(start = 5.dp, top = 4.dp)
                            .size(40.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)


                    androidx.compose.foundation.layout.Column {
                        Text(text = "Moana", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(start = 80.dp, top = 4.dp))

                        Text(text = "2 Years old", fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 80.dp))
                    }
                }



            }
        }
        //end of card1

        Spacer(modifier = Modifier.height(10.dp))

//card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(50.dp)
            .fillMaxWidth()) {
            Row {

                Box(modifier = Modifier.fillMaxWidth(),
                ) {
                    Image(painter =  painterResource(id =R.drawable.des5),
                        contentDescription = "des5",
                        modifier = Modifier
                            .padding(start = 5.dp, top = 4.dp)
                            .size(40.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)


                    androidx.compose.foundation.layout.Column {
                        Text(text = "Tzeital", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(start = 80.dp, top = 4.dp))

                        Text(text = " 7 Years old", fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 80.dp))
                    }
                }



            }
        }
        //end of card1

        Spacer(modifier = Modifier.height(10.dp))

//card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(50.dp)
            .fillMaxWidth()) {
            Row {

                Box(modifier = Modifier.fillMaxWidth(),
                ) {
                    Image(painter =  painterResource(id =R.drawable.des5),
                        contentDescription = "des5",
                        modifier = Modifier
                            .padding(start = 5.dp, top = 4.dp)
                            .size(40.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)


                    androidx.compose.foundation.layout.Column {
                        Text(text = "Anto", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(start = 80.dp, top = 4.dp))

                        Text(text = " 18 Years old", fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 80.dp))
                    }
                }



            }
        }
        //end of card1

        Spacer(modifier = Modifier.height(10.dp))

//card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(50.dp)
            .fillMaxWidth()) {
            Row {

                Box(modifier = Modifier.fillMaxWidth(),
                ) {
                    Image(painter =  painterResource(id =R.drawable.des5),
                        contentDescription = "des5",
                        modifier = Modifier
                            .padding(start = 5.dp, top = 4.dp)
                            .size(40.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)


                    androidx.compose.foundation.layout.Column {
                        Text(text = "Madola", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(start = 80.dp, top = 4.dp))

                        Text(text = "20 Years old", fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 80.dp))
                    }
                }



            }
        }
        //end of card1

Spacer(modifier = Modifier.height(10.dp))

//card1

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(50.dp)
            .fillMaxWidth()) {
            Row {

                Box(modifier = Modifier.fillMaxWidth(),
                ) {
                    Image(painter =  painterResource(id =R.drawable.des5),
                        contentDescription = "des5",
                        modifier = Modifier
                            .padding(start = 5.dp, top = 4.dp)
                            .size(40.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)


                    androidx.compose.foundation.layout.Column {
                        Text(text = "Max", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(start = 80.dp, top = 4.dp))

                        Text(text = "20 Years old", fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 80.dp))
                    }
                }



            }
        }
        //end of card1









    }

}

@Preview(showBackground = true)
@Composable
fun woofpreview(){
    woof()
}