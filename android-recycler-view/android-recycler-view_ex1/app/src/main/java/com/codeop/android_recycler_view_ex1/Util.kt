package com.codeop.android_recycler_view_ex1

import java.text.SimpleDateFormat
import java.util.*

fun List<Long>.formatTime(): String {
    var output = ""
    for (current in this) {
        val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
        val date = formatter.format(current)
        output += "$date\n"
    }
    return output
}