package com.example

import org.slf4j.LoggerFactory
import javax.annotation.PostConstruct

class MyConstructedBean(
    private val configuration: Properties,
) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    var postConstructCalled : Boolean = false

    @PostConstruct
    fun start() { // This is never called, although the ConfigurationFactory creates this bean with @EachBean.
        logger.info("Running @PostConstruct ...")
        logger.info(configuration.toString())
        postConstructCalled = true
    }
}
