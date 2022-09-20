package com.example.facebook_simulator

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.facebook_simulator.databinding.FragmentRecyclerView2Binding
import com.example.facebook_simulator.databinding.ItemListBinding

lateinit var binding: ItemListBinding
class ItemAdapter(private val list:ArrayList<User>):RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {
        var tv_name: TextView = binding.tvName
        var tv_time:TextView=binding.tvTime
        var image_profile:ImageView=binding.circleImageView
        var image_post:ImageView=binding.post

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }




    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv_name.text =list[position].mUserName
        holder.tv_time.text=list[position].mTimesAgo
        holder.image_profile.setImageResource(list[position].mUserPhoto)
        holder.image_post.setImageResource(list[position].mPostPhoto)
    }

}