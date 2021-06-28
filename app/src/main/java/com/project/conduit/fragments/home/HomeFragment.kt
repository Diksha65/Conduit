package com.project.conduit.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.project.conduit.R
import androidx.lifecycle.ViewModelProviders

class HomeFragment : Fragment(R.layout.fragment_home) {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}