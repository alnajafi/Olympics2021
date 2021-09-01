package com.akram.olympics2021.data

import com.akram.olympics2021.data.domain.Match

object DataManager {

    val matchList = mutableListOf<Match>()
//    val nocSet = mutableSetOf<String>()
//    val nocMap = mutableMapOf<String,MutableList<Match>>()
    val matchListData: List<Match>
        get() = matchList

    fun addMatch (Match: Match) {
        matchList.add(Match)
    }

//    fun mapTheData () {
//        nocSet.forEach() {
//            nocMap.put (it.lowercase(), filterListByCountry(it))
//        }
//    }
//    private fun filterListByCountry(noc:String) = matchList.filter { it.noc == noc } as MutableList<Match>

}