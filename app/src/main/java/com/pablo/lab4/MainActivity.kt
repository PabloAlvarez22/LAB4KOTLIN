package com.pablo.lab4
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pablo.lab4.ui.theme.LAB4T
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.ui.unit.sp
import com.pablo.lab4.ui.theme.colorr
import com.pablo.lab4.ui.theme.green
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        LAB4T {
            Mycomponent()
                }
            }
        }
    }
@Composable
fun Mycomponent() {
    space()
    space()
    space()
    space()
    space()
        Text()
}
@Composable
fun space(){
    Text(text = " ")
}
@Composable
fun Text() {
    Column(
      modifier = Modifier
          .fillMaxSize()
          .fillMaxWidth()
          .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center )
     {
         var text1 by remember { mutableStateOf(" ") }
         var text2 by remember { mutableStateOf(" ") }
        Text(
            text = "Favor de ingresar el nombre :",
            color = Color.Black,
            fontSize = 15.sp,
            modifier = Modifier
                .offset(0.dp)
                .wrapContentSize(Alignment.Center)
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = text1,
            onValueChange = { newText -> text1 = newText },
            label = { Text("Etiqueta", color = Color.White) }, modifier = Modifier.background(
                Color.White))
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "URL:",
            color = Color.Black,
            fontSize = 15.sp,
            modifier = Modifier
                .offset(0.dp)
                .wrapContentSize(Alignment.Center)
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = text2,
            onValueChange = { newText -> text2 = newText },
            label = { Text("URL", color = Color.White) }, modifier = Modifier.background(Color.White))

             Button(
                 onClick = {},
                 modifier = Modifier
                     .fillMaxWidth()
                     .graphicsLayer(
                         scaleX = 0.8f,
                         scaleY = 0.8f
                     )
                     .padding(16.dp)
                     .clip(shape = CircleShape),
                 colors = ButtonDefaults.buttonColors(
                     backgroundColor = Color.Blue,
                     contentColor = Color.White
                 )
             ) {
                 Text(text = "NUEVO ESTILO", style = TextStyle(
                     fontSize = 18.sp,
                     fontWeight = FontWeight.Bold,
                     color = Color.White))
             }
         }
     }

@Preview(showSystemUi = true)
@Composable
fun PreviewComponent() {
    val scrollState= rememberScrollState()
    Column(modifier = Modifier.verticalScroll(scrollState)) {
        Mycomponent()
    }

}

