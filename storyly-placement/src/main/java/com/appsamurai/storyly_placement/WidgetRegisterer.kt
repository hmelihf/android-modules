package com.appsamurai.storyly_placement

import com.appsamurai.storyly_core.WidgetFactory
import com.appsamurai.storyly_core.WidgetType
import java.util.ServiceConfigurationError
import java.util.ServiceLoader

internal object WidgetRegisterer {
    val register: Map<WidgetType, WidgetFactory> by lazy { load() }

    fun get(type: WidgetType): WidgetFactory? { return register[type] }

    private fun load(): Map<WidgetType, WidgetFactory> {
        val iterator = ServiceLoader.load(WidgetFactory::class.java).iterator()
        val map = mutableMapOf<WidgetType, WidgetFactory>()
        while (true) {
            try {
                if (!iterator.hasNext()) break
                val widget = iterator.next()
                map[widget.getType()] = widget
            } catch (exc: ServiceConfigurationError) {
                exc.printStackTrace()
            }
        }
        return map.toMap()
    }
}