package br.edu.mouralacerda.projeto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataHora = findViewById<TextView>(R.id.txtDataHora)
        val botaoAtualizar = findViewById<Button>(R.id.btnAtualizar)

        botaoAtualizar.setOnClickListener {

            val data = Date()
            val formato = SimpleDateFormat("HH:mm:ss dd/MM/yyyy")
            val dataHoraAtual = formato.format(data)

            dataHora.text = dataHoraAtual
        }
    }
}