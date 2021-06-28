package com.project.conduit.fragments.articles

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.conduit.R

class ReadArticleFragment : Fragment(R.layout.fragment_read_article) {

    companion object {
        fun newInstance() = ReadArticleFragment()
    }

    private lateinit var viewModel: ArticleViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ArticleViewModel::class.java)
        // TODO: Use the ViewModel
    }

}