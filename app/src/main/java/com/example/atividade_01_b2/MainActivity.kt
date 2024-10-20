package com.example.atividade_01_b2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter
    private lateinit var inputText: EditText
    private lateinit var addButton: Button

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