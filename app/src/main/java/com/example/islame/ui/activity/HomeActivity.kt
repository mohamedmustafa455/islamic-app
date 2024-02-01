package com.example.islame.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.islame.R
import com.example.islame.databinding.ActivityHomeBinding
import com.example.islame.ui.fragments.ahadeth.AhadethFragment
import com.example.islame.ui.fragments.qran.QranFragment
import com.example.islame.ui.fragments.radio.RadioFragment
import com.example.islame.ui.fragments.sepha.SephaFragment

class HomeActivity : AppCompatActivity() {
    lateinit var  binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_home)

         binding  = DataBindingUtil.setContentView(this, R.layout.activity_home)
        val viewModel = HomeViewModel()
        binding.viewModel = viewModel

        //intial fragment qran
        startFragment(QranFragment())
        //fragment selected
        onItemSelected()


    }
    fun onItemSelected(){
        binding.btnNavigation.setOnItemSelectedListener {itemMenuSelected ->
            if(itemMenuSelected.itemId == R.id.btn_radio){
               startFragment(RadioFragment())
            }else if (itemMenuSelected.itemId == R.id.btn_ahadeth){
                startFragment(AhadethFragment())
            }else if (itemMenuSelected.itemId == R.id.btn_sebha){
               startFragment(SephaFragment())
            }else if(itemMenuSelected.itemId==R.id.btn_qoran){
               startFragment(QranFragment())
            }
            return@setOnItemSelectedListener true
        }
    }
    fun startFragment (fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.frame_home,fragment)
            .commit()
    }
}