package com.appsamurai.storyly_banner

import android.content.Context
import android.graphics.Color
import androidx.annotation.Keep
import com.appsamurai.storyly_core.STRCoreData
import com.appsamurai.storyly_core.STRCoreListener
import com.appsamurai.storyly_core.STRWidget
import com.appsamurai.storyly_core.WidgetFactory


@Keep
public class STRBannerViewFactory: WidgetFactory {
    override fun create(context: Context): STRWidget {
        return STRBannerView(context)
    }
}


@Keep
public class STRBannerView(
    context: Context
) : STRWidget(context) {
    val dataCore = STRCoreData("test")
    val event = object: STRCoreListener {
        override fun event() {}
    }

    override fun load() {
        super.load()
        setBackgroundColor(Color.RED)
    }
}