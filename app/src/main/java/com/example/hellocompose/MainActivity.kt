package com.example.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            HelloCompose()
        }
    }
}

@Composable
fun HelloCompose() {
     HelloComposeTheme() {
        Card(
            elevation = 4.dp,
            shape = MaterialTheme.shapes.large
        ) {
            Column(
                modifier = Modifier.padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painterResource(id = R.drawable.platzi),
                    contentDescription = null,
                    modifier = Modifier.size(23.dp, 23.dp)
                )
                Text("Este curso es lo mejor!!", style = MaterialTheme.typography.h4)
                Text("Hola Compose! :)",
                style = MaterialTheme.typography.body1)
                Button(onClick = {

                }, modifier = Modifier.padding(top = 16.dp),
                shape = MaterialTheme.shapes.large) {
                    Text(text = "My Button")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HelloComposePreview() {
    HelloCompose()
}
