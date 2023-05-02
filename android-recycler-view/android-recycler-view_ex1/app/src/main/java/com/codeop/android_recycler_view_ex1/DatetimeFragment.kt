package com.codeop.android_recycler_view_ex1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.codeop.android_recycler_view_ex1.databinding.FragmentDatetimeBinding

class DatetimeFragment : Fragment(R.layout.fragment_datetime) {

    private lateinit var viewModel: DatetimeViewModel
    private lateinit var viewModelFactory: DatetimeViewModelFactory
    private lateinit var binding: FragmentDatetimeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentDatetimeBinding.bind(view)

        viewModelFactory = DatetimeViewModelFactory(DataSource())
        viewModel = ViewModelProvider(this, viewModelFactory)[DatetimeViewModel::class.java]
        binding.myViewModel = viewModel

        viewModel.timeFormatted.observe(viewLifecycleOwner, Observer {
            it?.let {
                binding.textView.text = it
            }
        })
        binding.lifecycleOwner = this
    }
}
