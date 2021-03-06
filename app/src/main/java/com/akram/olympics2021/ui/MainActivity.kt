package com.akram.olympics2021.ui


import android.os.Bundle
import android.view.LayoutInflater
import com.akram.olympics2021.data.DataManager
import com.akram.olympics2021.data.domain.Match
import com.akram.olympics2021.databinding.ActivityMainBinding
import com.akram.olympics2021.ui.adapter.matchAdapter
import com.akram.olympics2021.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader


class MainActivity : BaseActivity<ActivityMainBinding>()  {

    override val Log_tag: String = "MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        setup()
    }





    private fun parseFile(){
        val inputStream = assets.open("tokyo_2021.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser = CsvParser()
        buffer.forEachLine {
            val currentMatch = parser.parse(it)
            DataManager.addMatch(currentMatch)
        }
    }


    override fun setup() {
        parseFile()
        val adapter = matchAdapter(DataManager.matchListData)
        binding?.recycler?.adapter = adapter

    }

    override fun addCallBack() {
//        bindMatch()

    }

    private fun bindMatch(match: Match) {
        binding?.apply {
//            rank.text = match.rank.toShort()
        }

    }
    }

