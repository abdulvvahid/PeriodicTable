package com.noor.periodictable.bindingadapter

import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import com.noor.periodictable.R

object Bindings {

    @JvmStatic
    @BindingAdapter("changeBackground")
    fun ViewGroup.changeBackground(code: Int) {
        when (code) {
            1 -> setBackgroundResource(R.drawable.bg_purple)
            2 -> setBackgroundResource(R.drawable.bg_dark_orange)
            3 -> setBackgroundResource(R.drawable.bg_yellow)
            4 -> setBackgroundResource(R.drawable.bg_red)
            5 -> setBackgroundResource(R.drawable.bg_dark_blue)
            6 -> setBackgroundResource(R.drawable.bg_blue)
            7 -> setBackgroundResource(R.drawable.bg_purple)
            8 -> setBackgroundResource(R.drawable.bg_orange)
            9 -> setBackgroundResource(R.drawable.bg_grey)
            10 -> setBackgroundResource(R.drawable.bg_dark)
            11 -> setBackgroundResource(R.drawable.bg_green)
            else -> visibility = View.INVISIBLE
        }
    }

}