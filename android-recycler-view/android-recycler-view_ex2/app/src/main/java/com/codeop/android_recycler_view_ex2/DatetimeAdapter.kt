package com.codeop.android_recycler_view_ex2

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DatetimeAdapter: RecyclerView.Adapter<DatetimeViewHolder>() {

    var data =  listOf<String>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatetimeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_view, parent, false) as TextView
        return DatetimeViewHolder(view)
    }

    override fun onBindViewHolder(holder: DatetimeViewHolder, position: Int) {
        val item = data[position]
        holder.textItem.text = item
    }

    override fun getItemCount() = data.size
}