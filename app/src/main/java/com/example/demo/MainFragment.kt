package com.example.demo

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.NavController
import androidx.navigation.Navigation


class MainFragment : Fragment(),View.OnClickListener {
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<ImageButton>(R.id.btn_home).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.btn_later).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.btn_read).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.btn_home -> navController!!.navigate(R.id.action_mainFragment_to_homeFragment)
            R.id.btn_read -> navController!!.navigate(R.id.action_mainFragment_to_readFragment)
            R.id.btn_later -> navController!!.navigate(R.id.action_mainFragment_to_laterFragment)
        }
    }

}