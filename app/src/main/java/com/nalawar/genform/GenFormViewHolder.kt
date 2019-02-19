package com.nalawar.genform

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView

/**
 * Created by Nassir
 */
open class GenFormViewHolder<out M: ViewDataBinding>(
    val binding: M
): RecyclerView.ViewHolder(binding.root)