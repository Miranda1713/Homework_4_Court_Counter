package com.flagg.msu.homework4courtcounter

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "CounterViewModel"
class CounterViewModel : ViewModel() {
    var scoreTeamA = 0
    var scoreTeamB = 0

    val currentScoreTeamA: Int
        get() = scoreTeamA

    val currentScoreTeamB: Int
        get() = scoreTeamB
}