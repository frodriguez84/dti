package com.example.mydti.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.mydti.R
import com.example.mydti.entities.Favoritos

class FavAdapter (
    var favList: MutableList<Favoritos>,
    var onClick : (Int)-> Unit
) : RecyclerView.Adapter<FavAdapter.BandHolder>() {


    class BandHolder(v : View) : RecyclerView.ViewHolder(v){

        var view: View

        init{
            this.view = v
        }

        fun setName (name: String){
            var txtName : TextView = view.findViewById( R.id.txtItemName)
            txtName.text = name
        }

        fun getCard () : CardView {
            return view.findViewById(R.id.card)
        }

        /*fun getImageView() : ImageView {
            return view.findViewById(R.id.imgItem)
        }*/

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BandHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_favoritos, parent, false)
        return (BandHolder(view))
    }

    override fun onBindViewHolder(holder: BandHolder, position: Int) {
        var fav = favList[position]
        holder.setName(fav.name)
        //holder.getImageView().setImageDrawable(holder.view.context.getDrawable(bandas.image))


        holder.getCard().setOnClickListener{
            onClick(position)
        }
    }

    override fun getItemCount(): Int {
        return favList.size
    }
}