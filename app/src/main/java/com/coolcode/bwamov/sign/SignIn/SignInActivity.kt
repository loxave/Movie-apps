package com.coolcode.bwamov.sign.SignIn
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi

import com.coolcode.bwamov.HomeActivity
import com.coolcode.bwamov.R
import com.coolcode.bwamov.sign.Signup.SignUpActivity
//import com.coolcode.bwamov.utils.Preferences
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_sign_in.*


class SignInActivity : AppCompatActivity() {

    lateinit var iUsername:String
    lateinit var iPassword:String
    lateinit var mDatabase:DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        mDatabase = FirebaseDatabase.getInstance().getReference("User")
        btn_home.setOnClickListener {

            iUsername = et_username.text.toString()
            iPassword = et_password.text.toString()

            if (iUsername == ""){
                et_username.error = "Masukkkan username anda"
                et_username.requestFocus()
            } else if(iPassword == ""){
                et_password.error = "Masukkan paswword anda"
                et_password.requestFocus()
            } else {
                pushLogin(iUsername, iPassword)
            }
        }

        btn_home.setOnClickListener {

            val goHome = Intent(this@SignInActivity, HomeActivity::class.java)
            startActivity(goHome)
        }
    }

    private fun pushLogin(iUsername: String, iPassword: String) {
        mDatabase.child(iUsername).addValueEventListener(object : ValueEventListener{
            override fun onCancelled(databaseError: DatabaseError) {
                Toast.makeText(this@SignInActivity, databaseError.message,Toast.LENGTH_LONG).show()
            }

            override fun onDataChange(dataSnapshot: DataSnapshot) {

                var user= dataSnapshot.getValue(User::class.java)

                if (user == null){
                    Toast.makeText(this@SignInActivity, "Username anda tidak sesuai",Toast.LENGTH_LONG).show()
                } else if (user.password == iPassword){

                    val intent = Intent(this@SignInActivity, HomeActivity::class.java)
                    startActivity(intent)
                } else
                    Toast.makeText(this@SignInActivity, "Password anda salah",Toast.LENGTH_LONG).show()
            }

        })
    }
}