package com.appsamurai.storyly_core

import android.content.Context
import android.widget.FrameLayout

public interface WidgetFactory {
    fun create(context: Context): STRWidget
}

public abstract class STRWidget(context: Context): FrameLayout(context) {
    open fun load() {}
}