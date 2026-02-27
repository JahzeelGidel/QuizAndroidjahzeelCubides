package co.edu.unab.cubidesjahzeel.quizandroidjahzeelcubides

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ContentScreen(){
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(18.dp)
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally){

        Row(
            modifier = Modifier
                .background(Color.White)
                .padding(all = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

        }
        Text(
            text = "Encabezado",
            fontSize = 25.sp,
            modifier = Modifier.background(Color.Blue)
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Hola mundo",
                modifier = Modifier.size(400.dp)
            )
             Column (
                 modifier = Modifier.fillMaxSize(),
                 verticalArrangement = Arrangement.Center,
                 horizontalAlignment = Alignment.CenterHorizontally
             ){
                 Text(
                     "Pie de pagina", Modifier.background(Color.Yellow), fontSize = 25.sp
                 )
             }
            }
        }
    }



