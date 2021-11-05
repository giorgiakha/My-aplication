package com.example.myapplication

class Person {
    var name : String = ""
    var age : Int = 0
    fun printName(){
        println(name)
    }

    override fun toString(): String {
        return "$name"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Person)
            if (name.hashCode() == other.name.hashCode())
                return true
        return false
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

}

fun main() {
    var person1 = Person()
    person1.name = "giorgi"
    person1.age = 16


    var person2 = Person()
    person2.name = "giorgi"
    person2.age = 16

    println(person1.hashCode())
    println(person2.hashCode())
    println(person1.equals(person2))


}




