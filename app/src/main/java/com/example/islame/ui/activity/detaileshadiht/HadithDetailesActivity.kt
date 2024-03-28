package com.example.islame.ui.activity.detaileshadiht

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.islame.R
import com.example.islame.databinding.ActivityDetailsQranBinding
import com.example.islame.databinding.ActivityHadithDetailesBinding
import com.example.islame.models.Constans

class HadithDetailesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHadithDetailesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHadithDetailesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var nameHadeeth =intent.getStringExtra(Constans.NAMEHADEETH)
        var contentHadeeth=intent.getStringExtra(Constans.CONTENTHADEETH)

        binding.tvHadithNameDetailsHadith.text=nameHadeeth
        binding.tvContentHadith.text=contentHadeeth


    }
}