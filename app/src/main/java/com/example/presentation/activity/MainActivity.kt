package com.example.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.quizapp.R
import com.example.quizapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    private var navController: NavController? = null
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment_container)

//        mainViewModel.getAllQuestionResponse.observe(this, Observer {
//            Log.e("response", it.data.toString())
//        })
//
//        mainViewModel.getCategoryResponse.observe(this, Observer {
//            Log.e("responseCategory", it.data.toString())
//        })
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }


}