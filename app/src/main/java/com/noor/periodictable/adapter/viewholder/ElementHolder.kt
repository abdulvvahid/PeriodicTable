package com.noor.periodictable.adapter.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.noor.periodictable.databinding.ItemRvMainActivityBinding
import com.noor.periodictable.model.Element

class ElementHolder(
    private val binding: ItemRvMainActivityBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(element: Element) {
        binding.element = element
    }

}