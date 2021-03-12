package com.example.myapplication.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.App
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivitySigninBinding
import com.example.myapplication.di.component.DaggerApplicationComponent
import com.example.myapplication.ui.home.HomeActivity
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    private var viewModel: LoginViewModel? = null

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    /**
     * Perform initializations of the activity .
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBindings(savedInstanceState)
    }

    /**
     * Setup the binding and the view model
     */
    private fun setupBindings(savedInstanceState: Bundle?) {
        DaggerApplicationComponent.factory().create(this.application as App).inject(this)
        val activityBinding: ActivitySigninBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_signin)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        activityBinding.model = viewModel
        if (savedInstanceState == null) {
            viewModel?.init()
        }
        activityBinding.model = viewModel

        setupButtonClick()
    }

    /**
     * To handle the login button click
     */
    private fun setupButtonClick() {
        viewModel?.getLoginFields()?.observe(this, Observer { loginModel ->
            Toast.makeText(
                this@LoginActivity,
                "Email " + loginModel?.getEmail() + ", Password " + loginModel?.getPassword(),
                Toast.LENGTH_SHORT
            ).show()
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        })
    }
}