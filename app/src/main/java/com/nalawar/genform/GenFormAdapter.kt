package com.nalawar.genform

import android.content.Context
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import android.view.ViewGroup

/**
 * Created by Nassir
 */
open class GenFormAdapter<ViewModel: ArrayList<GenFormItem>>(
    context: Context,
    items: ViewModel
): BaseGenFormAdapter<ViewModel>(context, items){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenFormViewHolder<ViewDataBinding> {
        return GenFormViewHolder(DataBindingUtil.inflate(inflater, viewType, parent, false))
    }

    override fun onBindViewHolder(holder: GenFormViewHolder<ViewDataBinding>, position: Int) {
        holder.setIsRecyclable(false)
        items[position].bindViewHolder(holder, context)
    }

    override fun onBindViewHolder(
        holder: GenFormViewHolder<ViewDataBinding>,
        position: Int,
        payloads: MutableList<Any>
    ) {
        holder.setIsRecyclable(false)
        if(payloads.isEmpty()){
            super.onBindViewHolder(holder, position, payloads)
        } else {
            items[position].bindViewHolder(holder, payloads)
        }
    }

    override fun update(items: ViewModel){
        this.diffUtilCallback.setData(this.items, items)
        val diffResult = DiffUtil.calculateDiff(this.diffUtilCallback)
        this.items.clear()
        this.items.addAll(items)
        diffResult.dispatchUpdatesTo(this)
    }
}