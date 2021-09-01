package com.akram.olympics2021.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akram.olympics2021.R
import com.akram.olympics2021.data.domain.Match
import com.akram.olympics2021.ui.viewHolders.MatchViewHolder

class matchAdapter(val list: List<Match>) : RecyclerView.Adapter<MatchViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycle_item,parent,false)
        return MatchViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
        val currentItem = list[position]

        holder.binding.apply {
            rankNumber.text = currentItem.rank.toString()
            country.text = currentItem.noc
            rankByTotalNumber.text = currentItem.rankByTotal.toString()
            gold.text = currentItem.gold.toString()
            silver.text = currentItem.silver.toString()
            bronze.text = currentItem.bronze.toString()
            total.text = currentItem.total.toString()
        }
    }
}