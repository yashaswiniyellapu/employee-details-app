package com.everest.employeedetails

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class HomeActivity :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val name = findViewById<EditText>(R.id.emp_name)
         val empId= findViewById<EditText>(R.id.emp_id)
         val proffession= findViewById<EditText>(R.id.profession)
         val prevExp= findViewById<EditText>(R.id.experience)
         val confirmButton= findViewById<Button>(R.id.confirm_button)


        confirmButton.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            intent.putExtra("name",name.text.toString())
            intent.putExtra("emp_id",empId.text.toString())
            intent.putExtra("profession",proffession.text.toString())
            intent.putExtra("prevEX",prevExp.text.toString())
            startActivity(intent)

        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("name", findViewById<EditText>(R.id.emp_name).toString())
        outState.putString("emp_id", findViewById<EditText>(R.id.emp_id).toString())
        outState.putString("profession", findViewById<EditText>(R.id.profession).toString())
        outState.putString("prevEX", findViewById<EditText>(R.id.experience).toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        savedInstanceState.getString("name")
        savedInstanceState.getString("emp_id")
        savedInstanceState.getString("profession")
        savedInstanceState.getString("prevEX")

    }

}