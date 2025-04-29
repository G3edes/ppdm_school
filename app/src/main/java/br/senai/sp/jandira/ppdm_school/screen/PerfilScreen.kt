package br.senai.sp.jandira.ppdm_school.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun PerfilScreen(navegacao: NavHostController?) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    modifier = Modifier
                        .padding(4.dp),
                    painter = painterResource(R.drawable.logo),
                    contentDescription = stringResource(R.string.lion)
                )
                Text(
                    text = stringResource(R.string.lion),
                    color = Color(0xFF3347B0),
                    fontWeight = FontWeight.Bold
                )
            }
            Divider(
                color = Color(0xFFFFC23D)
            )
            Column(
                modifier = Modifier
                    .padding(40.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    modifier = Modifier
                        .padding(10.dp)
                        .size(150.dp)
                        .border(
                            BorderStroke(2.dp, color = Color(0xFFFFC23D)),
                            shape = CircleShape
                        ),
                    painter = painterResource(R.drawable.perfil1),
                    contentDescription = "perfil"
                )
                Text(
                    text = stringResource(R.string.name),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3347B0)
                )
                Text(
                    text = stringResource(R.string.tds),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3347B0),
                    textAlign = TextAlign.Center
                )
            }
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xff9FA9E1))
            ) {
                Column(
                    modifier = Modifier
                        .padding(15.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        modifier = Modifier
                            .padding(bottom = 10.dp),
                        text = stringResource(R.string.desempenho),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Row (
                        modifier = Modifier
                            .padding(bottom = 15.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = stringResource(R.string.SIOP),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(
                            modifier = Modifier
                                .width(10.dp)
                        )
                        Card(
                            modifier = Modifier
                                .width(200.dp)
                                .height(30.dp),
                            shape = RoundedCornerShape(5.dp),
                            elevation = CardDefaults.elevatedCardElevation(8.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Card(
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(30.dp),
                                shape = RoundedCornerShape(5.dp),
                                colors = CardDefaults.cardColors(containerColor = Color(0xff30B988))
                            ){}
                        }
                        Spacer(
                            modifier = Modifier
                                .width(10.dp)
                        )
                        Text(
                            text = "90",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                    Row (
                        modifier = Modifier
                            .padding(bottom = 15.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = stringResource(R.string.INRI),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(
                            modifier = Modifier
                                .width(10.dp)
                        )
                        Card(
                            modifier = Modifier
                                .width(200.dp)
                                .height(30.dp),
                            shape = RoundedCornerShape(5.dp),
                            elevation = CardDefaults.elevatedCardElevation(8.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Card(
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(30.dp),
                                shape = RoundedCornerShape(5.dp),
                                colors = CardDefaults.cardColors(containerColor = Color(0xff30B988))
                            ){}
                        }
                        Spacer(
                            modifier = Modifier
                                .width(10.dp)
                        )
                        Text(
                            text = "90",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                    Row (
                        modifier = Modifier
                            .padding(bottom = 15.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = stringResource(R.string.INNU),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(
                            modifier = Modifier
                                .width(10.dp)
                        )
                        Card(
                            modifier = Modifier
                                .width(200.dp)
                                .height(30.dp),
                            shape = RoundedCornerShape(5.dp),
                            elevation = CardDefaults.elevatedCardElevation(8.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Card(
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(30.dp),
                                shape = RoundedCornerShape(5.dp),
                                colors = CardDefaults.cardColors(containerColor = Color(0xff30B988))
                            ){}
                        }
                        Spacer(
                            modifier = Modifier
                                .width(10.dp)
                        )
                        Text(
                            text = "90",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                    Row (
                        modifier = Modifier
                            .padding(bottom = 15.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = stringResource(R.string.HA),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(
                            modifier = Modifier
                                .width(10.dp)
                        )
                        Card(
                            modifier = Modifier
                                .width(200.dp)
                                .height(30.dp),
                            shape = RoundedCornerShape(5.dp),
                            elevation = CardDefaults.elevatedCardElevation(8.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Card(
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(30.dp),
                                shape = RoundedCornerShape(5.dp),
                                colors = CardDefaults.cardColors(containerColor = Color(0xff30B988))
                            ){}
                        }
                        Spacer(
                            modifier = Modifier
                                .width(10.dp)
                        )
                        Text(
                            text = "90",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                    Row (
                        modifier = Modifier
                            .padding(bottom = 15.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = stringResource(R.string.SERE),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(
                            modifier = Modifier
                                .width(10.dp)
                        )
                        Card(
                            modifier = Modifier
                                .width(200.dp)
                                .height(30.dp),
                            shape = RoundedCornerShape(5.dp),
                            elevation = CardDefaults.elevatedCardElevation(8.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Card(
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(30.dp),
                                shape = RoundedCornerShape(5.dp),
                                colors = CardDefaults.cardColors(containerColor = Color(0xff30B988))
                            ){}
                        }
                        Spacer(
                            modifier = Modifier
                                .width(10.dp)
                        )
                        Text(
                            text = "90",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                    Row (
                        modifier = Modifier
                            .padding(bottom = 15.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = stringResource(R.string.CAES),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(
                            modifier = Modifier
                                .width(10.dp)
                        )
                        Card(
                            modifier = Modifier
                                .width(200.dp)
                                .height(30.dp),
                            shape = RoundedCornerShape(5.dp),
                            elevation = CardDefaults.elevatedCardElevation(8.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Card(
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(30.dp),
                                shape = RoundedCornerShape(5.dp),
                                colors = CardDefaults.cardColors(containerColor = Color(0xff30B988))
                            ){}
                        }
                        Spacer(
                            modifier = Modifier
                                .width(10.dp)
                        )
                        Text(
                            text = "90",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                    Row (
                        modifier = Modifier
                            .padding(top = 40.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ){
                        Icon(
                            modifier = Modifier
                            .size(25.dp),
                            imageVector = Icons.Default.CheckCircle,
                            contentDescription = "id",
                            tint = Color(0xFF41EE3B)
                        )
                        Text(
                            text = stringResource(R.string.concluido),
                            fontSize = 25.sp,
                            color = Color(0xff3347B0),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun PerfilScrenPreview() {
    PerfilScreen(null)
}