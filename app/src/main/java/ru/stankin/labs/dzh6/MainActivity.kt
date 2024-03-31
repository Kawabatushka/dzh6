package ru.stankin.labs.dzh6

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Подключение обработчика для кнопки Edit
        val editButton = findViewById<Button>(R.id.editButton)
        editButton.setOnClickListener {
            // Здесь можно добавить код для открытия экрана редактирования данных пользователя
            Toast.makeText(this, "Edit button clicked", Toast.LENGTH_SHORT).show()
        }

        val notificationsItem = findViewById<View>(R.id.notificationsItem)
        notificationsItem.setOnClickListener {
            startActivity(Intent(this, NotificationsActivity::class.java))
        }

        val privacySettingsButton = findViewById<View>(R.id.privacyItem)
        privacySettingsButton.setOnClickListener {
            startActivity(Intent(this, PrivacySettingsActivity::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.notificationsItem -> {
                // Обработка нажатия на пункт Notifications
                Toast.makeText(this, "Notifications clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.settingsItem -> {
                // Обработка нажатия на пункт Settings
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
