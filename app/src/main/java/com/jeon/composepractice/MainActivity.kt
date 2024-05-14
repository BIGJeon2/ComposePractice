package com.jeon.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jeon.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                // A surface container using the 'background' color from the theme
                MyTextFieldPractice3()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFieldPractice(){

    var textState by remember {
        mutableStateOf("Hello")
    }

    TextField(
        value = textState,
        onValueChange = {
            textState = it
        },
        label = {
            Text(text = "Text Input Area")
        }
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFieldPractice2(){

    var textState by remember {
        mutableStateOf("Hello")
    }

    OutlinedTextField(
        value = textState,
        onValueChange = {
            textState = it
        },
        label = {
            Text(text = "Text Input Area")
        }
    )

}

// TextField 부분에 뭔가 입력 하고
// 버튼을 클릭하면
// 밑에 Text부분에 입력한 값이 나오도록 하는 기능
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFieldPractice3(){

    //입력한 부분
    var textState by remember {
        mutableStateOf("")
    }
    //출력한 부분
    var outPutState by remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TextField(
            value = textState,
            onValueChange = {
            textState = it
        },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Text Input Area")
            }
        )
        Button(onClick = {
            outPutState = textState
        },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Input")
        }

        Text(
            text = "결과값 텍스트 : ${textState}"
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
            MyTextFieldPractice3()
        }
    }
}