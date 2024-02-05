package com.example.islame.ui.fragments.qran

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islame.databinding.ItemNameOfSoraAndCountIatBinding
import com.example.islame.models.SoraDM

class QranAdaptr(var dataofArray: ArrayList<SoraDM> ):RecyclerView.Adapter<QranAdaptr.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding= ItemNameOfSoraAndCountIatBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return MyViewHolder(binding)
    }



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data =dataofArray[position]

        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return dataofArray.size
    }


    class MyViewHolder (var binding: ItemNameOfSoraAndCountIatBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(data:SoraDM){
            binding.tvSoraName.text=data.soraName
            binding.tvCountIat.text=data.aiatCount
        }


    }


}