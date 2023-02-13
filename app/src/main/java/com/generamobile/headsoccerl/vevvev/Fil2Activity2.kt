package com.generamobile.headsoccerl.vevvev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.generamobile.headsoccerl.gaaamamme.GaaamamamamamamaActivity
import com.generamobile.headsoccerl.otththther.VevVevVeeeebActivity
import com.generamobile.headsoccerl.apapapapap.ButterClassss
import com.generamobile.headsoccerl.apapapapap.ButterClassss.Companion.gtfvbc
import com.generamobile.headsoccerl.apapapapap.ButterClassss.Companion.gtyyhhj
import com.generamobile.headsoccerl.apapapapap.ButterClassss.Companion.nhmj
import com.generamobile.headsoccerl.apapapapap.ButterClassss.Companion.bvc
import com.generamobile.headsoccerl.apapapapap.ButterClassss.Companion.nhjkool
import com.generamobile.headsoccerl.databinding.ActivityFil22Binding
import com.orhanobut.hawk.Hawk
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class Fil2Activity2 : AppCompatActivity() {

    private fun gtgthy() {

        val ftgtt: String = Hawk.get(nhjkool)
        val gtghylp: String = Hawk.get(bvc, "null")

        val gthy62hy5hy: String? = Hawk.get(gtyyhhj, "null")
        val dssededed: String? = Hawk.get(nhmj, "null")
        var bghy2h6y2y: String? = Hawk.get(gtfvbc)

        if (dssededed == "1") {
            val executorServicegtgyh = Executors.newSingleThreadScheduledExecutor()
            executorServicegtgyh.scheduleAtFixedRate({
                if (bghy2h6y2y != null) {

                    if (bghy2h6y2y!!.contains("tdb2") || ftgtt.contains(gtghylp) || gthy62hy5hy!!.contains(
                            "tdb2"
                        )
                    ) {
                        executorServicegtgyh.shutdown()

                        gtkioijogtjihjyi()
                    } else {
                        executorServicegtgyh.shutdown()

                        gtgtjoijtjiogt()
                    }
                } else {
                    bghy2h6y2y = Hawk.get(gtfvbc)
                }
            }, 0, 1, TimeUnit.SECONDS)
        } else if (ftgtt.contains(gtghylp)) {

            gtkioijogtjihjyi()
        } else {
            gtgtjoijtjiogt()
        }

    }

    private fun gtgtjoijtjiogt() {
        val hyujujujuj = Intent(this@Fil2Activity2, GaaamamamamamamaActivity::class.java)
        Hawk.put(nhjkool, null)
        Hawk.put(bvc, null)
        Hawk.put(ButterClassss.nhmj, null)
        startActivity(hyujujujuj)
        finish()
    }

    lateinit var gthyii: ActivityFil22Binding

    private val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val hyhyhyj2uuj2uj = data?.get("campaign").toString()
            Hawk.put(gtfvbc, hyhyhyj2uuj2uj)
        }

        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        gthyii = ActivityFil22Binding.inflate(layoutInflater)
        setContentView(gthyii.root)

        val gy2hhy5hy5yhhy: String? = Hawk.get(nhmj, "null")

        if (gy2hhy5hy5yhhy == "1") {
            AppsFlyerLib.getInstance()
                .init("7wXTnMSFxYbNayMNUdeGzV", conversionDataListener, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        gtgthy()

    }


    private fun gtkioijogtjihjyi() {
        val gtngtnhugthugtf = Intent(this@Fil2Activity2, VevVevVeeeebActivity::class.java)
        Hawk.put(nhjkool, null)
        Hawk.put(bvc, null)
        Hawk.put(ButterClassss.nhmj, null)
        startActivity(gtngtnhugthugtf)
        finish()
    }




}