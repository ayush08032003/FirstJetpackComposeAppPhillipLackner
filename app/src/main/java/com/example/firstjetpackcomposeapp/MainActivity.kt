package com.example.firstjetpackcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Text(text = "Hello")
//            Text(text = "World") // this will basically stack the words on top of other., to make it work good, we r gonna use column{}
/*
            Row{ this is for setting text in row wise
                Text(text = "Hello")
                Text(text = "World")
            }
*/
            Column (
                modifier = Modifier
                    .width(200.dp)
                    .height(500.dp)
                    .background(Color.Green),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Hello")
                Text(text = "World")
                Text(text = "Jetpack Compose")
            }
        }
    }
}


/*
NOTES :
horizontalAlignment = Alignment.CenterHorizontally , this will make the compose centerlly aligned, in the cross axis,
But when you run the app, you will not notice any difference, as by default, it will only take that much space that is needed.

But if we use, .fillMaxSize() along with the modifier, it will take up the whole space, and thus the horizontAlignement wll work. and make it center cross axis.

 Arrangement “class” is used to control the spacing of children in the main axis, so you will find in Column a verticalArrangement param and
 in Row a horizontalArrangement param.
 The Alignment “class” is used to control spacing of children in the cross axis, so you will find in Column a horizontalAlignment param and
 in Row a verticalAlignment param.

     Arrangement.Start: places items in the main axis start.
    Arrangement.End: places items in the main axis end.
    Arrangement.Center: places items in the main axis center.
    Arrangement.SpaceBetween: places first item in the main axis start and the last item in the main axis end,
        then distribute the remaining items evenly in the space left.
    Arrangement.SpaceAround: puts the same amount of space in the left and the right of each item (in a Row, or top and bottom in a Column).
        Notice that spaces in the middle will be twice as large as spaces in the ends.
    Arrangement.SpaceEvenly: puts the same amount of space between items, the start and the end.
        It differentiates from space around because the spacing in start and end is the same as the spacing in the middle.


On the other side, one can also use, .fillMaxHeight(0.45f). or .fillMaxWidht(0.67f) as to make it percentage wise
 */