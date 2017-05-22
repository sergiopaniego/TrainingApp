package com.sergiopaniegoblanco.trainingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

/**
 * Created by sergiopaniegoblanco on 22/05/2017.
 */

    /*

        An extension file host several functions that can be used through out our app.
        This one will be used to make quicker the toast implementation.
        It manages to show a toast with the text that comes from the variable.
        "Context." stands to give the context(not the Android Class) where this function will be called,
        in this case it will be called from the Context class so you just have to add that prefix to the
        function name.

     */

    /*
        The second parameter allows us to either call toast("hello") or toast("hello",Toast.LENGTH_SHORT)
     */
fun Context.toast(text: CharSequence, length: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, text, length).show()
}

fun ViewGroup.inflate(layoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layoutRes,this,false)
}

fun ImageView.loadUrl(url: String){
    Picasso.with(context).load(url).into(this)
}