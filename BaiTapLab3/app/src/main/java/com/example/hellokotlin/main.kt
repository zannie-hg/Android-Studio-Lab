package com.example.hellokotlin

import com.example.hellokotlin.myapp.Aquariums
fun main() {
    buildAquarium()
}
fun buildAquarium() {
    val myAquarium = Aquariums()
    myAquarium.printSize()
    val aquarium2 = Aquariums(width = 25)
    aquarium2.printSize()
    val aquarium3 = Aquariums(height = 35, length = 110)
    aquarium3.printSize()
    val aquarium4 = Aquariums(width = 25, height = 35, length = 110)
    aquarium4.printSize()
}