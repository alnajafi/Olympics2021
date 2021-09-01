package com.akram.olympics2021.data

import com.akram.olympics2021.data.domain.Match

object DataManager {

    private val matchList = mutableListOf<Match>()
    val matchListData: List<Match>
        get() = matchList

    fun addMatch (match: Match) {
        matchList.add(match)
    }


}