package com.example

import io.micronaut.context.annotation.Context
import org.slf4j.LoggerFactory
import javax.annotation.PostConstruct

@Context
class MyContextBean {

    private val logger = LoggerFactory.getLogger(this::class.java)

    var postConstructCalled: Boolean = false

    @PostConstruct
    fun doSth() { // This bean's @PostConstruct is called however.
        logger.info("That's how I expect an @PostConstruct to work.")
        postConstructCalled = true
    }
}