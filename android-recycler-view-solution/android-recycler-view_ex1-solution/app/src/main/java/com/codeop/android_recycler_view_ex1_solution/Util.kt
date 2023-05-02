package com.codeop.android_recycler_view_ex1_solution

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat
import java.util.*

fun List<Long>.formatTime(): List<String> {
    val formattedList = mutableListOf<String>()
    for (current in this) {
        val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
        val date = formatter.format(current)
        formattedList.add(date)
    }
    return formattedList
}

class DatetimeViewHolder(val textView: TextView): RecyclerView.ViewHolder(textView)