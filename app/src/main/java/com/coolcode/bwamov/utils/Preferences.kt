//package com.coolcode.bwamov.utils
//
//import android.content.Context
//import android.content.SharedPreferences
//
//class Preferences (val context: Context){
//
//    companion object{
//
//        const val USER_PREFF = "USER_PREFF"
//    }
//
//
//    private var sharedPreferences = context.getSharedPreferences(USER_PREFF, 0)
//
//    fun setValue(key:String, value:String){
//
//        val editor:SharedPreferences.Editor = sharedPreferences.edit()
//        editor.putString(key, value)
//        editor.apply()
//    }
//
//    fun getValue(key: String):String?{
//
//        return sharedPreferences.getString(key, "")
//    }
//}