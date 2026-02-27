package co.edu.unab.cubidesjahzeel.quizandroidjahzeelcubides

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
@Preview(showSystemUi = true)
@Composable
fun PantallaPerfilUsuario() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .background(Color.Gray)
        ) {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Imagen del producto",
                modifier = Modifier.fillMaxSize()
            )
        }
        Text(
            text = "Juan perez",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 12.dp)
        )
        Text(
            text = "Desarrollador Android apasionado por la tecnología y el diseño.",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("150", fontWeight = FontWeight.Bold)
                Text("Posts", fontSize = 12.sp, color = Color.Gray)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("2.3K", fontWeight = FontWeight.Bold)
                Text("Seguidores", fontSize = 12.sp, color = Color.Gray)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("980", fontWeight = FontWeight.Bold)
                Text("Likes", fontSize = 12.sp, color = Color.Gray)
            }
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                "Intereses",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    "Videojuegos",
                    modifier = Modifier
                        .background(Color(0xFFE0E0E0))
                        .padding(horizontal = 12.dp, vertical = 4.dp)
                )
                Text(
                    "Programación",
                    modifier = Modifier
                        .background(Color(0xFFE0E0E0))
                        .padding(horizontal = 12.dp, vertical = 4.dp)
                )
                Text(
                    "Animales",
                    modifier = Modifier
                        .background(Color(0xFFE0E0E0))
                        .padding(horizontal = 12.dp, vertical = 4.dp)
                )
            }
        }
    }
}


