package com.appsamurai.storyly_placement

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.Keep
import com.appsamurai.storyly_core.WidgetFactory

@Keep
public class STRPlacement @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    init {
        orientation = VERTICAL
    }

    public fun initialize() {
        WidgetRegisterer.register.map { (key, factory) ->
            initWidget(factory)
        }
    }

    private fun initWidget(factory: WidgetFactory) {
        val view = factory.create(context)
        view.load()
        (view as? View)?.let {
            addView(it, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 400))
        }
    }
}