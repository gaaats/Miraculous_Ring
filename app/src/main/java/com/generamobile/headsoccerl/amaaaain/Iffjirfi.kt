package com.generamobile.headsoccerl.amaaaain

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.generamobile.headsoccerl.gtgthhy.Nfjnfrnjfrjnrf
import com.generamobile.headsoccerl.gtgthhy.CountryRepo
import com.generamobile.headsoccerl.gtgthhy.DevRepo
import com.generamobile.headsoccerl.gtgthhy.OFjrijgjgtigtgtigt
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Iffjirfi(
    private val frfgtghyhhnnhnh: CountryRepo,
    private val vfbgbghyhyhy: DevRepo,
    private val nhnhnmjmjmj: SharedPreferences,
    val spkedokjiofrjigtji: Application
) : ViewModel() {

    private val gtjitjgtjtg = MutableLiveData<Nfjnfrnjfrjnrf>()
    val hynhgijogtjrfrf: LiveData<Nfjnfrnjfrjnrf>
        get() = gtjitjgtjtg

    private val fhbddgde = MutableLiveData<OFjrijgjgtigtgtigt>()
    val hjuujgtfrrf: LiveData<OFjrijgjgtigtgtigt>
        get() = fhbddgde


    private val gjgtjgjigt = MutableLiveData<String>()
    val hynhyohyjihyji: LiveData<String>
        get() = gjgtjgjigt

    private val gtntgnkgt = MutableLiveData<String>()
    val frrfgthyhyhy: LiveData<String>
        get() = gtntgnkgt


    private val frjgtjigtjio = MutableLiveData<String?>()
    val sssededcdcddc: LiveData<String?>
        get() = frjgtjigtjio


    init {
        viewModelScope.launch(Dispatchers.IO) {
            fedededed()
        }
        viewModelScope.launch(Dispatchers.Main) {
            bggtgtgtgt()
        }
    }

    suspend fun bggtgtgtgt() {
        gtjitjgtjtg.postValue(frfgtghyhhnnhnh.gthyyhyjuujuj().body())
        deededdeed()
    }

    suspend fun deededdeed() {
        try {
            fhbddgde.postValue(vfbgbghyhyhy.gthyhyjuujujuj().body())
        } catch (e: java.lang.Exception) {
            Log.d("ESCESC", e.toString())
        }
    }

    fun htgjfrjiotgji(cont: Context) {
        AppsFlyerLib.getInstance()
            .init("7wXTnMSFxYbNayMNUdeGzV", ghnhynhyjihyj, spkedokjiofrjigtji)
        AppsFlyerLib.getInstance().start(cont)
    }

    fun juikkoolol(cont: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            cont
        ) { data: AppLinkData? ->
            data?.let {
                val deepData = data.targetUri?.host.toString()
                Log.d("lolo", "deep is ${deepData}")
                nhnhnmjmjmj.edit().putString("deepSt", deepData).apply()
            }
        }
    }

    private val ghnhynhyjihyj = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            gjgtjgjigt.postValue(dataGotten)
        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun fedededed() {
        val advertisingIdClient = AdvertisingIdClient(spkedokjiofrjigtji)
        advertisingIdClient.start()
        val idUserAdvertising = advertisingIdClient.info.id.toString()
        frjgtjigtjio.postValue(idUserAdvertising)
    }

}