package com.chengsoft

import org.junit.Ignore
import org.junit.Test

/**
 * Created by Tim on 2/7/2016.
 */
class HelloWorldTest {
    @Test
    fun explicitReturnType() {
        val b = 1   // inferred type
        val c: Int  // type required when value not assigned
        c = 2
        println(sum(b, c))
    }

    // Explicit return type
    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    @Test
    fun inferredReturnType() {
        println(meh("foobar"))
    }

    // Inferred return type
    // String template
    fun meh(x: String) = "meh: $x"

    @Test
    fun valReadOnly() {
        // Invalid because val is read-only
        //        val a: Int = 1;
        //        a = 1;
    }

    @Test
    fun valMutable() {
        var x = 5;
        // executing code in string template
        println("mutable variable: ${++x}")
    }

    @Test
    fun ifExpressions() {
        // Normal if statement
        println(max(10, 99))

        // Using if-expressions
        val d = 20
        val e = 0.1
        val min = if (d < e) d else e
        println("The min of $d and $e is $min")
    }

    fun max(a: Int, b: Int): Int {
        if (a > b)
            return a
        else
            return b
    }

    @Test
    fun allAboutNulls() {
        println(parseInt("12"))
        println(parseInt("abc"))    // returns null

        val x = parseInt("def")
        // compilation error since return type is a nullable type Int?
        //        x.toLong()
        println(x?.toLong()) // returns null before calling toLong()
    }

    // Use Int? to return Int or null
    fun parseInt(str: String): Int? {
        try {
            return str.toInt()
        } catch (e: NumberFormatException) {
            return null
        }
    }
}