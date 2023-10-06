package com.example.moseart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moseart.ui.theme.MoseartTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MoseartTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color =  Color.DarkGray //MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(stringResource(R.string.app_name), stringResource(R.string.welkom_to))
                }
            }
        }
    }
}
@Composable
fun GreetingImage(appName: String, welcomeMessage: String, modifier:Modifier = Modifier){
    val image = painterResource(R.drawable.background)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            appName = appName,
            welcomeMessage = welcomeMessage,
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        )
    }
}

@Composable
fun GreetingText(appName: String, welcomeMessage: String, modifier:Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(20.dp)
    ) {
        Text(
            text = welcomeMessage,
            fontSize = 40.sp,
            lineHeight = 42.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text =  appName,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MoseartTheme {
        GreetingImage(stringResource(R.string.app_name), stringResource(R.string.welkom_to))

    }
}



//var counter =123
//fun increment (){
//    counter++;
//}

//
//var counter = 0
//@Composable
//fun Clicker(m : Modifier = Modifier){
//    val context = LocalContext.current
//    Column(){
//        Button(
//            onClick = {
//                counter++
//                Toast.makeText(context, "you clicked $counter times", Toast.LENGTH_SHORT).show()
//            },
//            modifier = m
//        ) {
//            Text(text = "Click me")
//        }
//    }
//
//
//}

