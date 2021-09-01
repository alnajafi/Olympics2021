package com.akram.olympics2021.util

import com.akram.olympics2021.data.domain.Match

class CsvParser {
    fun parse(line:String): Match {
        val tokens = line.split(",")
        return Match(
            rank = tokens[Constants.ColumnIndex.RANK].toInt(),
            noc = tokens[Constants.ColumnIndex.NOC],
            gold = tokens[Constants.ColumnIndex.GOLD].toInt(),
            silver = tokens[Constants.ColumnIndex.SILVER].toInt(),
            bronze = tokens[Constants.ColumnIndex.Bronze].toInt(),
            total = tokens[Constants.ColumnIndex.TOTAL].toInt(),
            rankByTotal = tokens[Constants.ColumnIndex.RANK_BY_TOTAL].toInt(),
            nocCode = tokens[Constants.ColumnIndex.NOC_CODE]

        )
    }
}
