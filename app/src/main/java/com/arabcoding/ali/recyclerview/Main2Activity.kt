package com.arabcoding.ali.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
     var name =   intent.extras.get("name")
        supportActionBar?.title = name.toString()
    }
}
