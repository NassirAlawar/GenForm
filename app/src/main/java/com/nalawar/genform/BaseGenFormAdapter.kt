package com.nalawar.genform

import android.content.Context
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater

/**
 * Created by Nassir
 */
abstract class BaseGenFormAdapter<ViewModel: ArrayList<GenFormItem>>(
    protected val context: Context,
    val items: ViewModel
): RecyclerView.Adapter<GenFormViewHolder<ViewDataBinding>>() {
    private var _diffUtilCallback: BaseGenFormDiffUtil<ViewModel>? = null
    var diffUtilCallback: BaseGenFormDiffUtil<ViewModel>
    get() {
        if(_diffUtilCallback == null){
            _diffUtilCallback = GenFormDefaultDiffUtil()
        }
        return _diffUtilCallback!!
    }
    set(value) {_diffUtilCallback = value}

    protected val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int {
        return items[position].layoutResourceId()
    }

    abstract fun update(items: ViewModel)
}