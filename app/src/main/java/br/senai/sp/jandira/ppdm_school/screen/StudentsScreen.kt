package br.senai.sp.jandira.ppdm_school.screen

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ListAlt
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.ppdm_school.R
import br.senai.sp.jandira.ppdm_school.components.students

@Composable
fun StudentsScreen(navegacao: NavHostController?) {
    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Column(
            ) {
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Row(
                        modifier = Modifier
                            .background(Color.White),
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
                    Card(
                        modifier = Modifier,
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFFFC23D)),
                        shape = CircleShape
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(10.dp),
                            text = stringResource(R.string.ds),
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                Divider(
                    color = Color(0xFFFFC23D)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top=5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    OutlinedTextField(
                        modifier = Modifier
                            .fillMaxWidth(),
                        value = "",
                        onValueChange = {
                        },
                        label = { Text(text = stringResource(R.string.searchlabel)) },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "",
                                tint = (Color(color = 0xFF9E9FA4))
                            )
                        }
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Button(onClick = {},
                            modifier = Modifier
                                .padding(5.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xFF3347B0))) {
                            Text(
                                text = stringResource(R.string.all)
                            )
                        }
                        Button(onClick = {},
                            modifier = Modifier
                                .padding(5.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xFFFFC23D))) {
                            Text(
                                text = stringResource(R.string.studying),
                                color = Color(0xFF3347B0)
                            )
                        }
                        Button(onClick = {},
                            modifier = Modifier
                                .padding(5.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xFFFFC23D))) {
                            Text(
                                text = stringResource(R.string.finished),
                                color = Color(0xFF3347B0)
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Icon(
                            modifier = Modifier
                                .size(50.dp),
                            imageVector = Icons.Filled.School,
                            contentDescription = "Lista",
                            tint = (Color(color = 0xFFFFC23D))
                        )
                        Text(
                            text = stringResource(R.string.students),
                            color = Color(0xFF3347B0),
                            fontWeight = FontWeight.Bold,
                            fontSize = 35.sp
                        )
                    }
                    students(
                        image = painterResource(R.drawable.perfil1),
                        name = stringResource(R.string.name),
                        statusColor = colorResource(R.color.cursando),
                        data = stringResource(R.string.data),
                        id = stringResource(R.string.id),
                        onClick ={navegacao!!.navigate("perfil")}
                    )
                    students(
                        image = painterResource(R.drawable.perfil2),
                        name = stringResource(R.string.name2),
                        statusColor = colorResource(R.color.cursando),
                        data = stringResource(R.string.data),
                        id = stringResource(R.string.id),
                        onClick ={navegacao!!.navigate("perfil")}
                    )
                    students(
                        image = painterResource(R.drawable.perfil3),
                        name = stringResource(R.string.name3),
                        statusColor = colorResource(R.color.terminado),
                        data = stringResource(R.string.data2),
                        id = stringResource(R.string.id),
                        onClick ={navegacao!!.navigate("perfil")}
                    )

                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun StudentsScreenPreview() {
    StudentsScreen(null)
}