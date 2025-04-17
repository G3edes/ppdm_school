package br.senai.sp.jandira.ppdm_school.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.ppdm_school.R

@Composable
fun HomeScreen(navegacao: NavHostController?) {
    Box(
        modifier=Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column(
            modifier=Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            Row{
                Image(
                    modifier = Modifier
                        .size(200.dp),
                    painter = painterResource(R.drawable.logo),
                    contentDescription = stringResource(R.string.lion)
                )
                Column(
                    modifier=Modifier
                        .height(200.dp),
                    verticalArrangement = Arrangement.Center,

                ) {
                    Text(
                        text = stringResource(R.string.lion),
                        fontSize = 45.sp,
                        color = Color(0xFF3347B0),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier
                        .padding(10.dp),
                    text = stringResource(R.string.find),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3347B0)
                )
                Box(
                    modifier=Modifier
                        .width(60.dp)
                        .height(5.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color(0xFFFFC23D))

                )
                Text(
                    modifier = Modifier
                        .padding(20.dp),
                    text = stringResource(R.string.get),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0xFF9E9FA4)
                )
            }


            Button(onClick = {
                navegacao!!.navigate("dados")
            },
                modifier=Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(Color(color = 0xFFFFC23D),),
                border = BorderStroke(2.dp, color = Color(0xFF3347B0))
                ){
                Text(
                    text = stringResource(R.string.start),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color(0xFF3347B0)
                )
            }
            Row(
                modifier=Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Image(
                    modifier=Modifier
                        .size(40.dp),
                    painter = painterResource(R.drawable.youtube),
                    contentDescription = stringResource(R.string.youtube)
                )
                Image(
                    modifier=Modifier
                        .size(40.dp),
                    painter = painterResource(R.drawable.twitter),
                    contentDescription = stringResource(R.string.twitter)
                )
                Image(
                    modifier=Modifier
                        .size(40.dp),
                    painter = painterResource(R.drawable.instagram),
                    contentDescription = stringResource(R.string.instagram)
                )
                Image(
                    modifier=Modifier
                        .size(40.dp),
                    painter = painterResource(R.drawable.facebook),
                    contentDescription = stringResource(R.string.facebook)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(null)
}