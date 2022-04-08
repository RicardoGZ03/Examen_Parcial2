package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (context:Context, feedEntries:ArrayList<>):RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    private var localContext: Context? = null
    private var localFeed: ArrayList<>? = null
    init {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CustomAdapter.ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(localContext)
        val view: View = layoutInflater.inflate(R.layout.P_recyclerView,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {

    }


    class ViewHolder(v:View):RecyclerView.ViewHolder(v){
        val textPelicula: TextView = v.findViewById(R.id.textViewPeli)
        val textRating: TextView = v.findViewById(R.id.textViewRating)
        val textCali: TextView = v.findViewById(R.id.textViewCali)
    }
}