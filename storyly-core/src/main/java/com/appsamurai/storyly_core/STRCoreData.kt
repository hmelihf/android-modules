package com.appsamurai.storyly_core

import androidx.annotation.Keep

@Keep
public data class STRCoreData(
    val test: String
)

@Keep
public interface STRCoreListener {
    public fun event()
}