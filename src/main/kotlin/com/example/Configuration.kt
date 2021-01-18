package com.example

import io.micronaut.context.annotation.*
import org.slf4j.LoggerFactory

@EachProperty("foo")
class Properties {
    lateinit var aProperty: String

    override fun toString(): String {
        return "aProperty : $aProperty"
    }
}

@Factory
class BeanFactory {

    private val logger = LoggerFactory.getLogger(this::class.java)

    @EachBean(Properties::class)
    fun configuration(properties: Properties): MyConstructedBean {
        logger.info("Creating with @EachBean.")
        return MyConstructedBean(properties)
    }
}
