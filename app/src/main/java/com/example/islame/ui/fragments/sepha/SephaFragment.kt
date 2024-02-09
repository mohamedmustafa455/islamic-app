package com.example.islame.ui.fragments.sepha


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.islame.databinding.FragmentSephaBinding
import com.example.islame.models.Constans
import kotlin.properties.Delegates

class SephaFragment : Fragment() {

  private lateinit var binding:FragmentSephaBinding

    private var displayCounter by Delegates.notNull<Int>()

    private var currentRotate =0f

    private   var counter:Int = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentSephaBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()

    }

    private fun initListener(){
        binding.btnContSebha.setOnClickListener {
            onClickTasbeh()
        }

        binding.btnNameZekr.setOnClickListener {
            onClickTasbeh()
        }
    }

    private  fun onClickTasbeh(){

            rotateImage()
            displayCounter = ++counter
            binding.btnContSebha.text=displayCounter.toString()

            if(counter==1){
                binding.btnNameZekr.text= Constans.SOBHANAALLA
            }
            if(counter==33){
                binding.btnNameZekr.text= Constans.ELHAMDLLALLA
            }
            if(counter==66){
                binding.btnNameZekr.text= Constans.ALLAHAKBER
            }
            if(counter==100){
                binding.btnNameZekr.text= Constans.SOBHANAALLAWABEHAMDEH
                binding.btnContSebha.text= counter.toString()
                counter=0

            }

    }

    private fun rotateImage(){
        currentRotate+=90f
        binding.imagBodySepha.rotation=currentRotate
    }










}