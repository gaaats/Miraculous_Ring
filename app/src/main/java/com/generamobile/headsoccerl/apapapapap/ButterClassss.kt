package com.generamobile.headsoccerl.apapapapap

import android.app.Application
import android.content.Context
import com.generamobile.headsoccerl.vevvev.gtgtgtgthy
import com.generamobile.headsoccerl.vevvev.bgbhnhhyjuujujujuj
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class ButterClassss:Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId("572cf946-775d-4250-b426-7ac0b1dd14d8")
        MyTracker.initTracker("83270864472325839874", this)

        val ggthyhyyhhy = MyTracker.getTrackerConfig()
        ggthyhyyhhy.isTrackingLaunchEnabled = true
        val defrrfrfvvfvf = MyTracker.getInstanceId(this)
        val juikikikik = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        juikikikik.edit().putString("instId", defrrfrfvvfvf).apply()

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@ButterClassss)
            modules(
                listOf(
                    gtgtgtgthy, bgbhnhhyjuujujujuj
                )
            )
        }
    }
}