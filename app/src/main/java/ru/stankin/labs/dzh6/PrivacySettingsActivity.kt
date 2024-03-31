package ru.stankin.labs.dzh6

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PrivacySettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.privacy_settings)

        // Обработка нажатия на кнопку "назад"
        val topAppBar = findViewById<View>(R.id.topAppBar)
        topAppBar.setOnClickListener {
            onBackPressed()
        }
    }
}
