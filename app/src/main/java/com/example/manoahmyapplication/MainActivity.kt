package com.example.manoahmyapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.manoahmyapplication.ui.theme.MANOAHMyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){
    Column (modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current

        Text(
            text = "Welcome to Android",
            fontSize = 10.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline)
        Text(text = "This tutorial has been prepared for the beginners to help them understand basic Android programming. After completing this tutorial you will find yourself at a ...")

        Spacer(modifier = Modifier.height(10.dp))


        Text(text = "Types of cars",
            fontSize = 10.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(30.dp),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline)
        Text(text = "1.Subaru")
        Text(text = "2.Mercedes Benz")
        Text(text = "3.Audi")
        Text(text = "5.Mazda")

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "List of vegetables",
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
                .height(29.dp),
            textAlign = TextAlign.Center,
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
        )
        Text(text = "1.Cabbage")
        Text(text = "2.Capscium")
        Text(text = "3.Brocolli")
        Text(text = "4.Sukumawiki")


        Spacer(modifier = Modifier.height(5.dp))

        Divider()

        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "Courses offered at eMobilis",
            fontSize = 20.sp)

        Spacer(modifier = Modifier.height(5.dp))

        //Centering an image
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter =  painterResource(id =R.drawable.des5),
                contentDescription = "des5",
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)
        }

        Button(onClick = {
            mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "continue")
        }

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Button(
                onClick = {

                    mContext.startActivity(Intent(mContext, touractivity::class.java))
                },
            ) {
                Text(text = "Destination")
            }
        }

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Button(
                onClick = {

                    mContext.startActivity(Intent(mContext, exploreactivity::class.java))
                },
            ) {
                Text(text = "Eplore")
            }
        }
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Button(
                onClick = {

                    mContext.startActivity(Intent(mContext, woofActivity::class.java))
                },
            ) {
                Text(text = "Woof")
            }
        }


        Button(onClick = { mContext.startActivity(Intent(mContext, lottiescreenctivity::class.java))},
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "CONTINUE", fontSize = 15.sp)

        }

//Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.image))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(500.dp)
        )

    }

}



@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}