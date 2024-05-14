package com.jeon.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jeon.composepractice.ui.theme.ComposePracticeTheme

// remember

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ColumnPractice()
                }
            }
        }
    }
}

@Composable
fun ColumnPractice(){
   Column(
       modifier = Modifier.padding(top = 30.dp, bottom = 30.dp, start = 20.dp, end = 20.dp)
   ) {
       Text(
           text = "This is Column Practice",
           fontSize = 30.sp
       )
       Spacer(modifier = Modifier.padding(30.dp))
       Divider(
           thickness = 10.dp,
           color = Color.Blue
       )
       Spacer(modifier = Modifier.padding(30.dp))
       Text(
           text = "I Want this view in column1",
           fontSize = 30.sp,
       )
       Text(
           text = "I Want this view in column2",
           fontSize = 30.sp,
       )
   }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposePracticeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ColumnPractice()
        }
    }
}