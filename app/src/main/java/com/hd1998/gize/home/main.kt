package com.hd1998.gize.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Home(){
    Scaffold(topBar = {
        TabContent(modifier = Modifier) }){
        Text(text = "" , Modifier.padding(it))
        HomeContent(alarms = list)
    }
}
@Preview
@Composable
fun PreHome(){
    Home()
}