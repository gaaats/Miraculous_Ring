package com.generamobile.headsoccerl.otththther

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.generamobile.headsoccerl.R
import com.generamobile.headsoccerl.apapapapap.ButterClassss.Companion.gtfvbc
import com.generamobile.headsoccerl.apapapapap.ButterClassss.Companion.gtyyhhj
import com.generamobile.headsoccerl.apapapapap.ButterClassss.Companion.feddc
import com.generamobile.headsoccerl.apapapapap.ButterClassss.Companion.hyjuii
import com.generamobile.headsoccerl.databinding.ActivityVevVevVeeeebBinding
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class VevVevVeeeebActivity : AppCompatActivity() {



    private fun gtnjgtjngt(): String {

        val njgtiugthugt = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val hyjuuu = "com.generamobile.headsoccerl"

        val ihfhrfr:String? = Hawk.get(gtfvbc, "null")
        val vf5gtgthy56hy: String? = Hawk.get(feddc, "null")
        val h2hhy5h5yhy5: String? = Hawk.get(gtyyhhj, "null")

        val t2hyhy5yh1hy = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)



        val gtgtgtjigtjiogt = "deviceID="
        val gnbngtnjgtk = "sub_id_1="
        val gt2hhyyh5yh5hy = "ad_id="
        val hy2h5uj5u5u = "sub_id_4="
        val hhyhyjjuujfss = "sub_id_5="
        val vvvfccdeded = "sub_id_6="


        val gthyju62uj = "naming"
        val hyhyhujiikolololkijuh = "deeporg"


        val gthyy = Build.VERSION.RELEASE

        val grgtiojgtjiotgijgt = Hawk.get(hyjuii, "null")

        var aftgtgtt = ""
        if (ihfhrfr != "null"){
            aftgtgtt = "$grgtiojgtjiotgijgt$gnbngtnjgtk$ihfhrfr&$gtgtgtjigtjiogt$t2hyhy5yh1hy&$gt2hhyyh5yh5hy$vf5gtgthy56hy&$hy2h5uj5u5u$hyjuuu&$hhyhyjjuujfss$gthyy&$vvvfccdeded$gthyju62uj"
            kpiiplkl(t2hyhy5yh1hy.toString())
        } else {
            aftgtgtt = "$grgtiojgtjiotgijgt$gnbngtnjgtk$h2hhy5h5yhy5&$gtgtgtjigtjiogt$t2hyhy5yh1hy&$gt2hhyyh5yh5hy$vf5gtgthy56hy&$hy2h5uj5u5u$hyjuuu&$hhyhyjjuujfss$gthyy&$vvvfccdeded$hyhyhujiikolololkijuh"
            kpiiplkl(t2hyhy5yh1hy.toString())
        }
        Log.d("lolo", "link is $aftgtgtt")
        Toast.makeText(this, "${aftgtgtt}", Toast.LENGTH_LONG).show()

        return njgtiugthugt.getString("SAVED_URL", aftgtgtt).toString()
    }

    private fun gojijigtjigt(uri: String): Boolean {

        val gtngtntgjkgt = packageManager
        try {

            gtngtntgjkgt.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    private fun jujukgrfrf() {
        val hyoyo = gthyhujuu.settings
        hyoyo.javaScriptEnabled = true

        hyoyo.useWideViewPort = true

        hyoyo.loadWithOverviewMode = true
        hyoyo.allowFileAccess = true
        hyoyo.domStorageEnabled = true
        hyoyo.userAgentString = hyoyo.userAgentString.replace("; wv", "")

        hyoyo.javaScriptCanOpenWindowsAutomatically = true
        hyoyo.setSupportMultipleWindows(false)

        hyoyo.displayZoomControls = false
        hyoyo.builtInZoomControls = true
        hyoyo.setSupportZoom(true)

        hyoyo.pluginState = WebSettings.PluginState.ON
        hyoyo.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        hyoyo.cacheMode = WebSettings.LOAD_DEFAULT

        hyoyo.allowContentAccess = true
    }

    private val gtjoirfijfjoirfjio = 1

    var gbgkjgnuihgrfhgffr: ValueCallback<Array<Uri>>? = null
    lateinit var gthyhujuu: WebView
    lateinit var frrgtttg: ActivityVevVevVeeeebBinding
    var hyjujukiikoolololol: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        frrgtttg = ActivityVevVevVeeeebBinding.inflate(layoutInflater)
        setContentView(frrgtttg.root)

        gthyhujuu = frrgtttg.viviviviiveeee
        Snackbar.make(
            frrgtttg.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val tjoijhjojgtjjitg = CookieManager.getInstance()
        tjoijhjojgtjjitg.setAcceptCookie(true)
        tjoijhjojgtjjitg.setAcceptThirdPartyCookies(gthyhujuu, true)
        jujukgrfrf()
        val gtnjktggtngt: Activity = this
        gthyhujuu.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (gojijigtjigt(url)) {

                        val frrfuhrfhfrgyrf = Intent(Intent.ACTION_VIEW)
                        frrfuhrfhfrgyrf.data = Uri.parse(url)
                        startActivity(frrfuhrfhfrgyrf)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                gthyyhy(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(gtnjktggtngt, description, Toast.LENGTH_SHORT).show()
            }


        }
        gthyhujuu.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                gbgkjgnuihgrfhgffr?.onReceiveValue(null)
                gbgkjgnuihgrfhgffr = filePathCallback
                var bghhyhyhyhy626: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (bghhyhyhyhy626!!.resolveActivity(packageManager) != null) {

                    var drfrgtt: File? = null
                    try {
                        drfrgtt = jukiloo()
                        bghhyhyhyhy626.putExtra("PhotoPath", hyjujukiikoolololol)
                    } catch (ex: IOException) {
                    }

                    if (drfrgtt != null) {
                        hyjujukiikoolololol = "file:" + drfrgtt.absolutePath
                        bghhyhyhyhy626.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(drfrgtt)
                        )
                    } else {
                        bghhyhyhyhy626 = null
                    }
                }
                val ghyujujujuj = Intent(Intent.ACTION_GET_CONTENT)
                ghyujujujuj.addCategory(Intent.CATEGORY_OPENABLE)
                ghyujujujuj.type = "image/*"
                val tgtgt: Array<Intent?> =
                    bghhyhyhyhy626?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val gtgthyhhy = Intent(Intent.ACTION_CHOOSER)
                gtgthyhhy.putExtra(Intent.EXTRA_INTENT, ghyujujujuj)
                gtgthyhhy.putExtra(Intent.EXTRA_TITLE, getString(R.string.gtgtjiotgjiojigt))
                gtgthyhhy.putExtra(Intent.EXTRA_INITIAL_INTENTS, tgtgt)
                startActivityForResult(
                    gtgthyhhy, gtjoirfijfjoirfjio
                )
                return true
            }

            @Throws(IOException::class)
            private fun jukiloo(): File {
                var hynujuj62uj = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!hynujuj62uj.exists()) {
                    hynujuj62uj.mkdirs()
                }

                hynujuj62uj =
                    File(hynujuj62uj.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return hynujuj62uj
            }

        }

        gthyhujuu.loadUrl(gtnjgtjngt())
    }


    private fun kpiiplkl(th2hy5hyhy5: String) {
        OneSignal.setExternalUserId(
            th2hy5hyhy5,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val gtthynnmmnn = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $gtthynnmmnn"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val hbgbgbghyhy3yh26 =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $hbgbgbghyhy3yh26"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val mjmjjhhgf = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $mjmjjhhgf"
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


    private var gtgtjitjigtjigt = false
    override fun onBackPressed() {


        if (gthyhujuu.canGoBack()) {
            if (gtgtjitjigtjigt) {
                gthyhujuu.stopLoading()
                gthyhujuu.loadUrl(urlfififif)
            }
            this.gtgtjitjigtjigt = true
            gthyhujuu.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                gtgtjitjigtjigt = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }






    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != gtjoirfijfjoirfjio || gbgkjgnuihgrfhgffr == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var rerererer: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                rerererer = arrayOf(Uri.parse(hyjujukiikoolololol))
            } else {
                val gtgtkogtjoiijtjitg = data.dataString
                if (gtgtkogtjoiijtjitg != null) {
                    rerererer = arrayOf(Uri.parse(gtgtkogtjoiijtjitg))
                }
            }
        }
        gbgkjgnuihgrfhgffr?.onReceiveValue(rerererer)
        gbgkjgnuihgrfhgffr = null
    }




    var urlfififif = ""
    fun gthyyhy(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val frbfrbrfbbrfbrf = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val defr = frbfrbrfbbrfbrf.edit()
                defr.putString("SAVED_URL", lurlurlurlurlur)
                defr.apply()
            }
        }
    }

}