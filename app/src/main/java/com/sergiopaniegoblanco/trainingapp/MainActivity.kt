package com.sergiopaniegoblanco.trainingapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val items = listOf(Item("Title1", "url"),Item("Title2", "url2"))
        val empty = emptyList<Item>()
        val soted: List<String> = items
                .sortedBy(Item::title)
                .filter { it.url.isNotEmpty() }
                .map(Item::title)
        /*
            Data Classes
            val item = Item("item","url")

            val (title, _) = item
         */

        button.setOnClickListener {
            toast(editText.text)
            /*
                or toast(editText.text,Toast.LENGTH_SHORT)

                Using the extension function avoids the method overloading
            */

            /*
                Instead of calling the toast as usual, we call it using the extension function
                val text = editText.text
                Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
            */
        }

        /*

            This implementation would be the one used on Java when adding an OnClickListener
            but it can be converted to a lambda function just as the second instruction

            button.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    val text = editText.text
                    Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()            }
            })

            button.setOnClickListener {
                val text = editText.text
                Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
            }

        */


    }
}
