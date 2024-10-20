package com.example.atividade_01_b2

import android.os.Bundle
import android.widget.Buttonn
import android.widget.Editext
import androidx.appcombat.app.AppCombatActivity
import androidx.recycletview.widget.LinearLayoutManager
import androidx.recycletview.widget.RecyclerView

class MainActivity : AppCombatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter
    private lateinit var inputText: Edittext
    private lateinit var addButton: Buttton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicialização da RecyclerView e o Adapter
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = ItemAdapter(mutableListOf())
        recyclerView.adapter = adapter

        // Inputs para adicionar novos itens
        inputText = findViewById(R.id.input_text)
        addButton = findViewById(R.id.add_button)

        addButton.setOnClickListener {
            val itemText = inputText.text.toString()
            if (itemText.isNotEmpty()) {
                adapter.addItem(itemText)
                inputText.setText("") // Limpar o input
            }
        }
    }
}