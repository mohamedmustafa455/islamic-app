package com.example.islame.ui.activity.detailesqran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.islame.databinding.ActivityDetailsQranBinding
import com.example.islame.models.Constans
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

class DetailsQranActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsQranBinding
    private lateinit var fileName:String
    private lateinit var soraName :String
    private var aiatcont  :Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetailsQranBinding.inflate(layoutInflater)
        setContentView(binding.root)

        reciveDataFromIntint()
        bindDataToUI()
    }

    private fun reciveDataFromIntint() {
        //let to ensure data from intent is not empty

        intent.getIntExtra(Constans.POSITINSORA,1).let{positionFile->
            fileName ="${positionFile+1}.txt"
        }
        intent.getStringExtra(Constans.SORANAME).let {
            soraName= it!!.toString()
            // Toast.makeText(this, "$soraName",Toast.LENGTH_LONG).show()

        }
        intent.getStringExtra(Constans.AIATCONT).let{
            aiatcont= it!!.toInt()
        }
    }

    private fun bindDataToUI() {
        binding.tvSoraSoraNameDetailsQoran.text=soraName
       binding.tvContentQran.text=readFile()

    }

    private fun readFile():String{
        val inputStream: InputStream = assets.open(fileName)
     //   val inputString = inputStream.bufferedReader().use { it.readText() }

        val reader =BufferedReader(InputStreamReader(inputStream))
        val fileLine:List<String> = reader.readLines()
        val fileContent :String = fileLine.joinToString(separator = " ") {
            val index =fileLine.indexOf(it) +1
            return@joinToString it  +" { ${index} }"
        }

        return  fileContent
       // return inputString
// Now inputString contains the content of the asset file
    }

    //read file without num of aiat
//    private fun readFile2():String{
//        val inputStream: InputStream = assets.open(fileName)
//        val inputString = inputStream.bufferedReader().use { it.readText() }
//
//         return inputString
//// Now inputString contains the content of the asset file
//    }


}