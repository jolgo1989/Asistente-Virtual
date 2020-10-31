package com.example.vivasantamarta.Fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.ImageView
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.example.vivasantamarta.R


class LugaresFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lugares, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageViewMuseos = view.findViewById<ImageView>(R.id.imageViewMuseos)
        val imageViewLugares = view.findViewById<ImageView>(R.id.imageViewLugares)
        val imageViewrestaurantes = view.findViewById<ImageView>(R.id.imageViewrestaurantes)

        imageViewLugares.setOnClickListener {
            findNavController().navigate(R.id.action_lugaresFragment_to_sitiosFragment)

        }

        imageViewrestaurantes.setOnClickListener {

            findNavController().navigate(R.id.action_lugaresFragment_to_restaurantesFragment)
        }

        imageViewMuseos.setOnClickListener {

            findNavController().navigate(R.id.action_lugaresFragment_to_museosFragment)
        }


        //Metodo para bloquear el boton a tras
        requireActivity().onBackPressedDispatcher.addCallback(this) {
            // With blank your fragment BackPressed will be disabled.
        }


    }

    //Los onCreate,onCreateOptionsMenu y onOptionsItemSelected permiten la creación del menuOverFlow
    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.overflow,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.iteam -> {
                findNavController().navigate(R.id.action_lugaresFragment_to_homeFragment2)
                true
            }

            else -> super.onOptionsItemSelected(item)

        }

    }

}

