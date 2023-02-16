package com.generamobile.headsoccerl

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.generamobile.headsoccerl.amaaaain.Iffjirfi
import com.mvffg.btwolib.decrypt
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec


class ThiiiiiirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_thiiiiiird, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mkiki5ik5 = context
    }

    val y2h2yujju5ju by activityViewModel<Iffjirfi>(named("MainModel"))
    lateinit var bgyh2y62: String
    lateinit var hyjuju9u: String
    lateinit var koollo5ol9: String
    private lateinit var mkiki5ik5: Context
    val gthyhyyjii = "AES/CBC/PKCS5Padding"
    val hjuk2iki = SecretKeySpec("%C*F-JaNdRgUkXp2s5v8x/A?D(G+KbPe".toByteArray(), "AES")
    val ju2ju6uj26uj = IvParameterSpec(ByteArray(16))

    val hy2ujj5uj5: SharedPreferences by inject(named("SharedPreferences"))

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tgjojtigjoitjgjiotgt()

        y2h2yujju5ju.hjuujgtfrrf.observe(viewLifecycleOwner) {
            if (it != null) {
                bgyh2y62 = it.countryrator
                koollo5ol9 = it.mainnumber
                hyjuju9u = it.vebpath
                val h2j26uj6uj = decrypt(gthyhyyjii, bgyh2y62, hjuk2iki, ju2ju6uj26uj)
                val hyhyhy26yh2 = decrypt(gthyhyyjii, hyjuju9u, hjuk2iki, ju2ju6uj26uj)

                hy2ujj5uj5.edit().putString("countryDev", h2j26uj6uj).apply()
                hy2ujj5uj5.edit().putString("apps", koollo5ol9).apply()
                hy2ujj5uj5.edit().putString("wv", hyhyhy26yh2).apply()

                findNavController().navigate(R.id.action_thiiiiiirdFragment_to_fooooourttthFragment)
            }
        }
    }

    private fun tgjojtigjoitjgjiotgt() {
        y2h2yujju5ju.sssededcdcddc.observe(viewLifecycleOwner) {
            if (it != null) {
                val jujk2i262i = it.toString()
                hy2ujj5uj5.edit().putString("mainId", jujk2i262i).apply()
            }
        }
    }
}
