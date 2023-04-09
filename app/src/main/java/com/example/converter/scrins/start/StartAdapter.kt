package com.example.converter.scrins.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.R
import com.example.converter.model.cash.CashItem
import kotlinx.android.synthetic.main.item_card.view.*

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = emptyList<CashItem>()

    class StartViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card,parent,false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.nameItem.text = listStart[position].ccy
        holder.itemView.buyItem.text = listStart[position].buy
        holder.itemView.saleItem.text = listStart[position].sale
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<CashItem>){
        listStart = list
        notifyDataSetChanged()
    }
}