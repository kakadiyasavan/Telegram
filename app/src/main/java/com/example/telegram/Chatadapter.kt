package com.example.telegram

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class Chatadapter(arrayList: ArrayList<Chatdata>) : RecyclerView.Adapter<Chatadapter.ChatHolder>() {

    var tool = arrayList

    lateinit var context : Context

    class ChatHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var profile = itemView.findViewById<CircleImageView>(R.id.profile)
        var name = itemView.findViewById<TextView>(R.id.name)
        var msg = itemView.findViewById<TextView>(R.id.msg)
        var time = itemView.findViewById<TextView>(R.id.time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHolder {

        context = parent.context

        return ChatHolder(LayoutInflater.from(parent.context).inflate(R.layout.teledata,parent,false))
    }

    override fun getItemCount(): Int {

        return tool.size
    }

    override fun onBindViewHolder(holder: ChatHolder, position: Int) {

        holder.name.text = tool.get(position).name
        holder.msg.text = tool.get(position).msg
        holder.time.text = tool.get(position).time
        Glide.with(context).load(tool.get(position).profile).into(holder.profile)
    }


}