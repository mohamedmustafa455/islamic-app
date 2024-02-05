package com.example.islame.ui.fragments.qran

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.islame.R
import com.example.islame.databinding.FragmentQranBinding
import com.example.islame.models.Constans

class QranFragment : Fragment() {


    private lateinit var viewModel: QranViewModel
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
        binding.recyclerViewNameOfSora.adapter=adapter
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(QranViewModel::class.java)
        // TODO: Use the ViewModel
    }

}