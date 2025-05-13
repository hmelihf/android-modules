package com.appsamurai.storyly_core

import androidx.annotation.Keep

@Keep
public class STRClassRegisterer {
    public fun create(className: String): WidgetFactory? {
        try {
            val classRef = Class.forName(className)
            return classRef.getDeclaredConstructor().newInstance() as? WidgetFactory
        } catch (exc: Exception) {
            exc.printStackTrace()
            return null
        }
    }
}