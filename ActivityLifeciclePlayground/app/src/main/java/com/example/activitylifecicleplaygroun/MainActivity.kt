package com.example.activitylifecicleplaygroun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.window.OnBackInvokedDispatcher
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.addCallback
import androidx.appcompat.app.AlertDialog
//import android.util.Log
//import android.widget.Button
import com.example.activitylifecicleplaygroun.databinding.ActivityMainBinding
import java.io.File

//import java.util.*
//import kotlin.concurrent.fixedRateTimer

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    var seconds = 0
//    private lateinit var timer: Timer
//    private var isFirstLoad = true
//    private var numberOfLoads = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonExit.setOnClickListener {
//            finish()
            showDialog()
        onBackPressedDispatcher.addCallback { showDialog() }
        }
//        binding.textViewRefreshStatus.text = "Welcome to ther app! Her is your feed..."

//        onBackPressedDispatcher.addCallback {
//            Toast.makeText(
//                this@MainActivity, "In the button callback",
//                Toast.LENGTH_LONG
//            ).show()
        }



    private fun showDialog() {
        AlertDialog.Builder(this)
            .setTitle("Warning!")
            .setMessage("You are about to leave the app. Are you sure you want to exit?")
            .show()


    }

//    override fun onBackPressed() {
//          //onBackPressedDispatcher.onBackPressed()
//        Toast.makeText(this, "Back button pressed", Toast.LENGTH_LONG).show()
//    }

//    override fun onDestroy() {
//        super.onDestroy()
//        val userMessage = binding.editTextMessage.text
//        File(filesDir, "user message.txt").writeText(userMessage.toString())
//    }

//    override fun onResume() {
//        super.onResume()
//        timer = fixedRateTimer(period = 1000L) {
//            runOnUiThread {
//                seconds++
//                var testString = "You have been staring at this" +
//                        " screen for $seconds seconds"
//                binding.textViewTimer.text = testString
//            }
//        }
//    }

//    override fun onPause() {
//        super.onPause()
//        timer.cancel()
//    }

//    override fun onRestart() {
//        super.onRestart()
//        binding.textViewRefreshStatus.text = "Your fees has been updated ..."
//    }

//    override fun onResume() {
//        super.onResume()
//        numberOfLoads++
//        binding.textViewRefreshStatus.text = "Welcome to Your Feed!" +
//                " We have loaded your content $numberOfLoads time(s)"
//    }

//    override fun onResume() {
//        super.onResume()
//        if (isFirstLoad) {
//            binding.textViewRefreshStatus.text = "Welcome to ther app! Her is your feed..."
//            isFirstLoad = false
//        } else {
//            binding.textViewRefreshStatus.text = "Your fees has been updated ..."
//        }

//    }
}

