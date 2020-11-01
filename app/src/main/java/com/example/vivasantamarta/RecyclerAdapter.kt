package com.example.vivasantamarta

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val userList: ArrayList<Sitios> = ArrayList()) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        lateinit var textViewDescription: TextView
        lateinit var textViewTitle: TextView
        lateinit var textViewAdress: TextView
        lateinit var textViewCitas: TextView
        lateinit var imageCardView: ImageView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)

        return ViewHolder(v).apply {
            textViewDescription = v.findViewById(R.id.textViewCardViewDescription)
            textViewTitle = v.findViewById(R.id.textViewCarviewTitle)
            textViewAdress = v.findViewById(R.id.textViewCardViewAdress)
            textViewCitas = v.findViewById(R.id.textViewCitas)
            imageCardView = v.findViewById(R.id.imageCardView)

        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // now the reference is a field on the ViewHolder
        holder.textViewDescription.text = userList[position].description
        holder.textViewTitle.text = userList[position].title
        holder.textViewAdress.text = userList[position].adress
        holder.textViewCitas.text = userList[position].citas
        holder.imageCardView.setImageResource(userList[position].img)

    }

    override fun getItemCount(): Int = userList.size

}


