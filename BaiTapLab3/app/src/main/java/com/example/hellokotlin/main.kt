package com.example.hellokotlin

import com.example.hellokotlin.myapp.Aquariums
fun main() {
    buildAquarium()
}
fun buildAquarium() {
    val myAquarium = Aquariums()
    myAquarium.printSize()
}