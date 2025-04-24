package br.senai.sp.jandira.ppdm_school.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.ppdm_school.R

@Composable
fun PerfilScreen(navegacao:NavHostController?){
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
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
private fun PerfilScrenPreview() {
    PerfilScreen(null)
}