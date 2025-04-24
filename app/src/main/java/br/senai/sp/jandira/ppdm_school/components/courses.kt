package br.senai.sp.jandira.ppdm_school.components

import android.inputmethodservice.Keyboard.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTimeFilled
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_school.R
import br.senai.sp.jandira.ppdm_school.screen.HomeScreen
import org.w3c.dom.Text

@Composable

fun courses(
    image: Painter,
    sigla: String,
    title: String,
    desc: String,
    week: String,
    onClick: () -> Unit
) {
    val cardShape = RoundedCornerShape(16.dp)

    Card(
        modifier = Modifier
            .padding(8.dp)
            .width(380.dp)
            .height(180.dp)
            .border(
                width = 2.dp,
                color = Color(0xFFFFC23D),
                shape = cardShape
            ),
        shape = cardShape,
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFF3347B0),
                            Color(0xFFCFD4EA)
                        )
                    ),
                    shape = cardShape
                )
        ) {
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                ) {
                    Image(
                        modifier = Modifier.size(70.dp),
                        painter = image,
                        contentDescription = "logo"
                    )
                    Text(
                        modifier = Modifier.padding(start = 50.dp),
                        text = sigla,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFC23D),
                        fontSize = 60.sp
                    )
                }
                Text(
                    text = title,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = desc,
                    fontSize = 12.sp,
                    color = Color.White
                )
                Row(
                    modifier = Modifier.padding(top = 7.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        modifier = Modifier.size(20.dp),
                        imageVector = Icons.Default.AccessTimeFilled,
                        contentDescription = "Ícone de tempo",
                        tint = Color(0xFFFFC23D)
                    )
                    Text(
                        text = week,
                        color = Color.White
                    )
                }
            }
        }
    }
}

/*
@Preview(showSystemUi = true)
@Composable
private fun coursesPreview() {
    courses()
}*/