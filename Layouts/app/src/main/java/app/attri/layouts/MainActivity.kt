package app.attri.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.attri.layouts.ui.theme.LayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column() {
        Box(
            modifier = Modifier
                .background(Color.Red)
                .height(200.dp)
                .width(300.dp)
        ) {
            Row {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Blue)
                )
                Column {
                    Text(text = "Hello ")
                    Text(text = "$name!")
                }
            }

        }
    }
}


@Composable
fun MyLayouts(name: String) {
    Column() {
        Box(
            modifier = Modifier
                .background(Color.Red)
                .height(200.dp)
                .width(300.dp)
        ) {
            Row {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Blue)
                )
                Column {
                    Text(text = "Hello ")
                    Text(text = "$name!")
                }
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LayoutsTheme {
        Greeting("Android")
    }
}