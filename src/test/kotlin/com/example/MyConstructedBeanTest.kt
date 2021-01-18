package com.example

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class MyConstructedBeanTest {

    @Inject
    lateinit var cut: MyConstructedBean

    @Test
    fun `injecting bean does not invoke PostConstruct`() {
        assert(cut.postConstructCalled) { "Expected to be true but was not."}
    }
}
