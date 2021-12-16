package com.wei.laundrylist.bean

import org.litepal.crud.LitePalSupport

class Event(val name:String,val lastEventId:Int,val createTime:Long,val updateTime:Long) : LitePalSupport() {

    val id:Long = 0

}