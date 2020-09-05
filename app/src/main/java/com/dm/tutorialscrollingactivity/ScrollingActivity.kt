package com.dm.tutorialscrollingactivity

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_scrolling.*

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Sostituisci con la tua azione", Snackbar.LENGTH_LONG)
                .setAction("Azione", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Popola il menu; questo aggiunge elementi alla barra delle azioni, se presente.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Gestisci i clic sugli elementi della barra delle azioni qui.
        // La barra delle azioni gestirà automaticamente i clic sul pulsante Home / Su,
        // purché specifichi un'attività genitore in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
