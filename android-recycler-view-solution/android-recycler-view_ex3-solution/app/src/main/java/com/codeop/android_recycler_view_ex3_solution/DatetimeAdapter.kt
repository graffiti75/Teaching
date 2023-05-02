package com.codeop.android_recycler_view_ex3_solution

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.codeop.android_recycler_view_ex3_solution.databinding.ItemViewBinding

class DatetimeAdapter : ListAdapter<Datetime, DatetimeViewHolder>(DatetimeDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatetimeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemViewBinding.inflate(layoutInflater, parent, false)
        return DatetimeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DatetimeViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

}

class DatetimeViewHolder(val binding: ItemViewBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Datetime) {
        binding.datetime = item
        binding.executePendingBindings()
    }
}

class DatetimeDiffCallback : DiffUtil.ItemCallback<Datetime>() {
    override fun areItemsTheSame(oldItem: Datetime, newItem: Datetime): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Datetime, newItem: Datetime): Boolean {
        return oldItem == newItem
    }
}