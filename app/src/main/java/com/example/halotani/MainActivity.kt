package com.example.halotani

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.layout.layout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.halotani.ui.theme.HaloTaniTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HaloTaniTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),) { innerPadding ->
                    Greeting(
                        name = "TaniLovers",
                        modifier = Modifier.padding(innerPadding)

                    )

                    Column(modifier = Modifier.fillMaxSize().padding(100.dp),
                        verticalArrangement = Arrangement.spacedBy(25.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        /*filled button*/
                            Button(modifier = Modifier
                            .height(50.dp)
                            .width(140.dp),
                            shape = RoundedCornerShape(topStart = 5.dp, bottomEnd = 2.dp),
                            enabled = true,
                            elevation = ButtonDefaults.buttonElevation(
                                defaultElevation = 20.dp
                            ),
                            colors =  ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFFFE39B),
                                contentColor = Color.White,
                                disabledContentColor = Color.LightGray,
                                disabledContainerColor = Color (0xffe39b)
                            ),
                            onClick = { /*TODO*/ }
                            ){
                            Text(text = "Tekan",
                                fontWeight = FontWeight.Bold)
                            }


                        Button(modifier = Modifier
                            .height(50.dp)
                            .width(140.dp),
                            shape = CircleShape,
                            border = BorderStroke(2.dp, color = Color(0xFFFFE39B) ),
                            colors =  ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,),
                            elevation = ButtonDefaults.buttonElevation(20.dp, 12.dp),
                            onClick = { /*TODO*/ }
                        ){
                            Text(text = "Tekan",
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFFFFE39B) )
                        }
                        }


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HaloTaniTheme {
        Greeting("TaniLovers")
    }
}