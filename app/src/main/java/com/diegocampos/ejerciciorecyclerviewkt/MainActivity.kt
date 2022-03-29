package com.diegocampos.ejerciciorecyclerviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listaPersonaje: ArrayList<Personaje> = ArrayList()

        var myRecyclerView: RecyclerView = findViewById(R.id.myRecyclerView)

        myRecyclerView.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)


        listaPersonaje.add(Personaje(R.drawable.im_uno, "Personaje n°1", "Este es el PJ n° 1" ))
        listaPersonaje.add(Personaje(R.drawable.im_dos, "Personaje n°2", "Este es el PJ n° 2" ))
        listaPersonaje.add(Personaje(R.drawable.im_tres, "Personaje n°3", "Este es el PJ n° 3" ))
        listaPersonaje.add(Personaje(R.drawable.im_cuatro, "Personaje n°4", "Este es el PJ n° 4" ))
        listaPersonaje.add(Personaje(R.drawable.im_cinco, "Personaje n°5", "Este es el PJ n° 5" ))
        listaPersonaje.add(Personaje(R.drawable.im_seis, "Personaje n°6", "Este es el PJ n° 6" ))
        listaPersonaje.add(Personaje(R.drawable.im_siete, "Personaje n°7", "Este es el PJ n° 7" ))
        listaPersonaje.add(Personaje(R.drawable.im_ocho, "Personaje n°8", "Este es el PJ n° 8" ))

        var adaptador: AdaptadorDatos = AdaptadorDatos(applicationContext, listaPersonaje)
        myRecyclerView.adapter = adaptador

    }
}