package com.akram.olympics2021.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.akram.olympics2021.R
import com.akram.olympics2021.data.DataManager
import com.akram.olympics2021.data.domain.Match
import com.akram.olympics2021.databinding.ActivityMainBinding
import com.akram.olympics2021.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.log

class MainActivity : BaseActivity<ActivityMainBinding>()  {

    override val Log_tag: String = "MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding?.btnToSearch?.setOnClickListener {
//            startActivity(Intent(this, SearchActivity::class.java))
//        }


    }

    private fun parseFile(){
        val inputStream = assets.open("worldcities.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser = CsvParser()
        buffer.forEachLine {
            val currentCity = parser.parse(it)
            DataManager.addMatch(currentCity)
        }
//        bindCountryMax(DataManager.getmatch())
    }


    override fun setup() {
        parseFile()
    }

    override fun addCallBack() {
        TODO("Not yet implemented")
    }



    private fun bindMatch(match: Match){
        binding?.apply {
            rank!!.text = ("${match.rank}, ${match.noc}")
            noc!!.text = match.noc
            gold!!.text = match.gold.toString()
            silver!!.text = match.silver.toString()
            bronze!!.text = match.bronze.toString()
            noc!!.text = match.noc.toString()


        }
    }
    private fun bindCountryMin(match: Match){
        binding?.apply {
            rank!!.text = ("${match.rank}, ${match.rank}")
            noc!!.text = ("${match.noc} M")
            gold!!.text = match.gold.toString()
            silver!!.text = match.silver.toString()
            bronze!!.text = match.bronze.toString()


        }
    }
}