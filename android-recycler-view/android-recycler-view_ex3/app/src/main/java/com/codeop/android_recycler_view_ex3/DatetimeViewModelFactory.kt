package com.codeop.android_recycler_view_ex3

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
