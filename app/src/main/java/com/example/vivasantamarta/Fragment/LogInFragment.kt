package com.example.vivasantamarta.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.vivasantamarta.AdminSQliteOpenHelper
import com.example.vivasantamarta.R
import com.google.android.material.textfield.TextInputLayout

class LogInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_log_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonLogIn = view.findViewById<ImageView>(R.id.imageViewButtonLogIn)

        buttonLogIn.setOnClickListener {
            val textInputLogInName = view.findViewById<TextInputLayout>(R.id.textInputLogInName)
            val textInputlogInPasword =
                view.findViewById<TextInputLayout>(R.id.textInputlogInPasword)


            val textInputNameL = textInputLogInName.editText?.text.toString()
            val textInputpaswordL = textInputlogInPasword.editText?.text.toString()

            if (textInputNameL.isEmpty()) {
                textInputLogInName.error = "Digite nombre"
            } else {
                textInputLogInName.error = ""
            }
            if (textInputpaswordL.isEmpty()) {
                textInputlogInPasword.error = "Digite nombre"
            } else {
                textInputlogInPasword.error = ""
            }

            if (textInputNameL.isNotEmpty() || textInputpaswordL.isEmpty()) {
                val admin = activity?.let { it1 ->
                    AdminSQliteOpenHelper(
                        it1,
                        "administracion",
                        null,
                        1
                    )
                }
                val bd = admin?.writableDatabase

                val fila = bd?.rawQuery(
                    "select nombre_usuario, clave1 from usuario where nombre_usuario = ? and  clave1 = ?",
                    arrayOf(textInputNameL, textInputpaswordL)
                )

                if (fila != null) {
                    if (fila.moveToFirst()) {

                        findNavController().navigate(R.id.action_logInFragment_to_lugaresFragment)

                    } else {
                        Toast.makeText(activity, "Usuario no registrado", Toast.LENGTH_SHORT).show()
                    }
                }


            }


        }


    }


}