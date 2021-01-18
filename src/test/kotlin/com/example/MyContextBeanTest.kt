package com.example

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class MyContextBeanTest {

    @Inject
    lateinit var cut : MyContextBean

    @Test
    fun `postConstruct of bean is called` () {
       assert(cut.postConstructCalled) { "Expected to be true but was not."}
    }
}