package com.gonchar.project.bottomnavigationbar.navigation

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.gonchar.project.bottomnavigationbar.R

class NavigationFragment : Fragment() {

    companion object {
        fun newInstance() = NavigationFragment()
    }

    private lateinit var viewModel: NavigationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.navigation_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NavigationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
