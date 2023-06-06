package com.smirnoffkompani.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

private val Any.itemId: Any
    get() {
        TODO("Not yet implemented")
    }
private val Nothing?.itemId: Any
    get() {
        TODO("Not yet implemented")
    }

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initNavigation()
    }

    private fun initNavigation() {
        TODO("Not yet implemented")
    }

    private fun initNavigation(bottom_navigation: Any, it: Any) {
            val topAppBar = null
        topAppBar.setOnMenuItemClickListener {
                val it = null
            when (it.itemId) {
                R.id.settings -> {
                    Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        bottom_navigation.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.favorites -> {
                    Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.watch_later -> {
                    Toast.makeText(this, "Посмотреть похже", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.selections -> {
                    Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}

private fun Any.setOnNavigationItemSelectedListener(function: () -> Boolean) {
    TODO("Not yet implemented")
}

private fun Nothing?.setOnMenuItemClickListener(function: () -> Boolean) {
    TODO("Not yet implemented")
}
