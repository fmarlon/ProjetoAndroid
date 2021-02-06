package dev.estudos.projetoandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        title = "Meu Projeto Android"

        setContentView(R.layout.activity_main)

        val btnMensagem = findViewById<Button>(R.id.active_main_btn_mensagem)
        btnMensagem.setOnClickListener {
            Toast.makeText(this, "Boa tarde!!!", Toast.LENGTH_SHORT).show()
        }

        val btnOutrActivity = findViewById<Button>(R.id.main_activity_bnt_outra_activity)
        btnOutrActivity.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
            Toast.makeText(this, "Outra Activity Iniciada", Toast.LENGTH_SHORT).show()
        }
    }

}