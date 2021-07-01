package com.fduhen.crackme02

import android.content.Context
import android.content.SharedPreferences
import android.util.Base64
import android.widget.Toast
import com.google.gson.Gson
import java.io.File
import java.io.FileWriter

class AuthManager(private val context: Context) {

    companion object {
        const val USER_KEY = "USER_KEY"
    }

    val gson = Gson()

    fun getConnectedUser() : User? {
        val prefs = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE) ?: return null
        val userEncoded = prefs.getString(USER_KEY, null) ?: return null

        val userJson = String(Base64.decode(userEncoded, Base64.DEFAULT))
        return try {
            gson.fromJson(userJson, User::class.java)
        } catch (exception: Exception) {
            null
        }
    }


    fun connect() : User {
        val currentUser = User("regularUser", false)
        val encodedUser = Base64.encodeToString(gson.toJson(currentUser).toByteArray(), 1)
        val prefs = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)

        if (prefs == null) {
            displaySetupError()
        } else {
            with (prefs.edit()) {
                this.putString(USER_KEY, encodedUser)
                this.apply()
            }
        }

        return currentUser
    }

    private fun displaySetupError() {
        Toast.makeText(
            context,
            "Erreur lors du setup du CrackMe. Merci d'installer l'application sur un émulateur recommandé dans le Readme",
            Toast.LENGTH_LONG
        ).show()
    }


}