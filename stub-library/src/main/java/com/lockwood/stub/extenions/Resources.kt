package com.lockwood.stub.extenions

import android.content.Context
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

internal fun Context.color(@ColorRes res: Int): Int {
    return ContextCompat.getColor(this, res)
}