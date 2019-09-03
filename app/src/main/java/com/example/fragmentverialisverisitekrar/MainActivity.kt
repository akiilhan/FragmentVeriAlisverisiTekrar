package com.example.fragmentverialisverisitekrar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity(), MyInterface {
    var manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        addFragmentA()
        addFragmentB()
    }

    private fun addFragmentA() {
        var fragmentA = FragmentA()
        var transaction = manager.beginTransaction()
        transaction.add(R.id.containerA, fragmentA, "fragA")
        transaction.commit()

    }

    private fun addFragmentB() {
        var fragmentB = FragmentB()
        var transaction = manager.beginTransaction()
        transaction.add(R.id.containerB, fragmentB, "fragB")
        transaction.commit()
    }

    override fun sayilariTopla(sayi1: Int, sayi2: Int) {

        var fragment_B = manager.findFragmentByTag("fragB") as FragmentB
        fragment_B.sayilariTopla(sayi1, sayi2)

    }

}
