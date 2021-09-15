package com.noor.periodictable.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.noor.periodictable.databinding.FragmentElementDialogBinding

class ElementDialogFragment : DialogFragment() {

    private lateinit var binding: FragmentElementDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentElementDialogBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            ElementDialogFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}