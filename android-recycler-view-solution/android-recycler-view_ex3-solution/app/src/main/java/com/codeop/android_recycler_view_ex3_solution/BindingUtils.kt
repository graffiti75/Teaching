package com.codeop.android_recycler_view_ex3_solution

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("datetimeFormatted")
fun TextView.datetimeFormatted(item: Datetime) {
    text = "[${item.id}]: ${item.text}"
}