package com.example.home_4_android_4.ui.fragments

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.home_4_android_4.R
import com.example.home_4_android_4.base.BaseFragment
import com.example.home_4_android_4.databinding.FragmentYoutubeBinding
import com.example.home_4_android_4.ui.adapter.PopularVideoAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PopularVideoFragment :
    BaseFragment<FragmentYoutubeBinding, PopularVideoViewModel>(R.layout.fragment_youtube) {

    override val viewModel: PopularVideoViewModel by viewModels()
    override val binding by viewBinding(FragmentYoutubeBinding::bind)
    private var adapterPopularVideoAdapter = PopularVideoAdapter()

    override fun initialize() {
        binding.rvPopularVideo.adapter = adapterPopularVideoAdapter
    }

    override fun setupSubscribes() {
        subscribeToPopularVideo()
    }

    private fun subscribeToPopularVideo() {
        viewModel.fetchPopularVideo("jp", "mostPopular", "snippet").observe(viewLifecycleOwner) {
            lifecycleScope.launch {
                adapterPopularVideoAdapter.submitData(it)
            }
        }
    }
}
