package com.example.converter.scrins.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.R
import com.example.converter.model.nocash.NoCashItem
import kotlinx.android.synthetic.main.item_card.view.*

class SecondAdapter:RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    var listSecond = emptyList<NoCashItem>()

    class SecondViewHolder(view:View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card,parent,false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.nameItem.text = listSecond[position].ccy
        holder.itemView.buyItem.text = listSecond[position].buy
        holder.itemView.saleItem.text = listSecond[position].sale
    }

    override fun getItemCount(): Int {
        return listSecond.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<NoCashItem>){
        listSecond = list
        notifyDataSetChanged()
    }
}