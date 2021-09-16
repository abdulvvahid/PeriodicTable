package com.noor.periodictable.model

import java.io.Serializable

data class Element(
    val position: Int,
    val id: String? = null,
    val abbreviation: String? = null,
    val name: String? = null,
    val weight: Double? = null,
    val image: String? = null,
) : Serializable