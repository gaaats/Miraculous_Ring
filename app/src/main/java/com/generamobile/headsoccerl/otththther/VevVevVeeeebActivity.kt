package com.generamobile.headsoccerl.otththther

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mvffg.btwolib.BTwoLib
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named

class VevVevVeeeebActivity : AppCompatActivity() {
    lateinit var gthyhyyhhyhyhy: BTwoLib
    val sedededccdcd: SharedPreferences by inject(named("SharedPreferences"))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gthyhyyhhyhyhy = BTwoLib(this@VevVevVeeeebActivity)
        setContentView(gthyhyyhhyhyhy)
        gthyhyyhhyhyhy.profiter(vgbgbgbgbg())
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            gthyhyyhhyhyhy.onActivityResult(requestCode, resultCode, data)
        }
    }

    override fun onBackPressed() {
        if (!gthyhyyhhyhyhy.onBackPressed()) {
            return
        }
        super.onBackPressed()
    }

    private fun vgbgbgbgbg(): String {
        val rfgtgthyhyhy = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val hyhyhyyhhy = sedededccdcd.getString("link", null)
        rfgtgthyhyhy.edit().putString("SAVED_URL", hyhyhyyhhy).apply()
        return rfgtgthyhyhy.getString("SAVED_URL", hyhyhyyhhy).toString()
    }
}