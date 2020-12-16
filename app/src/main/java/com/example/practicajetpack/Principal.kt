package com.example.practicajetpack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_principal.*

class Principal : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_principal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonBrowser.setOnClickListener {

            //aqui deberia lanzar el fragment_browser
            //esta manera es sin pasarle argumentos.
            Navigation.findNavController(it).navigate(R.id.action_principal_to_browser)

        }
        buttonCamera.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_principal_to_camera)
        }
        buttonCalculator.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_principal_to_calculadora)
        }
    }

}