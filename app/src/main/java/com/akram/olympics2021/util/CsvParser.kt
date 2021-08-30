package com.akram.olympics2021.util

import com.akram.olympics2021.data.domain.Match

class CsvParser {
    fun parse(line:String): Match {
        val token = line.split(",")
        return Match(
            rank = token[Constants.ColumnIndex.RANK].toInt(),
            noc = token[Constants.ColumnIndex.NOC],
            gold = token[Constants.ColumnIndex.GOLD].toInt(),
            silver = token[Constants.ColumnIndex.SILVER].toInt(),
            bronze = token[Constants.ColumnIndex.Bronze].toInt(),
            total = token[Constants.ColumnIndex.TOTAL].toInt(),
            rankByTotal = token[Constants.ColumnIndex.RANK_BY_TOTAL].toInt(),
            nocCode = token[Constants.ColumnIndex.NOC_CODE]

        )
    }
}
