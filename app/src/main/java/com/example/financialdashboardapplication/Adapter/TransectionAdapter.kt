package com.example.financialdashboardapplication.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.financialdashboardapplication.Model.Transection
import com.example.financialdashboardapplication.R
import com.example.financialdashboardapplication.databinding.TransectionViewholderBinding

class TransectionAdapter(private val list: List<Transection>) :
    RecyclerView.Adapter<TransectionAdapter.TransectionViewHolder>() {

    inner class TransectionViewHolder(val binding: TransectionViewholderBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransectionViewHolder {
        val binding =
            TransectionViewholderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TransectionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TransectionViewHolder,position: Int) {
        holder.binding.dateTxt.text = list[position].date
        holder.binding.titleTxt.text = list[position].title
        holder.binding.priceTxt.text = "$"+ list[position].price

        if (list[position].price >= 0.0){
            holder.binding.img.setImageResource(R.drawable.arrow_green)
            holder.binding.img.setBackgroundResource(R.drawable.green_bg)
            holder.binding.priceTxt.setTextColor(holder.itemView.context.resources.getColor(R.color.darkGreen))
        }else{
            holder.binding.img.setImageResource(R.drawable.arrow_ref)
            holder.binding.img.setBackgroundResource(R.drawable.light_red_bg)
            holder.binding.priceTxt.setTextColor(holder.itemView.context.resources.getColor(R.color.red))
        }
    }

    override fun getItemCount(): Int = list.size


}