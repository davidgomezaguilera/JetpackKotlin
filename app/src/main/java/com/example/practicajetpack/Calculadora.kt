package com.example.practicajetpack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_calculadora.*

class Calculadora : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculadora, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonSumar.setOnClickListener {
            val valor1 = Integer.parseInt(editTextNumero1.text.toString())
            val valor2 = Integer.parseInt(editTextNumero2.text.toString())
            val calculo = valor1 + valor2
            //aqui si hay que pasarle argumentos, los dos numberView
             //con estas dos lineas consigo enviar los dos argumentos al fragment de suma, ahora tengo que recogerlos en es mismo fragment
            //para recogerlos he de irme al .kt del fragment que lo vaya a recibir y escribir arguments?.let.... etc
            val bundle = Bundle();
            bundle.putString("key", ""+calculo)
            //val direction =CalculadoraDirections.actionCalculadoraToSuma(valor1.toFloat(), valor2.toFloat())
            Navigation.findNavController(it).navigate(R.id.action_calculadora_to_suma, bundle)//echar un vistazo porque me esta petando aqui.
        }
        buttonRestar.setOnClickListener {
            //aqui igual
            val valor1 = Integer.parseInt(editTextNumero1.text.toString())
            val valor2 = Integer.parseInt(editTextNumero2.text.toString())
            val calculo = valor1 - valor2
            println(calculo)
            val bundle = Bundle()
            bundle.putString("key", ""+calculo)
            Navigation.findNavController(it).navigate(R.id.action_calculadora_to_resta, bundle)
        }
        buttonDividir.setOnClickListener {
            //aqui igual
             val valor1 = Integer.parseInt(editTextNumero1.text.toString())
             val valor2 = Integer.parseInt(editTextNumero2.text.toString())
            val calculo = valor1/valor2
            val bundle = Bundle()
            bundle.putString("key", ""+calculo)
            Navigation.findNavController(it).navigate(R.id.action_calculadora_to_divide, bundle)
        }

    }

}