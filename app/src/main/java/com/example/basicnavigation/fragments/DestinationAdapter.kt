package com.example.basicnavigation.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.basicnavigation.database.User
import com.example.basicnavigation.databinding.ItemUserBinding

class DestinationAdapter (private val users: List<User>): RecyclerView.Adapter<DestinationAdapter.DestinationHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationHolder {
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DestinationHolder(binding)
    }

    override fun onBindViewHolder(holder: DestinationHolder, position: Int) {
        holder.render(users[position])
    }

    override fun getItemCount(): Int = users.size

    class DestinationHolder(val binding: ItemUserBinding): RecyclerView.ViewHolder(binding.root){
        fun render (user: User){
            //tv 1 = username, tv 2 = id
            binding.tvUserName.setText(user.username)
            binding.tvUserNumber.setText(user.id.toString())
        }
    }
}