package com.arabcoding.ali.recyclerview

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.list_row.view.*

class CustomAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_row, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        val data :User = userList[position]

        holder.textViewName.text = "الإسم: " + data.name
        holder.textViewAge.text = "العمر: "+ data.age
        holder.my_image.setImageResource(data.image)
        holder.my_data = data
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View,var my_data:User?=null) : RecyclerView.ViewHolder(itemView) {
            init {
                itemView.setOnClickListener {
               //    Toast.makeText(itemView.context,my_data?.name,Toast.LENGTH_LONG).show()
                    var my_intent = Intent(itemView.context,Main2Activity::class.java)
                    my_intent.putExtra("name",my_data?.name)
                   itemView.context.startActivity(my_intent)
                }
            }
        val textViewName = itemView.name as TextView
        val textViewAge  = itemView.age as TextView
        val my_image  = itemView.img as ImageView

    }

}