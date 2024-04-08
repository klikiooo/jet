package com.example.manoahmyapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.manoahmyapplication.ui.theme.MANOAHMyApplicationTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch as launch

class splashactivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         splash()
            
            val mContext = LocalContext.current
            val coroutineScope = rememberCoroutineScope()
             coroutineScope.launch {
                delay(10000)
                mContext.startActivity(Intent(mContext, formactivity::class.java))
                finish()
            }
        }
    }
}

@Composable
fun splash(){
    androidx.compose.foundation.layout.Column (modifier = Modifier
        .background(Color.DarkGray)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
Text(text = "welcome to ManoahmyApplication.....", fontSize = 30.sp, fontWeight = FontWeight.ExtraBold)
//Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.screen))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(500.dp)
        )
Spacer(modifier = Modifier.height(5.dp))
Text(

    text = "Wait to continue to the next screen",
    fontFamily = FontFamily.Cursive,
    fontWeight = FontWeight.Bold,
    fontSize = 30.sp

)

    }
}

@Preview(showBackground = true)
@Composable
fun splashpreview(){
    splash()
}