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
    var currentFragmen:Fragment?=null
    var quranFragment=QranFragment()
    var ahadethFragment=AhadethFragment()
    var sebhaFragment=SephaFragment()
    var radioFragment =RadioFragment()
    fun onItemSelected(){
        binding.btnNavigation.setOnItemSelectedListener {itemMenuSelected ->
            if(itemMenuSelected.itemId == R.id.btn_radio){
               startFragment(radioFragment)

            }else if (itemMenuSelected.itemId == R.id.btn_ahadeth){
                startFragment(ahadethFragment)

            }else if (itemMenuSelected.itemId == R.id.btn_sebha){
               startFragment(sebhaFragment)
            }else if(itemMenuSelected.itemId==R.id.btn_qoran){
               startFragment(quranFragment)
            }
            return@setOnItemSelectedListener true
        }
    }
    fun startFragment (fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.frame_home,fragment)
            .commit()
        currentFragmen = fragment
    }

//    override fun onBackPressed() {
//        if (currentFragmen == quranFragment){
//            binding.btnNavigation.selectedItemId = R.id.btn_qoran
//
//        }else if (currentFragmen==ahadethFragment){
//            binding.btnNavigation.selectedItemId = R.id.btn_ahadeth
//
//        }else if (currentFragmen==sebhaFragment){
//            binding.btnNavigation.selectedItemId = R.id.btn_sebha
//
//        }else if(currentFragmen==radioFragment){
//            binding.btnNavigation.selectedItemId = R.id.btn_radio
//
//        }
//        super.onBackPressed()
//    }
}