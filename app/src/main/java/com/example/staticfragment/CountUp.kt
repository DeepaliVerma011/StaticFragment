package com.example.staticfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_count_up.view.*

class CountUp : Fragment() {

var count=0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val fragmentView=inflater.inflate(
            R.layout.fragment_count_up,
            container,
            false
        )
        fragmentView.button1.setOnClickListener{
     count++
            fragmentView.textView1.text=count.toString()

        }
        return inflater.inflate(R.layout.fragment_count_up, container, false)
    }


}