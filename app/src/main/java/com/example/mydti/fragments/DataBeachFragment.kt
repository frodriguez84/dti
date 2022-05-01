package com.example.mydti.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.mydti.R
import com.example.mydti.entities.Favoritos
import com.example.mydti.viewmodels.DataBeachViewModel

class DataBeachFragment : Fragment() {

    private lateinit var viewModel: DataBeachViewModel
    lateinit var v: View
    private lateinit var name: TextView
    private lateinit var temp: TextView
    private lateinit var clima: TextView
    private lateinit var aforo: TextView
    private lateinit var viento: TextView
    private lateinit var parking: TextView
    private lateinit var fav : Favoritos



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.data_beach_fragment, container, false)

        return v
    }

    override fun onStart() {
        super.onStart()

        name = v.findViewById(R.id.txtName)
        temp = v.findViewById(R.id.txtTemp)
        clima = v.findViewById(R.id.txtClima)
        aforo = v.findViewById(R.id.txtAforo)
        viento = v.findViewById(R.id.txtViento)
        parking = v.findViewById(R.id.txtParking)

        fav = DataBeachFragmentArgs.fromBundle(requireArguments()).beach!!

        name.text =fav.name
        temp.text = fav.temp
        clima.text = fav.clima
        aforo.text = fav.aforo.toString()
        viento.text = fav.viento
        parking.text = fav.parking.toString()




    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DataBeachViewModel::class.java)

    }

}