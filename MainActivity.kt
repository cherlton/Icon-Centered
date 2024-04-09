package com.example.myapplication
import android.media.Image import
android.os.Bundle
import androidx.activity.ComponentActivity import
androidx.activity.compose.setContent import
androidx.compose.foundation.Image import
androidx.compose.foundation.layout.Arrangement import
androidx.compose.foundation.layout.Column import
androidx.compose.foundation.layout.fillMaxSize import
androidx.compose.foundation.layout.padding import
androidx.compose.material3.MaterialTheme import
androidx.compose.material3.Surface import
androidx.compose.material3.Text import
androidx.compose.runtime.Composable import
androidx.compose.ui.Alignment import
androidx.compose.ui.Modifier import
androidx.compose.ui.graphics.Color import
androidx.compose.ui.res.painterResource import
androidx.compose.ui.res.stringResource import
androidx.compose.ui.text.font.FontWeight import
androidx.compose.ui.tooling.preview.Preview import
androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
class MainActivity : ComponentActivity() { override
fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
 setContent {
 MyApplicationTheme {
 // A surface container using the 'background' color from the theme
 Surface(
 modifier = Modifier.fillMaxSize(),
 color = MaterialTheme.colorScheme.background
 ) {
 taskMethod(message1= stringResource(R.string.all_tasks_completed),message2=
stringResource(R.string.nice_work))
 }
 }
 }
 }
}
@Composable
fun taskMethod(message1: String,message2:String, modifier: Modifier = Modifier) {
Surface(color = Color.White) { Column(
 verticalArrangement = Arrangement.Center,
horizontalAlignment = Alignment.CenterHorizontally,
modifier=modifier
 ) {
 val image= painterResource(R.drawable.ic_task_completed)
 Image(
painter=image,
contentDescription=null )
 Text(text =message1,
fontWeight = FontWeight.Bold,
 modifier= modifier.padding(8.dp)
 )
 Text(text =message2,
 modifier= modifier.padding(8.dp)
 )
 }
 }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
MyApplicationTheme {
 taskMethod(message1= stringResource(R.string.all_tasks_completed),message2=
stringResource(R.string.nice_work))
 }
} 
