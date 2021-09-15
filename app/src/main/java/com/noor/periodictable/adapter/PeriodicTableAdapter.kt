package com.noor.periodictable.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.noor.periodictable.model.Element
import com.noor.periodictable.adapter.viewholder.ElementHolder
import com.noor.periodictable.databinding.ItemRvMainActivityBinding

class PeriodicTableAdapter(
    private val elementList: List<Element>
) : RecyclerView.Adapter<ElementHolder>() {

    var itemClickListener: ((view: View, element: Element, position: Int, code: Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementHolder {
        val binding = ItemRvMainActivityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ElementHolder(binding)
    }

    override fun onBindViewHolder(holder: ElementHolder, position: Int) {
        holder.itemClickListener = itemClickListener
        holder.bind(elementList[position])
    }

    override fun getItemCount(): Int  = elementList.size
}