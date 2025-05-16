package com.example.bookstore.Cliente

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.bookstore.Cliente.Nav_Fragments_Cliente.FragmentInicioC
import com.example.bookstore.R
import com.example.bookstore.databinding.ActivityMainClienteBinding
import com.google.android.material.navigation.NavigationView

class MainActivityCliente : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding : ActivityMainClienteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainClienteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        binding.navigationView.setNavigationItemSelectedListener(this)

        val toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            toolbar,
            R.string.open_drawer,
            R.string.close_drawer
        )

        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        replaceFragment(FragmentInicioC())
    }

    private fun replaceFragment(fragment: Fragment) {
        h
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

    }
}