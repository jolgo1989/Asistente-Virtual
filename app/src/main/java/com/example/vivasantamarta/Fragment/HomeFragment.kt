package com.example.vivasantamarta.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.example.vivasantamarta.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textViewHomeLogin = view.findViewById<TextView>(R.id.textViewHomeLogin)
        textViewHomeLogin?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_logInFragment)
        }


        val textViewRegistrarse = view.findViewById<TextView>(R.id.textViewRegistrarse)

        textViewRegistrarse.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_registerFragment)
        }

        //Metodo para activar el Alert dialog(Salir de aplicación)
        requireActivity().onBackPressedDispatcher.addCallback(this) {
            // With blank your fragment BackPressed will be disabled.
            context?.let {
                MaterialAlertDialogBuilder(it)
                    .setMessage("¿Desea salir de la aplicación?")

                    .setNegativeButton("No") { dialog, which ->
                        // Respond to negative button press
                    }
                    .setPositiveButton("Si") { dialog, which ->
                        // Respond to positive button press
                        activity?.finish()
                    }
                    .show()
            }
        }

    }

}