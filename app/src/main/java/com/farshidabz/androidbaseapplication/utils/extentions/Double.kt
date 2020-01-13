package com.demo.utils.extentions

fun Double.format(digits: Int): String = java.lang.String.format("%.${digits}f", this)