package com.wei.laundrylist.bean

import org.litepal.crud.LitePalSupport
import java.sql.Timestamp

class EventRecord(val eventId:Int,val time:Long) : LitePalSupport(){
    val id:Long =0
}