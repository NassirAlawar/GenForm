package com.nalawar.genform

import android.support.v7.util.DiffUtil

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