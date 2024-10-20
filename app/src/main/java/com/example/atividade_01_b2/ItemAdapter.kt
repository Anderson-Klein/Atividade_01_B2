package com.example.atividade_01_b2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class ItemAdapter(private val itemList: MutableList<String>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    // Classe interna ViewHolder
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(android.R.id.text1)
    }

    // Infla o layout do item da lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return ViewHolder(view) // erro proposital no nome da classe retornada
    }

    // Liga os dados aos componentes do item
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.textView.text = item
    }

    override fun getItemCount(): Int = itemList.size

    fun addItem(item: String) {
        itemList.add(item)
        notifyItemInserted(itemList.size - 1)
    }
}