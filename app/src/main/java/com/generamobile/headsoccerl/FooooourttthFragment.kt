package com.generamobile.headsoccerl

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generamobile.headsoccerl.amaaaain.Iffjirfi
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class FooooourttthFragment : Fragment() {
    val hy26ju59uj by activityViewModel<Iffjirfi>(named("MainModel"))
    val hy2ju2622ujk5: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var juiki2ki2ik2ik: String
    private lateinit var jkklool1ol1: Context


    override fun onAttach(context: Context) {
        super.onAttach(context)
        jkklool1ol1 = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fooooourttth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val ju2ju26ujuj5uj = hy2ju2622ujk5.getString("apps", null)
        val ju2ju26ju2ki6ik = hy2ju2622ujk5.getString("appCamp", null)

        if (ju2ju26ujuj5uj=="1" && ju2ju26ju2ki6ik == null) {
            hy26ju59uj.htgjfrjiotgji(jkklool1ol1)
            hy26ju59uj.hynhyohyjihyji.observe(viewLifecycleOwner) {
                if (it != null) {
                    juiki2ki2ik2ik = it.toString()
                    hy2ju2622ujk5.edit().putString("appCamp", juiki2ki2ik2ik).apply()
                    tgjoijtjgtijtgjigt()
                }
            }
        } else {
            tgjoijtjgtijtgjigt()
        }
    }

    private fun tgjoijtjgtijtgjigt() {
        findNavController().navigate(R.id.action_fooooourttthFragment_to_fiiiiiiiiiiiveeeeeesFragment)
    }
}