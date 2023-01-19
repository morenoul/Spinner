package com.example.spinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Primero, creamos una lista de opciones para el spinner
        val options = arrayOf("Opción 1", "Opción 2", "Opción 3")
        // conexion del spinner en nuestro layout
        val spinner = findViewById<Spinner>(R.id.spinner)
        // Creamos un adaptador para el spinner y le asignamos nuestra lista de opciones
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        // Asignamos el adaptador al spinner

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Podemos escuchar los cambios de selección en el spinner usando un setOnItemSelectedListener
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                // Aquí puedes obtener la opción seleccionada a través de su posición
                val selectedOption = options[position]
            }
            // Se llama cuando no hay ninguna opción seleccionada (por ejemplo, al iniciar la aplicación)
            override fun onNothingSelected(parent: AdapterView<*>){

            }
        }
    }
}