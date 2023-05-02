package com.codeop.android_recycler_view_ex2_solution

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class DatetimeAdapter : ListAdapter<Datetime, DatetimeViewHolder>(DatetimeDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatetimeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_view, parent, false) as TextView
        return DatetimeViewHolder(view)
    }

    override fun onBindViewHolder(holder: DatetimeViewHolder, position: Int) {
        val item = getItem(position)
        holder.textItem.text = item.text
    }

}

class DatetimeViewHolder(val textItem: TextView): RecyclerView.ViewHolder(textItem)

class DatetimeDiffCallback : DiffUtil.ItemCallback<Datetime>() {
    override fun areItemsTheSame(oldItem: Datetime, newItem: Datetime): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Datetime, newItem: Datetime): Boolean {
        return oldItem == newItem
    }
}