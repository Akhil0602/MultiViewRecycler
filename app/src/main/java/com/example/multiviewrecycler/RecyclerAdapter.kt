package com.example.multiviewrecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(contex: Context,var list: List<Any>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


    var context: Context = contex

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)//.inflate(R.layout.activity_main, parent, false)

        when(viewType)
        {
            0 -> return ViewHolder(v.inflate(R.layout.forint,parent,false))
            1 -> return ViewHolder(v.inflate(R.layout.forstring,parent,false))
            else -> return ViewHolder(v.inflate(R.layout.others,parent,false))
        }
       // return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var x=holder.text.text.toString() + (list.get(position).toString())
        holder.text.text= x
    }

    override fun getItemViewType(position: Int): Int {
        var x=list.get(position)
        when(x)
        {
            is Int-> return 0
            is String-> return 1
            else -> return 2
        }
    }


    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var text=itemView.findViewById<TextView>(R.id.textt)
    }



}