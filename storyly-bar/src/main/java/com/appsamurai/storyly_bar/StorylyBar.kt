package com.appsamurai.storyly_bar

import android.content.Context
import android.graphics.Color
import androidx.annotation.Keep
import com.appsamurai.storyly_core.STRCoreData
import com.appsamurai.storyly_core.STRCoreListener
import com.appsamurai.storyly_core.STRWidget
import com.appsamurai.storyly_core.WidgetFactory

@Keep
public class STRBarViewFactory: WidgetFactory {
    override fun create(context: Context): STRWidget {
        return STRBarView(context)
    }
}

@Keep
public class STRBarView(
    context: Context
): STRWidget(context) {
    val dataCore = STRCoreData("test")
    val event = object: STRCoreListener {
        override fun event() {}
    }

    override fun load() {
        super.load()
        setBackgroundColor(Color.BLUE)
    }
}