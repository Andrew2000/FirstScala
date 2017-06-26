package com.scalapractice

case class Person(firstName: String, lastName: String, age: Int)

object HelloWorld {
    def main(args: Array[String]) {
        // create our object as a json string
        val spock = new Person("Leonard", "Nimoy", 81)

        println(spock)
    }
}
