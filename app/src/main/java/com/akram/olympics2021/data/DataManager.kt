package com.akram.olympics2021.data

import com.akram.olympics2021.data.domain.Match

object DataManager {

    val matchList = mutableListOf<Match>()
    val matchListData: List<Match>
        get() = matchList

    fun addMatch (Match: Match) {
        matchList.add(Match)
    }


}