package com.example.primeiroandroid

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.primeiroandroid.adicionar.Count
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val count = Count()
        val buttonAdicionar: Button = findViewById(R.id.Adicione)
        val buttonDimunui: Button = findViewById(R.id.button2)
        val text = findViewById<TextView>(R.id.textView)

        buttonAdicionar.setOnClickListener {
            count.increment()
            text.text = count.value.toString()
        }
        buttonDimunui.setOnClickListener {
            count.decrement()
            text.text = count.value.toString()
        }

    }

}
