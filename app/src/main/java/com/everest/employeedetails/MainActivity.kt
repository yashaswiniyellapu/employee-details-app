package com.everest.employeedetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var name: TextView
    lateinit var empId : TextView
    lateinit var proffession: TextView
    lateinit var prevExp: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         name = findViewById<TextView>(R.id.dis_name)
         empId = findViewById<TextView>(R.id.dis_id)
         proffession = findViewById<TextView>(R.id.dis_prof)
         prevExp = findViewById<TextView>(R.id.dis_preEX)


        name.text = intent.getStringExtra("name")
        empId.text = intent.getStringExtra("emp_id")
        proffession.text = intent.getStringExtra("profession")
        prevExp.text = intent.getStringExtra("prevEX")

    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.getString("name")
        outState.getString("emp_id")
        outState.getString("profession")
        outState.getString("prevEX")
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        savedInstanceState.getString("name")
        savedInstanceState.getString("emp_id")
        savedInstanceState.getString("profession")
        savedInstanceState.getString("prevEX")
    }
}