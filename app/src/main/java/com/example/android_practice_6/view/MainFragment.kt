package com.example.android_practice_6.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_practice_6.adapter.ClickListener
import com.example.android_practice_6.adapter.ShibeAdapter
import com.example.android_practice_6.databinding.FragmentMainBinding
import com.example.android_practice_6.viewmodel.MainViewModel

class MainFragment : Fragment(), ClickListener {

    private lateinit var binding: FragmentMainBinding
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentMainBinding.inflate(inflater, container, false).apply {
        binding = this
    }.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.fetchShibes(5)

        binding.apply {
            viewModel.shibes.observe(viewLifecycleOwner, {
                rvList.apply {
                    adapter = ShibeAdapter(it, this@MainFragment)
                    layoutManager = LinearLayoutManager(context)
                }
            })
        }
    }

    override fun itemClick(shibe: String) {
        val action = MainFragmentDirections.actionMainFragmentToDetailFragment(shibe)
        findNavController().navigate(action)
    }


}