package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant() {
    Column {
        Row(
            Modifier
                .weight(1f)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
                    .weight(1f)
                    .fillMaxSize()
            ) {
                Text(
                    text = stringResource(R.string.text_composable),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(0.dp, 0.dp, 0.dp, 16.dp)
                )
                Text(
                    text = stringResource(R.string.text_composable_description),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
                    .weight(1f)
                    .fillMaxSize()
            ) {
                Text(
                    text = stringResource(R.string.image_composable),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(0.dp, 0.dp, 0.dp, 16.dp)
                )
                Text(
                    text = stringResource(R.string.image_composable_description),
                    textAlign = TextAlign.Justify

                )
            }
        }
        Row(
            Modifier
                .weight(1f)
        )
        {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
                    .weight(1f)
                    .fillMaxSize()
            )
            {
                Text(
                    text = stringResource(R.string.row_composable),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(0.dp, 0.dp, 0.dp, 16.dp)
                )
                Text(
                    text = stringResource(R.string.row_composable_description),
                    textAlign = TextAlign.Justify

                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
                    .weight(1f)
                    .fillMaxSize()
            ) {
                Text(
                    text = stringResource(R.string.column_composable),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(0.dp, 0.dp, 0.dp, 16.dp)
                )
                Text(
                    text = stringResource(R.string.column_composable_descriptiom),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Quadrant()
    }
}