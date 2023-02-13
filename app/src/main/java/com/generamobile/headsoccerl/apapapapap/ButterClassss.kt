package com.generamobile.headsoccerl.apapapapap

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class ButterClassss:Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(hyjuuj)
        Hawk.init(this).build()
    }

    companion object {
        const val hyjuuj = "572cf946-775d-4250-b426-7ac0b1dd14d8"
        var nhmj = "appsChecker"
        var bvc: String? = "countryCode"
        var nhjkool = "geo"
        var gtfvbc: String? = "c11"
        var hyjuii = "link"
        var feddc: String? = "mainid"
        var gtyyhhj: String? = "d11"
    }
}