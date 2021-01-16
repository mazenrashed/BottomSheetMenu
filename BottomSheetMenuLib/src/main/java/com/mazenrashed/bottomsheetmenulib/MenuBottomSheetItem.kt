package com.mazenrashed.bottomsheetmenulib

import android.graphics.drawable.Drawable
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class MenuBottomSheetItem(
    var title: String,
    var iconRes: Int? = null,
    var iconDrawable: @RawValue Drawable? = null,
    var id: Int? = null
) : Parcelable