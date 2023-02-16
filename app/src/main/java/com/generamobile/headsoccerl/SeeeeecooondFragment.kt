package com.generamobile.headsoccerl

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.generamobile.headsoccerl.amaaaain.Iffjirfi
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SeeeeecooondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_seeeeecooond, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyju2j2u6uj6uj = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        j26ju626uj.hynhgijogtjrfrf.observe(viewLifecycleOwner) {
            if (it!=null) {
                u2ju2uj226uj = it.gtgthyhyhyhyhy
                juj2u2uju23j.edit().putString("country", u2ju2uj226uj).apply()
                findNavController().navigate(R.id.action_seeeeecooondFragment_to_thiiiiiirdFragment)
            }
        }
    }

    private lateinit var hyju2j2u6uj6uj: Context
    val juj2u2uju23j: SharedPreferences by inject(named("SharedPreferences"))
    val j26ju626uj by activityViewModel<Iffjirfi>(named("MainModel"))

    lateinit var u2ju2uj226uj: String
}
