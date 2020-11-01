package com.example.vivasantamarta.Fragment

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.vivasantamarta.AdminSQliteOpenHelper
import com.example.vivasantamarta.MainActivity
import com.example.vivasantamarta.R
import com.google.android.material.textfield.TextInputLayout

class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonRegister = view.findViewById<Button>(R.id.buttonRegister)

        buttonRegister.setOnClickListener {
            val textInputregisterName =
                view.findViewById<TextInputLayout>(R.id.textInputregisterName)
            val textInpRegisterPasword1 =
                view.findViewById<TextInputLayout>(R.id.textInpRegisterPasword1)
            val textInpRegisterPasword2 =
                view.findViewById<TextInputLayout>(R.id.textInpRegisterPasword2)

            val textInputName = textInputregisterName.editText?.text.toString()
            val textInputRagister1 = textInpRegisterPasword1.editText?.text.toString()
            val textInputRagister2 = textInpRegisterPasword2.editText?.text.toString()

            if (textInputName.isEmpty()) {
                textInputregisterName.error = "Digite nombre"
            } else {
                textInputregisterName.error = ""
            }

            if (textInputRagister1.isEmpty()) {
                textInpRegisterPasword1.error = "Digite Clave"
            } else {
                textInpRegisterPasword1.error = ""
            }

            if (textInputRagister2.isEmpty()) {
                textInpRegisterPasword2.error = "Digite Clave"
            } else {
                textInpRegisterPasword2.error = ""
            }

            if (textInputName.isNotEmpty() && textInputRagister1.isNotEmpty() && textInputRagister2.isNotEmpty()) {
                val admin =
                    activity?.let { it1 -> AdminSQliteOpenHelper(it1, "administracion", null, 1) }
                val bd = admin?.writableDatabase
                val registro = ContentValues()
                registro.put("nombre_usuario", textInputName)
                registro.put("clave1", textInputRagister1)
                registro.put("clave1", textInputRagister2)
                bd?.insert("usuario", null, registro)
                bd?.close()

                findNavController().navigate(R.id.action_registerFragment_to_logInFragment)

            }


        }
    }

}