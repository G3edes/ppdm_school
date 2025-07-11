package br.senai.sp.jandira.ppdm_school.screen

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.ListAlt
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.ppdm_school.R
import br.senai.sp.jandira.ppdm_school.components.courses

@Composable

fun CourseScreen(navegacao:NavHostController?){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column (
            modifier = Modifier
                .padding(20.dp)
        ){
            Column(
            ){
                Row (
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){

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
            }
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
                    },
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top=10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(
                        modifier = Modifier
                            .size(50.dp),
                        imageVector = Icons.Filled.ListAlt,
                        contentDescription = "Lista",
                        tint = (Color(color = 0xFFFFC23D))
                    )
                    Text(
                        text = stringResource(R.string.courses),
                        color = Color(0xFF3347B0),
                        fontWeight = FontWeight.Bold,
                        fontSize = 35.sp
                    )
                }
                courses(
                    image=painterResource(R.drawable.ds),
                    sigla=stringResource(R.string.ds),
                    title=stringResource(R.string.dstitle),
                    desc = stringResource(R.string.dsdesc),
                    week="${stringResource(R.string.week)} Semesters",
                    onClick = {navegacao!!.navigate("students")}
                )
                courses(
                    image=painterResource(R.drawable.rds),
                    sigla=stringResource(R.string.rds),
                    title=stringResource(R.string.rdstitle),
                    desc = stringResource(R.string.rdsdesc),
                    week="${stringResource(R.string.week)} Semesters",
                    onClick = {navegacao!!.navigate("students")}
                )
                courses(
                    image=painterResource(R.drawable.ele),
                    sigla=stringResource(R.string.ele),
                    title=stringResource(R.string.eletitle),
                    desc = stringResource(R.string.eledesc),
                    week="${stringResource(R.string.week)} Semesters",
                    onClick = {navegacao!!.navigate("students")}
                )
            }
        }

    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    CourseScreen(null)
}