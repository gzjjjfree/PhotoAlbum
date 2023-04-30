package com.example.photoalbum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
fun PhotoAlbumInterface(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxHeight()
        .fillMaxWidth()
        .padding(20.dp),
        //horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center
    )
    {  //单列，下面三个组合项

            Image(painter = painterResource(R.drawable.gz01),
                contentDescription = null,
                modifier = Modifier.weight(6F)
                    .fillMaxWidth())

        Spacer(Modifier.height(24.dp))
        Text(text = stringResource(R.string.photo_explian),
            modifier = Modifier.weight(2F) //这里不选宽度是让整个文字居中，不然文字块全宽了还要设置里面
            .align(Alignment.CenterHorizontally), //水平居中
                fontSize = 30.sp,
           // modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(Modifier.height(24.dp))
       Row(modifier = Modifier.weight(1F)
           .fillMaxWidth()){

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