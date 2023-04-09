package com.example.converter.scrins.room

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.converter.R
import com.example.converter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_room.view.*

class RoomFragment : Fragment() {

    private var ctx: Context? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_room, container, false)
        view.tabLayout.tabIconTint = null
        view.viewPager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
        TabLayoutMediator(view.tabLayout, view.viewPager) { tab, pos ->

            when (pos) {
                0 -> {
                    tab.setIcon(R.drawable.ic_left_24)
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_right_24)
                }
            }

        }.attach()
        return view
    }
}