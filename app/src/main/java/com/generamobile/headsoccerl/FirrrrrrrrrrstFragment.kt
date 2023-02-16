package com.generamobile.headsoccerl

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generamobile.headsoccerl.amaaaain.Iffjirfi
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class FirrrrrrrrrrstFragment : Fragment() {
    private lateinit var hujujuj2uj2: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hujujuj2uj2=context
    }

    val j2uj2u2j by activityViewModel<Iffjirfi>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_firrrrrrrrrrst, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        j2uj2u2j.juikkoolol(hujujuj2uj2)

        findNavController().navigate(R.id.action_firrrrrrrrrrstFragment_to_seeeeecooondFragment)

    }
}