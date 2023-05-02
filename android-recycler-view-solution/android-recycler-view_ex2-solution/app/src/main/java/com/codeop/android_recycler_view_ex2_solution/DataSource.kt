package com.codeop.android_recycler_view_ex2_solution

class DataSource {

    private var timestamps = mutableListOf<Long>()

    fun addTimestamp(millis: Long) {
        timestamps.add(millis)
    }

    fun getAllTimestamps(): List<Long> {
        return timestamps
    }
}