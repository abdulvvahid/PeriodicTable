package com.noor.periodictable.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.noor.periodictable.databinding.FragmentElementDialogBinding
import com.noor.periodictable.model.Element
import com.noor.periodictable.util.Constants.Companion.SEND_ELEMENT

class ElementDialogFragment : DialogFragment() {

    private lateinit var binding: FragmentElementDialogBinding
    private var element: Element? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            element = it.getSerializable(SEND_ELEMENT) as Element
        }
        setStyle(STYLE_NO_TITLE,
            android.R.style.Theme_Material_Light_Dialog_Alert);
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentElementDialogBinding.inflate(layoutInflater, container, false)

        binding.element = element

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(element: Element) =
            ElementDialogFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(SEND_ELEMENT, element)
                }
            }
    }
}