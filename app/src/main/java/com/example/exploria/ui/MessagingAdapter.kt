package com.example.exploria.ui

import android.os.Message
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exploria.R
import com.example.exploria.utils.contants.SEND_ID
import java.util.Date.from

private val View.tv_message: Unit
    get() {}
private val Message.id: Any
    get() {}

class MessagingAdapter : RecyclerView.Adapter<MessagingAdapter.MessageViewHolder>() {

              var messageslist = mutableListOf<Message>()
    inner class MessageViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){
        init {
               itemview.setOnClickListener {

                   messageslist.removeAt(adapterPosition)
                   notifyItemRemoved(adapterPosition)
               }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
      return MessageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.message,parent, false))
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
       val currentMessage = messageslist[position]

        when (currentMessage .id) {
            SEND_ID -> {
                holder.itemView.tv_message.apply {

                }
            }
        }
    }

    override fun getItemCount(): Int {
        return messageslist.size
    }
}










