package com.example.tasarimodevi1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var girisButton: Button
    private lateinit var kayitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        girisButton = findViewById(R.id.button) // Giriş düğmesini bağla
        kayitButton = findViewById(R.id.button2) // Kayıt düğmesini bağla

        girisButton.setOnClickListener {
            // Giriş düğmesine tıklanınca LoginActivity'ye yönlendir
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        kayitButton.setOnClickListener {
            // Kayıt düğmesine tıklanınca SignUpActivity'e yönlendir
            val intent = Intent(this@MainActivity, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
