package com.wei.laundrylist.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wei.laundrylist.bean.EventRecord

class RecordAdapter(val context:Context,val data:List<EventRecord>):RecyclerView.Adapter<RecordAdapter.RecordViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    class RecordViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        init {

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecordViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}