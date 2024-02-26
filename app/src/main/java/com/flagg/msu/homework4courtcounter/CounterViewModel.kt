package com.flagg.msu.homework4courtcounter

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "CounterViewModel"
class CounterViewModel : ViewModel() {
    init {
        Log.d(TAG, "ViewModel instance created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "ViewModel instance about to be destroyed")
    }
}