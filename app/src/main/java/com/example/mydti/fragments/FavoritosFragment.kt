package com.example.mydti.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mydti.R
import com.example.mydti.adapter.FavAdapter
import com.example.mydti.entities.FavRepository
import com.example.mydti.viewmodels.FavoritosViewModel

class FavoritosFragment : Fragment() {

    private lateinit var viewModel: FavoritosViewModel
    lateinit var recyclerBand: RecyclerView
    lateinit var adapter: FavAdapter
    lateinit var v: View
    var repository : FavRepository = FavRepository()
    var favoritos = repository.favList
    //private lateinit var usuario : User
    //private lateinit var nombre : TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v =  inflater.inflate(R.layout.favoritos_fragment, container, false)
        recyclerBand = v.findViewById(R.id.recFav)

        return v
    }

    override fun onStart() {
        super.onStart()
        recyclerBand.setHasFixedSize(true)
        recyclerBand.layoutManager = LinearLayoutManager(context)

        adapter = FavAdapter(favoritos) {position ->

            var action = FavoritosFragmentDirections.actionFavFragToDataBeachFragment(favoritos[position])
            v.findNavController().navigate(action)
        }

        recyclerBand.adapter = adapter
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FavoritosViewModel::class.java)
        // TODO: Use the ViewModel
    }

}