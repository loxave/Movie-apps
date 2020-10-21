package com.coolcode.bwamov.sign.Signup

//import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.Toast
import com.coolcode.bwamov.R
//import com.coolcode.bwamov.sign.SignIn.User
//import com.coolcode.bwamov.sign.SignUpPhotoscreenActivity
import com.google.firebase.database.*
//import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

//    private lateinit var sUsername: String
//    private lateinit var sPassword: String
//    private lateinit var sName: String
//    private lateinit var sEmail: String
//
//    private lateinit var mFirebaseInstance: FirebaseDatabase
//    private lateinit var mDatabase: DatabaseReference
//    private lateinit var mDatabaseReference: DatabaseReference



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

//        mFirebaseInstance = FirebaseDatabase.getInstance()
//        mDatabase =  FirebaseDatabase.getInstance().getReference()
//        mDatabaseReference = mFirebaseInstance.getReference("User")
//
//        btn_lanjutkan.setOnClickListener {
//
//            sUsername = et_username.text.toString()
//            sPassword = et_password.text.toString()
//            sName = et_name.text.toString()
//            sEmail = et_email.text.toString()
//
//            if (sUsername == "") {
//                et_username.error = "Silahkan isi username anda"
//                et_username.requestFocus()
//            } else if (sPassword == "") {
//                et_password.error = "Silahkan isi password anda"
//                et_password.requestFocus()
//            } else if (sName == "") {
//                et_name.error = "Silahkan isi nama anda"
//                et_name.requestFocus()
//            } else if (sEmail == "") {
//                et_email.error = "Silahkan isi email anda"
//                et_email.requestFocus()
//            } else {
//                saveUsername(sUsername,sPassword,sName,sEmail)
//            }
//        }
//    }
//
//    private fun saveUsername(sUsername: String, sPassword: String, sName: String, sEmail: String) {
//
//        var user = User()
//        user.nama = sName
//        user.email = sEmail
//        user.username = sUsername
//        user.password = sPassword
//
//        if (sUsername != null){
//            checkingUsername(sUsername, user)
//        }
//    }
//
//    private fun checkingUsername(sUsername: String, data: User) {
//
//        mDatabaseReference.child(sUsername).addValueEventListener(object : ValueEventListener{
//            override fun onCancelled(databaseError: DatabaseError) {
//                Toast.makeText(this@SignUpActivity, databaseError.message,Toast.LENGTH_LONG).show()
//            }
//
//            override fun onDataChange(dataSnapshot: DataSnapshot) {
//                var user = dataSnapshot.getValue(User::class.java)
//                if (user == null){
//                    mDatabaseReference.child(sUsername).setValue(data)
//
//                    var goSignUpPhotoScreen = Intent(this@SignUpActivity,
//                        SignUpPhotoscreenActivity::class.java).putExtra("nama", data?.nama)
//                    startActivity(goSignUpPhotoScreen)
//
//                    Toast.makeText(this@SignUpActivity, "User sudah digunakan",Toast.LENGTH_LONG).show()
//                }
//            }
//        })
    }
}