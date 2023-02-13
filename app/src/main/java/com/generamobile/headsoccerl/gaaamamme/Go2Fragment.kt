package com.generamobile.headsoccerl.gaaamamme

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.generamobile.headsoccerl.R
import com.generamobile.headsoccerl.databinding.FragmentGo2Binding


class Go2Fragment : Fragment() {
    val thgyhyhyhyhy by lazy {
        ContextCompat.getDrawable(requireActivity(), R.drawable.mm)
    }
    val hyjujikololoololol by lazy {
        ContextCompat.getDrawable(requireActivity(), R.drawable.mm)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGo2Binding = FragmentGo2Binding.inflate(inflater, container, false)
        return binding.root
    }

    private fun gtughtugtughut() {
        tjihjjyhhugthgtuhgthgt()
    }


    private fun hgtuhghthbvbbhvbbfbfvb() {
        findNavController().navigate(R.id.action_go2Fragment_to_go1Fragment)
    }

    private fun rjtijgjtjgjtgjgjtjgtjgt() {
        gthyjujuj = false
    }

    private fun jgtjtjgjtjjgifhrfyryfgryfgr(drawableList: List<Drawable?>) {
        tjgtjgtijggtj(drawableList)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val drawableList = listOf(thgyhyhyhyhy, hyjujikololoololol).shuffled()

            jgtjtjgjtjjgifhrfyryfgryfgr(drawableList)
            rjtijgjtjgjtgjgjtjgtjgt()
            binding.btnPressgtgtghhy.setOnClickListener {
                if (hhhhhhhhh >= 99) {
                    hgtuhghthbvbbhvbbfbfvb()

                }else{
                    hhhhhhhhh += 10
                    Toast.makeText(requireContext(), "Damage done!", Toast.LENGTH_SHORT).show()
                }
            }
            binding.btnClooooooosa.setOnClickListener {
                gtughtugtughut()
            }


        } catch (e: Exception) {
            uuuuuuuuuuuu()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun tjgtjgtijggtj(drawableList: List<Drawable?>) {
        binding.imgMainEnemeefrgyhyhyhyyh.setImageDrawable(drawableList.random())
    }


    private var hhhhhhhhh = 1
    private var gthyjujuj = true

    private var fragmentGo2Binding: FragmentGo2Binding? = null
    private val binding
        get() = fragmentGo2Binding ?: throw RuntimeException("FragmentGo2Binding = null")



    private fun uuuuuuuuuuuu() {
        Toast.makeText(
            requireContext(),
            "I have some error, try again",
            Toast.LENGTH_SHORT
        ).show()
    }


    override fun onPause() {
        hhhhhhhhh = 1
        onDestroy()
        super.onPause()
    }

    private fun tjihjjyhhugthgtuhgthgt() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Close game")
            .setPositiveButton("Yes, close") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("No") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }

    override fun onDestroy() {
        fragmentGo2Binding = null
        super.onDestroy()
    }


}