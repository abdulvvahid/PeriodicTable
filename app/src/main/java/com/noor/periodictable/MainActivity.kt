package com.noor.periodictable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.noor.periodictable.databinding.ActivityMainBinding
import com.noor.periodictable.model.Element

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val elementList: ArrayList<Element>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val element1 = Element(1,1,"H", "Hydrogen", 1.008, "image1")
        val element2 = Element(18,2,"He", "Helium", 4.0026, "image2")
        val element3 = Element(19,3,"Li", "Lithium", 6.94, "image3")
        val element4 = Element(20,4,"Be", "Beryllium", 9.0122, "image4")
        val element5 = Element(31,5,"B", "Helium", 10.81, "image5")

        elementList?.add(element1)
        elementList?.add(element2)
        elementList?.add(element3)
        elementList?.add(element4)
        elementList?.add(element5)



    }
}