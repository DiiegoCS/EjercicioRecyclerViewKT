package com.diegocampos.ejerciciorecyclerviewkt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorDatos(var context: Context, var listDatos: ArrayList<Personaje>):
RecyclerView.Adapter<AdaptadorDatos.ViewHolderDatos>(){

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): AdaptadorDatos.ViewHolderDatos {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.items_recycler, null, false)
        return ViewHolderDatos(view)
    }

    override fun onBindViewHolder(holder: AdaptadorDatos.ViewHolderDatos, position: Int) {
        holder.itemView.animation = AnimationUtils.loadAnimation(context, R.anim.fade_transition)
        holder.texto.text = listDatos[position].texto
        holder.des.text = listDatos[position].descripcion
        holder.imagen.setImageResource(listDatos[position].imagen)

    }

    override fun getItemCount(): Int {
       return listDatos.size
    }

    inner class ViewHolderDatos(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imagen: ImageView
        var texto: TextView
        var des : TextView

        init {
            imagen = itemView.findViewById(R.id.im_item)
            texto = itemView.findViewById(R.id.txtNombre)
            des = itemView.findViewById(R.id.txtDes)
        }


    }
}