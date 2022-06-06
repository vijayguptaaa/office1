package com.example.loginvalidation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginvalidation.R
import com.example.loginvalidation.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var mBinding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        this.title = "Home Page"
    }
}