package com.noor.periodictable.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.noor.periodictable.model.Element
import com.noor.periodictable.adapter.viewholder.ElementHolder

class PeriodicTableAdapter(
    private val elementList: List<Element>
) : RecyclerView.Adapter<ElementHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ElementHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int  = elementList.size
}