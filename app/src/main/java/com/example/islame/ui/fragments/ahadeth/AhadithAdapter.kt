package com.example.islame.ui.fragments.ahadeth

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islame.databinding.ItemNameOfHadithBinding

class AhadithAdapter (val arrayOfData:ArrayList<String>):RecyclerView.Adapter<AhadithAdapter.HadithViewholder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HadithViewholder {
        val binding =ItemNameOfHadithBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return HadithViewholder(binding)
    }

    override fun onBindViewHolder(holder: HadithViewholder, position: Int) {
        var data =arrayOfData[position]

        holder.bind(data )

        onHadithClicked.let {
            holder.binding.tvHeaderHadith.setOnClickListener {
                onHadithClicked?.onClicked(data,position)
            }
        }

    }

    override fun getItemCount(): Int {
        return arrayOfData.size
    }

    class HadithViewholder ( var binding:ItemNameOfHadithBinding ) : RecyclerView.ViewHolder(binding.root){


        fun bind (nameofHadith:String ){
            binding.tvHeaderHadith.text=nameofHadith
        }
    }

    fun interface onClickItem{
        fun onClicked(nameOfHadith:String ,position:Int)
    }

    var onHadithClicked:onClickItem?=null
}