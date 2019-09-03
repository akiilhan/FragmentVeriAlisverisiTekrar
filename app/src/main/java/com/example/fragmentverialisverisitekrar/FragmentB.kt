package com.example.fragmentverialisverisitekrar


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FragmentB : Fragment() {

    lateinit var sonuc: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var v = inflater.inflate(R.layout.fragment_b, container, false)

        sonuc = v.findViewById(R.id.tvsonuc)

        return v
    }

    fun sayilariTopla(sayi1: Int, sayi2: Int) {
        var toplam = sayi1 + sayi2
        sonuc.setText("Sonuç: "+toplam)
    }


}
