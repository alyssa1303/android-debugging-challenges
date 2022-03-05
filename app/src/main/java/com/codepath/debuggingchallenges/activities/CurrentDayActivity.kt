package com.codepath.debuggingchallenges.activities

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle
import android.util.Log
import android.view.View
import com.codepath.debuggingchallenges.R
import java.util.*

private const val TAG = "CurrentDay"
class CurrentDayActivity : AppCompatActivity() {
    var tvDay: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_day)
        tvDay = findViewById<View>(R.id.tvDay) as TextView
        tvDay?.setText(dayOfMonth.toString())
    }

    private val dayOfMonth: Int
        get() {
            val cal = Calendar.getInstance()
            return cal[Calendar.DAY_OF_MONTH]
        }
}