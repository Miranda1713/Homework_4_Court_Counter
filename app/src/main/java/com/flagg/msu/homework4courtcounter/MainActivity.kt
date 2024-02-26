package com.flagg.msu.homework4courtcounter

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.flagg.msu.homework4courtcounter.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    var scoreTeamA = 0
    var scoreTeamB = 0
    private lateinit var binding: ActivityMainBinding

    private val counterViewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "Got a CounterViewModel: $counterViewModel")
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View?) {
        counterViewModel.incrementTeamAScore(1) //Chat GPT
        //scoreTeamA++
        displayForTeamA(counterViewModel.scoreTeamA) //Chat GPT
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        counterViewModel.incrementTeamAScore(2) //Chat GPT
        //scoreTeamA += 2
        displayForTeamA(counterViewModel.scoreTeamA) //Chat GPT
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        counterViewModel.incrementTeamAScore(3) //Chat GPT
        //scoreTeamA += 3
        displayForTeamA(counterViewModel.scoreTeamA) //Chat GPT
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        counterViewModel.incrementTeamBScore(1) //Chat GPT
        //scoreTeamB++
        displayForTeamB(counterViewModel.scoreTeamB) //Chat GPT
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        counterViewModel.incrementTeamBScore(2) //Chat GPT
        //scoreTeamB += 2
        displayForTeamB(counterViewModel.scoreTeamB) //Chat GPT
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        counterViewModel.incrementTeamBScore(3) //Chat GPT
        //scoreTeamB += 3
        displayForTeamB(counterViewModel.scoreTeamB) //Chat GPT
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
        scoreTeamA = 0
        scoreTeamB = 0
        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }
}