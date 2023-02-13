package com.generamobile.headsoccerl.gtgthhy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.generamobile.headsoccerl.vevvev.Fil2Activity2
import com.generamobile.headsoccerl.gaaamamme.GaaamamamamamamaActivity
import com.generamobile.headsoccerl.R
import com.generamobile.headsoccerl.apapapapap.ButterClassss
import com.generamobile.headsoccerl.apapapapap.ButterClassss.Companion.feddc
import com.generamobile.headsoccerl.apapapapap.ButterClassss.Companion.nhmj
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Fil1Activity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fil12)
        gttgjoitgjigthjy()
    }

    private fun gtjgtigtjgt(): String? {
        val bgngjngjgt: String? = Hawk.get(nhmj)
        return bgngjngjgt
    }

    private fun gttgjoitgjigthjy() {

        val gtgtnjgtnj = gtjgtigtjgt()

        if (gtgtnjgtnj == "0") {
            vffbhbfrgrf()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                vfvfbfgtyt()
            }

            gtbcdeffdec()
        }
    }

    private fun vffbhbfrgrf() {
        val gtpkohyk = Intent(this@Fil1Activity2, GaaamamamamamamaActivity::class.java)
        Hawk.put(ButterClassss.nhjkool, null)
        Hawk.put(ButterClassss.bvc, null)
        Hawk.put(ButterClassss.nhmj, null)
        startActivity(gtpkohyk)
        finish()
    }

    private fun gtbcdeffdec() {
        val hyhyijoyhjojyhi = Intent(this@Fil1Activity2, Fil2Activity2::class.java)
        startActivity(hyhyijoyhjojyhi)
        finish()
    }

    private fun vfvfbfgtyt(){
        val hyyhoyopy = AdvertisingIdClient(applicationContext)
        hyyhoyopy.start()
        val bggbnlgblnkg = hyyhoyopy.info.id
        Hawk.put(feddc, bggbnlgblnkg)
    }

}