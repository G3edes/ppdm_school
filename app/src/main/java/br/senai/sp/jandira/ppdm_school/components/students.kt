package br.senai.sp.jandira.ppdm_school.components

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_school.R


@Composable


fun students(
    image: Painter,
    name: String,
    statusColor: Color,
    data: String,
    id: String,
    onClick:()->Unit
) {
    val cardShape = RoundedCornerShape(16.dp)
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .height(90.dp),
        shape = cardShape,
        elevation = CardDefaults.elevatedCardElevation(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xff9FA9E1),
                            Color(0xff9FA9E1)
                        )
                    ),
                    shape = cardShape
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Card(
                        modifier = Modifier
                            .height(90.dp)
                            .width(20.dp),
                        colors = CardDefaults.cardColors(containerColor = statusColor),
                        shape = RoundedCornerShape(
                            topEnd = 0.dp,
                            bottomEnd = 0.dp,
                            topStart = 16.dp,
                            bottomStart = 16.dp
                        )
                    ) {}
                    Image(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .size(60.dp),
                        painter = image,
                        contentDescription = "perfil"
                    )

                    // Nome e ID do estudante
                    Column {
                        Text(
                            modifier = Modifier,
                            text = name,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                modifier = Modifier
                                    .size(20.dp),
                                imageVector = Icons.Default.CreditCard,
                                contentDescription = "id",
                                tint = Color.White
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 5.dp),
                                text = id,
                                color = Color.White
                            )
                        }
                    }
                }
                Row(
                    modifier = Modifier
                        .padding(7.dp)
                        .height(90.dp),
                    verticalAlignment = Alignment.Bottom
                ) {
                    Icon(
                        modifier = Modifier
                            .size(20.dp),
                        imageVector = Icons.Default.DateRange,
                        contentDescription = "data",
                        tint = Color.White
                    )
                    Text(
                        text = data,
                        color = Color(0xFFFFC23D),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

/*@Preview(showSystemUi = true)
@Composable
private fun studentsPreview() {
    students()
}*/