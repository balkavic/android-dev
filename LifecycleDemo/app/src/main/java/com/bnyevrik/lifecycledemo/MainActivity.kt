package com.bnyevrik.lifecycledemo

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        Toast.makeText(this, "In onCreate",
                Toast.LENGTH_SHORT).show()

        Log.i("info", "In onCreate")
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "In onStart",
        Toast.LENGTH_SHORT).show()

        Log.i("info", "In onStart")
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, "In onResume",
        Toast.LENGTH_SHORT).show()

        Log.i("info", "In onResume")
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this, "In onPause",
            Toast.LENGTH_SHORT).show()

        Log.i("info", "In onPause")
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this, "In onStop",
            Toast.LENGTH_SHORT).show()

        Log.i("info", "In onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, "In onDestroy",
            Toast.LENGTH_SHORT).show()

        Log.i("info", "In onDestroy")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        Toast.makeText(this, "In onCreateOptionsMenu",
            Toast.LENGTH_SHORT).show()

        Log.i("info", "In onCreateOptionsMenu")
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Toast.makeText(this, "In onOptionsItemSelected",
            Toast.LENGTH_SHORT).show()

        Log.i("info", "In onOptionsItemSelected")
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
