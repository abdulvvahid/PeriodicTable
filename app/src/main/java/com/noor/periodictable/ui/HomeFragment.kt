package com.noor.periodictable.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.noor.periodictable.adapter.PeriodicTableAdapter
import com.noor.periodictable.databinding.FragmentHomeBinding
import com.noor.periodictable.util.ElementList.createElementList

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var tableAdapter: PeriodicTableAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        initItems()
        return binding.root
    }

    private fun initItems(){

        tableAdapter = PeriodicTableAdapter(createElementList())

        binding.rvTable.layoutManager = GridLayoutManager(requireContext(), 18, RecyclerView.VERTICAL, false)
        binding.rvTable.adapter = tableAdapter
        tableAdapter.itemClickListener = { _, element, _, _ ->
            if(element.abbreviation != null){
                val dialog = ElementDialogFragment.newInstance(element)
                dialog.show(childFragmentManager, "dialog")
            }
        }
    }

}