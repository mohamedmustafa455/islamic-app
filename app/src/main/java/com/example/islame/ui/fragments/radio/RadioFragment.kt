package com.example.islame.ui.fragments.radio

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islame.R

class RadioFragment : Fragment() {

    companion object {
        fun newInstance() = RadioFragment()
    }

    private lateinit var viewModel: RadioViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_radio, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RadioViewModel::class.java)
        // TODO: Use the ViewModel
    }

}