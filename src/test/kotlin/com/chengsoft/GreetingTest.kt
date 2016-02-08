package com.chengsoft

import org.junit.Assert
import org.junit.Test

/**
 * Greeting test case.
 */
class GreetingTest {

    /**
     * Given the user name is "Kotlin"
     * When we call "sayHai" with user name.
     * Then it should return "Hello Kotlin!"
     */
    @Test
    fun sayHiWithParameter() {
        Assert.assertEquals("Hello Kotlin!", sayHi("Kotlin"))
    }

    /**
     * Given the user name is not specified
     * When we call "sayHai" without any parameter.
     * Then it should return "Hello World!"
     */
    @Test
    fun sayHiWithoutParameter() {
        Assert.assertEquals("Hello World!", sayHi())
    }
}