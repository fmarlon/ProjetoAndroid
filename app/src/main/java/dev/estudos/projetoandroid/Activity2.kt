package dev.estudos.projetoandroid

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Activity2 : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val btnFinalizar = findViewById<Button>(R.id.active_2_btn_finalizar)

        btnFinalizar.setOnClickListener {
            Toast.makeText(this, "Essa activity será finalizada. Obrigado!!!", Toast.LENGTH_SHORT).show()
            this.finish()
        }

        val btnAlterarTexto = findViewById<Button>(R.id.activity_2_btn_alterar_texto)
        val txtTexto = findViewById<TextView>(R.id.activity_2_txt_texto)
        btnAlterarTexto.setOnClickListener {
            val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
            txtTexto.text = "Data/Hora Atual: " + LocalDateTime.now().format(formatter)
            Toast.makeText(this, "Texto alterado!", Toast.LENGTH_SHORT).show()
        }
    }

}