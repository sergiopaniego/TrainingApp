package com.sergiopaniegoblanco.trainingapp

/**
 * Created by sergiopaniegoblanco on 22/05/2017.
 */
data class Item(var title: String, val url: String) {
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

}