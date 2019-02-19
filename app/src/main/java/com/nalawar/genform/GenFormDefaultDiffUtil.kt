package com.nalawar.genform

/**
 * Created by Nassir
 */
open class GenFormDefaultDiffUtil<T: ArrayList<GenFormItem>>: BaseGenFormDiffUtil<T>() {
    override fun areItemsTheSame(oldIndex: Int, newIndex: Int): Boolean {
        if(oldList == null || newList == null) return false
        return oldList!![oldIndex] == newList!![newIndex]
    }

    override fun getOldListSize(): Int = oldList?.size ?: 0

    override fun getNewListSize(): Int = newList?.size ?: 0

    override fun areContentsTheSame(oldIndex: Int, newIndex: Int): Boolean {
        return areItemsTheSame(oldIndex, newIndex)
    }
}