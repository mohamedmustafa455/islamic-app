package com.example.islame.ui.activity.detailesqran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.islame.databinding.ActivityDetailsQranBinding
import com.example.islame.models.Constans
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

class DetailsQranActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsQranBinding
    lateinit var fileName:String
    lateinit var soraName :String
    var aiatcont  :Int = 0


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

        var reader =BufferedReader(InputStreamReader(inputStream))
        var fileLine:List<String> = reader.readLines()
        var fileContent :String = fileLine.joinToString(separator = " ") {
            var index =fileLine.indexOf(it) +1
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