package com.example.par2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
//                      referencia a una actividad
class Adapter(context:Context,MovieModel:ArrayList<MovieModel>):
    RecyclerView.Adapter<Adapter.ViewHolder>() {
    private var localContext:Context?=null
    private var localMovieModel:ArrayList<MovieModel>?=null

    init
    {
        localContext=context
        localMovieModel= MovieModel
    }


    //Inflar el layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val layoutInflater: LayoutInflater=LayoutInflater.from(localContext)//Referencia Main Activity
        val view: View=layoutInflater.inflate(R.layout.card,parent,false)
        return ViewHolder(view)
    }

    //Asignar valores a la fila cuando sale de la pantalla
    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val currentMovieModel:MovieModel=localMovieModel!![position]
        holder.pelName?.text=currentMovieModel.title
        holder.meta?.text=currentMovieModel.metascore
        holder.imdbV?.text=currentMovieModel.imdbVotes
        holder.imdb?.text=currentMovieModel.imdbRating
    }

    override fun getItemCount(): Int {
        return  localMovieModel?.size?:0
    }

    class ViewHolder(v: View):RecyclerView.ViewHolder(v){
        val pelName: TextView?= v.findViewById(R.id.peliTit)
        val meta: TextView?=v.findViewById(R.id.metascore)
        val imdbV: TextView? = v.findViewById(R.id.imdbV)
        val imdb: TextView? = v.findViewById(R.id.imdb)
    }
}