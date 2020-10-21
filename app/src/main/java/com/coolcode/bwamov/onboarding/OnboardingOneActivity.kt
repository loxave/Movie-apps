package com.coolcode.bwamov.onboarding

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import androidx.annotation.RequiresApi
import com.coolcode.bwamov.R
import com.coolcode.bwamov.sign.SignIn.SignInActivity
//import com.coolcode.bwamov.utils.Preferences

import kotlinx.android.synthetic.main.activity_onboarding_one.*

class OnboardingOneActivity : AppCompatActivity() {


//    lateinit var preferences: Preferences
//
//    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_one)

//        preferences = Preferences(this)
//
//        if (preferences.getValue("onBoarding") == "1"){
//            finishAffinity()
//
//            val intent = Intent(this@OnboardingOneActivity, SignInActivity::class.java)
//            startActivity(intent)
//        }

        btn_home.setOnClickListener {
            val intent = Intent(this@OnboardingOneActivity, OnboardingTwoActivity::class.java)
            startActivity(intent)
        }

        btn_daftar.setOnClickListener {

//            preferences.setValue("onBoarding", "1")
//            finishAffinity()

            val intent = Intent(this@OnboardingOneActivity, SignInActivity::class.java)
            startActivity(intent)

        }
    }
}
