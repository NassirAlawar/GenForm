package com.nalawar.genform

import android.content.Context
import androidx.databinding.BaseObservable
import androidx.databinding.ViewDataBinding

/**
 * Created by Nassir
 */
abstract class GenFormItem: BaseObservable() {
    abstract fun layoutResourceId(): Int
    abstract fun id(): String
    abstract fun bindViewHolder(
        holder: GenFormViewHolder<ViewDataBinding>,
        context: Context
    )
    abstract fun bindViewHolder(
        holder: GenFormViewHolder<ViewDataBinding>,
        payloads: MutableList<Any>
    )
}