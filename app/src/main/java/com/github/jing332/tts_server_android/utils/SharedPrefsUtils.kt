package com.github.jing332.tts_server_android.utils

import android.content.Context

class SharedPrefsUtils {
    companion object {
        @JvmStatic
        fun getWakeLock(ctx: Context): Boolean {
            val pref = ctx.getSharedPreferences("config", Context.MODE_PRIVATE)
            return pref.getBoolean("wakeLock", false)
        }

        @JvmStatic
        fun setWakeLock(ctx: Context, isWakeLock: Boolean) {
            val editor = ctx.getSharedPreferences("config", Context.MODE_PRIVATE).edit()
            editor.putBoolean("wakeLock", isWakeLock)
            editor.apply()
        }

    }


}