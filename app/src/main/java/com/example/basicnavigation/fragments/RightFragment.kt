package com.example.basicnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.basicnavigation.R
import com.squareup.picasso.Picasso

class RightFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_right, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val image = view?.findViewById<ImageView>(R.id.iv_right_image)
        Picasso.get().load("https://assets.pokemon.com/assets/cms2/img/pokedex/full/373.png").into(image)
    }

}