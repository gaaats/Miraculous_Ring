package com.generamobile.headsoccerl.gaaamamme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.generamobile.headsoccerl.R
import com.generamobile.headsoccerl.databinding.FragmentGo1Binding


class Go1Fragment : Fragment() {

    private fun tguthgutbbghbvhbvbbf() {
        Toast.makeText(
            requireContext(),
            "I have error, try again",
            Toast.LENGTH_SHORT
        ).show()
    }


    override fun onDestroy() {
        fragmentGo1Binding = null
        super.onDestroy()
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            ghthghghtuhghgtgut()

        } catch (e: Exception) {
            hyhhyhyhy()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun ghthghghtuhghgtgut() {
        bindinggtgtgtgt.btnPlayGameeeeeeeeeeee.setOnClickListener {
            ftkghtuhgtuhfhvbhfvbhfbhbfb()
        }
    }

    private fun hyhhyhyhy() {
        gtgjotjjhyjhj()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGo1Binding = FragmentGo1Binding.inflate(inflater, container, false)
        return bindinggtgtgtgt.root
    }


    private fun gtgjotjjhyjhj() {
        tgkoktkgkogijtijgtji()
        gtjigjtihjyjhjyijihyhjyhiyhkykfrhfhrfr()
    }

    private fun gtjigjtihjyjhjyijihyhjyhiyhkykfrhfhrfr() {
        requireActivity().onBackPressed()
    }

    private fun tgkoktkgkogijtijgtji() {
        tguthgutbbghbvhbvbbf()
    }


    private fun ftkghtuhgtuhfhvbhfvbhfbhbfb() {
        gtjjtigtijtjijgjtjigjijjg()
    }

    private fun gtjjtigtijtjijgjtjigjijjg() {
        trghtuhgtuhgtuhguhthgtuhghgutht()
    }

    private fun trghtuhgtuhgtuhguhthgtuhghgutht() {
        findNavController().navigate(R.id.action_go1Fragment_to_go2Fragment)
    }


    private var fragmentGo1Binding: FragmentGo1Binding? = null
    private val bindinggtgtgtgt
        get() = fragmentGo1Binding ?: throw RuntimeException("FragmentGo1Binding = null")
}