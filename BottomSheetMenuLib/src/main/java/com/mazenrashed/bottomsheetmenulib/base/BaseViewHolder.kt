package com.mazenrashed.bottomsheetmenulib.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<M>(val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root){
    abstract fun bind(position: Int, item: M?)

    @Suppress("UNCHECKED_CAST")
    inline fun <T : ViewDataBinding> bind(binding: T.() -> Unit) {
        binding(viewDataBinding as T)
        viewDataBinding.executePendingBindings()
    }
}