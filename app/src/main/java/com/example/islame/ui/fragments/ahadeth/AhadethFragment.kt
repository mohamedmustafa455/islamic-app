package com.example.islame.ui.fragments.ahadeth

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islame.R

class AhadethFragment : Fragment() {

    companion object {
        fun newInstance() = AhadethFragment()
    }

    private lateinit var viewModel: AhadethViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_ahadeth, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AhadethViewModel::class.java)
        // TODO: Use the ViewModel
    }

}