package com.example.practicajetpack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_suma.*

class Suma : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_suma, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?. let {
            val resultado = it.getString("key")
            /*val numero1 = SumaArgs.fromBundle(it).numero1
            val numero2 = SumaArgs.fromBundle(it).numero2
            val resultado = numero1 + numero2*/
//aqui ya tendria en este fragment los dos argumentos que me han pasado dessde el fragment anterior, solo quedaria mostrarlos y realizar la suma.d
//            editTextMostrar1.setText(numero1.toInt())
 //           editTextMostrar2.setText(numero2.toInt())
//            editTextNumberResultadoSuma.setText(resultado.toInt())
        editTextNumberResultadoSuma.setText(resultado)
        }
    }

}