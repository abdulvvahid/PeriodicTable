package com.noor.periodictable.adapter.viewholder

import android.animation.Animator
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.noor.periodictable.databinding.ItemRvMainActivityBinding
import com.noor.periodictable.model.Element
import jp.wasabeef.recyclerview.animators.holder.AnimateViewHolder

class ElementHolder(
    private val binding: ItemRvMainActivityBinding
) : RecyclerView.ViewHolder(binding.root), AnimateViewHolder {

    var itemClickListener: ((view: View, element: Element, position: Int, code: Int) -> Unit)? = null

    fun bind(element: Element) {
        binding.element = element
        binding.background = element.elementType
        binding.llItem.setOnClickListener {
            itemClickListener?.invoke(it, element, adapterPosition, 0)
        }
    }

    override fun animateAddImpl(
        holder: RecyclerView.ViewHolder,
        listener: Animator.AnimatorListener
    ) {
        itemView.animate().apply {
            translationY(0f)
            alpha(1f)
            duration = 300
            setListener(listener)
        }.start()

    }

    override fun animateRemoveImpl(
        holder: RecyclerView.ViewHolder,
        listener: Animator.AnimatorListener
    ) {
        itemView.animate().apply {
            translationY(-itemView.height * 0.3f)
            alpha(0f)
            duration = 300
            setListener(listener)
        }.start()
    }

    override fun preAnimateAddImpl(holder: RecyclerView.ViewHolder) {
    }

    override fun preAnimateRemoveImpl(holder: RecyclerView.ViewHolder) {
        itemView.setTranslationY(-itemView.height * 0.3f)
        itemView.setAlpha(0f)
    }

}