package com.wellwellco.linktreerecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ListAdapter(
    val items: List<ListData>,
    val listener: OnClickListener
): RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.adapter_avatar, parent, false))

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val data = items[position]
        holder.image.setImageResource(data.social)
        holder.text.text = data.name
        holder.itemView.setOnClickListener {
            listener.onClick(models = data)
        }
    }

    override fun getItemCount() = items.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.image)
        val text = view.findViewById<TextView>(R.id.nameSo)
    }

    interface OnClickListener{
        fun onClick(models: ListData)
    }
}