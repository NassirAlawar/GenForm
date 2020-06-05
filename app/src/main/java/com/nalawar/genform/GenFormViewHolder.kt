package com.nalawar.genform

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Nassir
 */
open class GenFormViewHolder<out M: ViewDataBinding>(
    val binding: M
): RecyclerView.ViewHolder(binding.root)