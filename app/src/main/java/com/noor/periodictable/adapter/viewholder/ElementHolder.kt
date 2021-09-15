package com.noor.periodictable.adapter.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.noor.periodictable.databinding.ItemRvMainActivityBinding
import com.noor.periodictable.model.Element

class ElementHolder(
    private val binding: ItemRvMainActivityBinding
) : RecyclerView.ViewHolder(binding.root) {

    var itemClickListener: ((view: View, element: Element, position: Int, code: Int) -> Unit)? = null

    fun bind(element: Element) {
        binding.element = element
        binding.llItem.setOnClickListener {
            itemClickListener?.invoke(it, element, adapterPosition, 0)
        }
    }

}