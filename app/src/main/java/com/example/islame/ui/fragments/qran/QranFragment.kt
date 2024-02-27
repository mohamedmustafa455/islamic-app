package com.example.islame.ui.fragments.qran

import android.content.Intent
//import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islame.databinding.FragmentQranBinding
import com.example.islame.models.Constans
import com.example.islame.ui.activity.detailesqran.DetailsQranActivity

class QranFragment : Fragment() {


   // private lateinit var viewModel: QranViewModel
    private lateinit var binding : FragmentQranBinding
    private lateinit var adapter: QranAdaptr

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentQranBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdaptor()



    }

    private fun initAdaptor() {
        adapter= QranAdaptr(Constans.soraData)
        adapter.onSoraClick= QranAdaptr.OnItemClick { itemdata, position ->
           val intent =Intent(context,DetailsQranActivity::class.java)
            intent.putExtra(Constans.SORANAME,itemdata.soraName)
            intent.putExtra(Constans.AIATCONT,itemdata.aiatCount)
            intent.putExtra(Constans.POSITINSORA,position)
            startActivity(intent)



            //this tost to ensure sora name is valid and the rest of data
          //  Toast.makeText(context,"$itemdata +sora name   and position $position",Toast.LENGTH_LONG).show()
        }
        binding.recyclerViewNameOfSora.adapter=adapter
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(QranViewModel::class.java)
//
//    }

}