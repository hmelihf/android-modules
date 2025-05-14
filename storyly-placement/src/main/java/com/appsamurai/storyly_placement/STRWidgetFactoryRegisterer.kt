package com.appsamurai.storyly_placement

import com.appsamurai.storyly_core.WidgetFactory
import java.util.ServiceLoader



object STRWidgetFactoryRegisterer {
    val widgetList: ServiceLoader<WidgetFactory>? by lazy { load() }

    private fun load(): ServiceLoader<WidgetFactory>? {
        return ServiceLoader.load(WidgetFactory::class.java)
    }
}