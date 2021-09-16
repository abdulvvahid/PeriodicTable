package com.noor.periodictable.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.noor.periodictable.R
import com.noor.periodictable.adapter.PeriodicTableAdapter
import com.noor.periodictable.databinding.FragmentHomeBinding
import com.noor.periodictable.util.ElementList.createElementList
import com.noor.periodictable.util.ItemDecoration

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

    private fun initItems() {

        tableAdapter = PeriodicTableAdapter(createElementList())

        binding.rvTable.layoutManager =
            GridLayoutManager(
                requireContext(),
                resources.getInteger(R.integer.recycler_view_columns),
                RecyclerView.VERTICAL,
                false
            )
        binding.rvTable.adapter = tableAdapter
        binding.rvTable.setHasFixedSize(true)
        binding.rvTable.itemAnimator
        binding.rvTable.addItemDecoration(
            ItemDecoration(
                resources.getInteger(R.integer.recycler_view_columns),
                resources.getDimensionPixelSize(R.dimen.element_spacing)
            )
        )
        tableAdapter.itemClickListener = { _, element, _, _ ->
            if (element.abbreviation != null) {
                val dialog = ElementDialogFragment.newInstance(element)
                dialog.show(childFragmentManager, "dialog")
            }
        }
    }

}