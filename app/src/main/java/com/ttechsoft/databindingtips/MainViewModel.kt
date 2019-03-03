package com.ttechsoft.databindingtips

import android.util.Log
import android.view.View

class MainViewModel {

    val text: String = "Test"

    fun onClickText(view: View) {
        Log.d(TAG, "Text Clicked!!")
    }

    companion object {
        private val TAG = MainViewModel::class.java.simpleName
    }

}