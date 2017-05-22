package com.sergiopaniegoblanco.trainingapp

/**
 * Created by sergiopaniegoblanco on 22/05/2017.
 */
data class Item(val id: Long, val title: String, val url: String)

fun getItems(): List<Item>{
    return (1..10).map { Item(it.toLong(), "Title: $it", "http://lorempixel.com/400/400/cats/$it/") }
}
    /*
        The declaration above replaces the constructor, getter & setters used in Java

        Adding data at the beginning of a class declaration replaces toString, equals, hashCode
     */

    //Properties
    /*
        Using getter & setters in Kotlin

        var title: String = ""
            get() {
                return "title: $field"
            }
            set(value) {
                field = "title: $field"
            }
        var url: String = ""
    */
