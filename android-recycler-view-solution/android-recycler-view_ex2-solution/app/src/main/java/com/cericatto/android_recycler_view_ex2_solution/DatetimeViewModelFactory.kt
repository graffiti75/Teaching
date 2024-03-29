package com.cericatto.android_recycler_view_ex2_solution

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class DatetimeViewModelFactory(private val dataSource: DataSource) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DatetimeViewModel::class.java)) {
            return DatetimeViewModel(dataSource) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
