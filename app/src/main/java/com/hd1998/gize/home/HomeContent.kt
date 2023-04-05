package com.hd1998.gize.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import com.hd1998.gize.data.AlarmMessage
import java.util.*

@Composable
fun HomeContent(alarms : List<AlarmMessage> ){
    LazyColumn{
      items(alarms){ alarm ->
         SingleAlarm(alarm = alarm)
      }
    }
}
@Composable
fun SingleAlarm(alarm : AlarmMessage){
    Column(){
        Row(Modifier.fillMaxWidth()
            .padding()){Text(text = alarm.description )
            Button(onClick = { /*TODO*/ }) {
                Text(text = alarm.Song)
            }
        }
        Text(text = alarm.date.toString())
    }
}
val list= listOf(AlarmMessage(Date() , "i love you" , "doIt"))