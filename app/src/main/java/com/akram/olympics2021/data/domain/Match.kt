package com.akram.olympics2021.data.domain

data class Match(
    val rank: Int,
    val noc:String,
    val gold: Int,
    val silver: Int,
    val bronze: Int,
    val total: Int,
    val rankByTotal: Int,
    val nocCode: String,
        )