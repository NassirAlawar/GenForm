package com.nalawar.genform

import androidx.recyclerview.widget.DiffUtil

/**
 * Created by Nassir
 */
abstract class BaseGenFormDiffUtil<T: ArrayList<GenFormItem>>: DiffUtil.Callback() {
    protected var oldList: T? = null
    protected var newList: T? = null

    open fun setData(oldList: T, newList: T){
        this.oldList = oldList
        this.newList = newList
    }
}