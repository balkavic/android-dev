package com.bnyevrik.exploringlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(R.layout.main_menu)
    }

    fun loadConstraintLayout(v: View) {
        setContentView(R.layout.activity_main)
    }

    fun LoadTableLayout(v: View) {
//        setContentView(R.layout.my_table_layout)
    }
}
