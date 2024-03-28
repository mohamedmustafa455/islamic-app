package com.example.islame.ui.fragments.ahadeth

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islame.databinding.FragmentAhadethBinding
import com.example.islame.models.Constans
import com.example.islame.models.HadeethDM
import com.example.islame.ui.activity.detaileshadiht.HadithDetailesActivity

class AhadethFragment : Fragment() {



    private lateinit var viewModel: AhadethViewModel
    private lateinit var binding:FragmentAhadethBinding

    private lateinit var hadeethFileContent :String

    private lateinit var bodyHadeethList:List<String>
    private lateinit var titleHadithList:ArrayList<String>

    private lateinit var Hadeeth:MutableList<HadeethDM>

    private lateinit var adapter: AhadithAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentAhadethBinding.inflate(inflater,container,false)

        Hadeeth = mutableListOf()
        titleHadithList = ArrayList()
        hadeethFileContent = loadTextFileFromAsset().toString()
        readHadithContent()
        readHadeethHeader()
        // Initialize the adapter
        initAdapter()
        return binding.root
    }

    private fun initAdapter(){
        adapter= AhadithAdapter(titleHadithList)
        adapter.onHadithClicked=AhadithAdapter.onClickItem { nameOfHadith, position ->
            var intent = Intent(context, HadithDetailesActivity::class.java)
            intent.putExtra( Constans.NAMEHADEETH , Hadeeth[position].Header )
            intent.putExtra( Constans.CONTENTHADEETH , Hadeeth[position].HadeethContent )
            startActivity(intent)
        }
        binding.recyclerViewNameOfHadith.adapter=adapter
    }
    private fun loadTextFileFromAsset(): String? {
        return try {
            val inputStream = requireContext().assets.open("ahadeeth.txt")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            String(buffer, Charsets.UTF_8)
        } catch (ex: Exception) {
            ex.printStackTrace()
            null
        }
    }

    private fun readHadithContent(){
        bodyHadeethList = ArrayList()
        bodyHadeethList = hadeethFileContent.split("#")
       // Log.e("readHadeethHeader",bodyHadeethList.toString())
    }
    private fun readHadeethHeader(){
        for (hadeeth :String in bodyHadeethList){
            //var singleHadeethWithOutSpace =hadeeth.trim()
            var singleHadeethLine :MutableList<String> =hadeeth.split("\n").toMutableList()
          // singleHadeethLine.removeAt(0)
            var headerHadeeth=singleHadeethLine[1]

            titleHadithList.add(headerHadeeth)
            //Log.e("readHadeethHeader",headerHadeeth)
            singleHadeethLine.removeAt(1)

            var bodyhadeeth=singleHadeethLine.joinToString(separator = " ") {
                return@joinToString it
            }
            Hadeeth.add(HadeethDM(headerHadeeth,bodyhadeeth))
        }
    }







    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AhadethViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

