package com.arabcoding.ali.recyclerview

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.LayoutAnimationController
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adding a layoutmanager

        my_recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)

        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("علي جمال", "٢٢",R.drawable.avatar1))
        users.add(User("رمزي أحمد", "٣٣",R.drawable.avatar2))
        users.add(User("فايز إبراهيم", "٥٥",R.drawable.avatar3))
        users.add(User("ياسر محمود", "٤٣",R.drawable.avatar4))
        users.add(User("بلال أحمد", "٢٢",R.drawable.avatar1))
        users.add(User("أشرف سالم", "٥٥",R.drawable.avatar2))
        users.add(User("إسلام مصطفى", "١٢",R.drawable.avatar3))
        users.add(User("سعد الضبي", "٣٠",R.drawable.avatar4))
        users.add(User("عبد الله أحمد", "٣٣",R.drawable.avatar1))
        users.add(User("أسماء محمد", "٥٤",R.drawable.avatar2))
        users.add(User("مريم علي", "٢٤",R.drawable.avatar3))
        users.add(User("سعيد سالم", "٥٦",R.drawable.avatar4))




        //creating our adapter
        val adapter = CustomAdapter(users)


        //now adding the adapter to recyclerview
        my_recyclerView.adapter = adapter





    }
}