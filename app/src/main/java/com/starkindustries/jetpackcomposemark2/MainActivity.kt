package com.starkindustries.jetpackcomposemark2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.starkindustries.jetpackcomposemark2.ui.theme.JetPackComposeMark2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FirstModifier(){
    Text(text = "Ironman",
        fontSize = 20.sp,
        fontWeight = FontWeight.W100,
        fontStyle = FontStyle.Normal,
        fontFamily = FontFamily.Monospace,
        modifier = Modifier
            .clickable { }
            .size(200.dp)
            .background(Color.Blue)
            .clip(CircleShape)
            .background(Color.Yellow)
            .border(10.dp, Color.Red, CircleShape)
    )
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SecondComposoble(){
    Image(painter = painterResource(id = R.drawable.ironman_arc_reactor), contentDescription = ""
    , modifier = Modifier.clickable {  }.
    clip(CircleShape).
    border(10.dp,Color.Blue, CircleShape),
        contentScale = ContentScale.Crop)
}
