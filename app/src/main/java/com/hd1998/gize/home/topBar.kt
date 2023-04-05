package com.hd1998.gize.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hd1998.gize.R

@Composable
fun TabContent(modifier: Modifier ){
    TopAppBar(contentPadding = PaddingValues(
        start = 5.dp,
        top = 5.dp,
        end = 5.dp
    )
    ) {
        Icon(painterResource(id  = R.drawable.baseline_density_medium_24) , contentDescription = "draw" , Modifier.clickable {  })
        Icon(painterResource(id = R.drawable.baseline_add_24), contentDescription = "Add" , Modifier.clickable {  } .padding(vertical = 40.dp) )
    }
}
@Preview
@Composable
fun show(){
    TabContent(modifier = Modifier)
}