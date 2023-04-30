package com.example.photoalbum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.photoalbum.ui.theme.PhotoAlbumTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhotoAlbumTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PhotoAlbumInterface()
                }
            }
        }
    }
}

@Composable
fun PhotoAlbumInterface() {
    var result by remember { mutableStateOf(1) }
    val photoExplanation: Int   //资源变量是id  Int类型
    val imageResource: Int
    when (result) {
        1 -> { imageResource = R.drawable.gz1
             photoExplanation = R.string.photo_explian1 }
        2 -> { imageResource = R.drawable.gz2
             photoExplanation = R.string.photo_explian2 }
        3 -> { imageResource = R.drawable.gz3
             photoExplanation = R.string.photo_explian3 }
        4 -> { imageResource = R.drawable.gz4
             photoExplanation = R.string.photo_explian4 }
        5 -> { imageResource = R.drawable.gz5
             photoExplanation = R.string.photo_explian5 }
        6 -> { imageResource = R.drawable.gz6
             photoExplanation = R.string.photo_explian6 }
        7 -> { imageResource = R.drawable.gz7
             photoExplanation = R.string.photo_explian7 }
        8 -> { imageResource = R.drawable.gz8
             photoExplanation = R.string.photo_explian8 }
        9 -> { imageResource = R.drawable.gz9
             photoExplanation = R.string.photo_explian9 }
        else -> { imageResource = R.drawable.gz10
             photoExplanation = R.string.photo_explian10 }
    }
    Column(modifier = Modifier.fillMaxHeight()
        .fillMaxWidth()
        //.padding(20.dp)
        .background(color = Color(0XFF99CCFF))
        //horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center
    )
    {  //单列，下面三个组合项
Box(modifier = Modifier.weight(6F)
    .fillMaxWidth()
    .padding(20.dp)){
    Image(painter = painterResource(id = imageResource),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        //contentScale = ContentScale.Inside
            //
            )
}
        Spacer(Modifier.height(24.dp))
        Text(text = stringResource(id = photoExplanation),
            modifier = Modifier.weight(2F) //这里不选宽度是让整个文字居中，不然文字块全宽了还要设置里面
            //.align(Alignment.CenterHorizontally) //水平居中
            .padding(top = 50.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center, //字体居中
            fontWeight = FontWeight.Bold, //粗体
                fontSize = 30.sp
        )
       Spacer(Modifier.height(24.dp))
       Row(modifier = Modifier.weight(1F)
           .align(Alignment.CenterHorizontally)
       ){
           Button(onClick =
           {
               val x = result
               while (x == result) {
                   result = (1..10).random()
               }
           }) {
               Text(text = "下一张")
           }
       }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PhotoAlbumTheme {
        PhotoAlbumInterface()
    }
}