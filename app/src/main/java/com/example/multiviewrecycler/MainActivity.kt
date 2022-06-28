package com.example.multiviewrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x:MutableList<Any> = MutableList<Any>(0, init = fun(x:Int){
            //return 0;
        })

        x.add(1)
        x.add("asd")
        x.add(x)
        for(data in x) {
            Log.w("Element", data.toString())
        }

        var recycler=this.findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=RecyclerAdapter(this,x)
    }
}