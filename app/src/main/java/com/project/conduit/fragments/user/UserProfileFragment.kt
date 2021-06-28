package com.project.conduit.fragments.user

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.project.conduit.R

class UserProfileFragment : Fragment(R.layout.fragment_profile) {

    companion object {
        fun newInstance() = UserProfileFragment()
    }

    private lateinit var viewModel: UserViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
        // TODO: Use the ViewModel
    }

}