package com.example.mymusicappui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mymusicappui.Lib
import com.example.mymusicappui.libraries

@Composable
fun Library(){
    LazyColumn{
        items(libraries){
            lib ->
            LibItem(lib = lib)
        }
    }
}

@Composable
fun LibItem(lib: Lib){
    Column{
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
            ){
                    Row {
                        Icon(painter = painterResource(id = lib.icon),
                            modifier = Modifier.padding(8.dp).size(24.dp),
                            contentDescription = lib.name)
                    Text(text = lib.name)
                }
                Icon(imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null)
            }
        Divider(color = Color.LightGray)
    }
}