package com.noor.periodictable.adapter.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.noor.periodictable.databinding.ItemRvMainActivityBinding
import com.noor.periodictable.model.Element

class ElementHolder(
    val binding: ItemRvMainActivityBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(element: Element) {
        binding.tvItemId.text = element.id.toString()
        binding.tvItemName.text = element.name
        binding.tvItemAbbreviation.text = element.abbreviation
    }

}