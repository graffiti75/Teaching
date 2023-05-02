package com.codeop.android_recycler_view_ex1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class DatetimeViewModel(dataSource: DataSource) : ViewModel() {

    val database = dataSource

    private val _timestamps = MutableLiveData<List<Long>>()
    val timestamps: LiveData<List<Long>>
        get() = _timestamps

    val timeFormatted = Transformations.map(timestamps) { timestamp ->
        timestamp.formatTime()
    }

    val timestampVisible = Transformations.map(timestamps) {
        it?.isNotEmpty()
    }

    init {
        _timestamps.value = dataSource.getAllTimestamps()
    }

    fun onButtonClicked() {
        val millis = System.currentTimeMillis()
        database.addTimestamp(millis)
        _timestamps.value = database.getAllTimestamps()
    }
}
