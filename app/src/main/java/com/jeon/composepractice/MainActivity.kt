package com.jeon.composepractice

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import coil.compose.AsyncImage
import com.jeon.composepractice.ui.theme.ComposePracticeTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                ScaffoldPractice()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ScaffoldPractice(){
    Scaffold(
        topBar = { topBarPractice() },
        floatingActionButton = {myFloatingBtn()},
        bottomBar = {BottomBar()}
    ) { paddingValues ->

        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Text(text = "This is contents area")
        }

    }
}

@Composable
private fun BottomBar(){
    BottomAppBar(
        contentColor = Color.Red,
        containerColor = Color.LightGray
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Home, contentDescription = "Home Button")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Favorite, contentDescription = "Favorite Button")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Settings, contentDescription = "Setting Button")
            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun topBarPractice(){
    TopAppBar(
        title = { "Main" },
        navigationIcon = {
            IconButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(Icons.Default.Add, contentDescription = "This is icon Top Bar")
            }
        },
        actions = {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button")
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(Color.Red)
    )
}

@Composable
private fun myFloatingBtn(){
    FloatingActionButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Default.Menu, contentDescription = "Menu")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposePracticeTheme {
        ScaffoldPractice()
    }
}