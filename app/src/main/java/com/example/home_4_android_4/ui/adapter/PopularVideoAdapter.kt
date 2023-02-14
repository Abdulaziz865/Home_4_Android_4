package com.example.home_4_android_4.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.home_4_android_4.data.models.PopularVideo
import com.example.home_4_android_4.databinding.ItemPopularVideoBinding

class PopularVideoAdapter :
    PagingDataAdapter<PopularVideo, PopularVideoAdapter.VideoPopularViewHolder>(diffUtil) {

    inner class VideoPopularViewHolder(private val binding: ItemPopularVideoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: PopularVideo) = with(binding) {
            Glide.with(binding.imagePopularVideo.context)
                .load(item.snippet.thumbnails.standard.url)
                .into(binding.imagePopularVideo)
            Glide.with(binding.imagePopularAvatar.context)
                .load(item.snippet.thumbnails.standard.url)
                .into(binding.imagePopularAvatar)
            binding.txtNamePopularVideo.text = item.snippet.channelTitle
            binding.txtWin.text = item.snippet.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoPopularViewHolder {
        return VideoPopularViewHolder(
            ItemPopularVideoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: VideoPopularViewHolder, position: Int) {
        getItem(position)?.let {
            holder.onBind(it)
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<PopularVideo>() {
            override fun areItemsTheSame(oldItem: PopularVideo, newItem: PopularVideo): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: PopularVideo, newItem: PopularVideo): Boolean {
                return oldItem == newItem
            }
        }
    }
}