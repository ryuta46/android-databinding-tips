package com.ttechsoft.databindingtips

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import android.view.View

class MainViewModel: ViewModel() {

    val text: String = "Test"

    val inputText = MutableLiveData<String>()

    val maxInput = 4

    fun onClickText(view: View) {
        Log.d(TAG, "Text Clicked!!")
    }

    companion object {
        private val TAG = MainViewModel::class.java.simpleName
    }

}