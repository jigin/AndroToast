package com.solocrew.jitpackapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.solocrew.android_toast.AndroToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var androToast = AndroToast()
        androToast.showToast(this,"Hello toast shown by Andro toast")

    }
}