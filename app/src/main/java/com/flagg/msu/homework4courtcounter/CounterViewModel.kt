package com.flagg.msu.homework4courtcounter

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "CounterViewModel"
class CounterViewModel : ViewModel() {
    var scoreTeamA = 0
    var scoreTeamB = 0

    fun incrementTeamAScore(points: Int) {
        scoreTeamA += points
    } //Chat GPT

    fun incrementTeamBScore(points: Int) {
        scoreTeamB += points
    } //Chat GPT
}