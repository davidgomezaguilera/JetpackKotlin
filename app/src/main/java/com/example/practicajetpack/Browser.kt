package com.example.practicajetpack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.SearchView
import kotlinx.android.synthetic.main.fragment_browser.*


/**
 * A simple [Fragment] subclass.
 * Use the [Browser.newInstance] factory method to
 * create an instance of this fragment.
 */
class Browser : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private val URLBASE = "https://www.google.com"
    private val pathSearch = "/search?q="
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.fragment_browser)
        //webView
        /*webView.webChromeClient = object : WebChromeClient(){

        }


        println(webView)
        webView.webViewClient = object : WebViewClient() {

        }
        val settings = webView.settings
        settings.javaScriptEnabled = true
        webView.loadUrl(URLBASE)*/
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_browser, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //busqueda
        buscador.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }

            override fun onQueryTextSubmit(query: String?): Boolean {

                query?.let{
                    webView.loadUrl(it)
                }

                return false

            }
        })



        webView.webChromeClient = object : WebChromeClient(){

        }


        println(webView)
        webView.webViewClient = object : WebViewClient() {

        }
        val settings = webView.settings
        settings.javaScriptEnabled = true
        webView.loadUrl(URLBASE)

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Browser.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Browser().apply {

            }
    }
}