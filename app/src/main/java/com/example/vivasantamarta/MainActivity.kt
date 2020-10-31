package com.example.vivasantamarta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    //metodo para activar el Alert dialog
    override fun onBackPressed() {
        MaterialAlertDialogBuilder(this)
            .setMessage("¿Desea salir de la aplicación?")

            .setNegativeButton("No") { dialog, which ->
                // Respond to negative button press
            }
            .setPositiveButton("Si") { dialog, which ->
                // Respond to positive button press

                finish()
            }
            .show()

    }
}