package teaparty.core

import kotlin.test.Test
import kotlin.test.assertEquals

class CoreLogicTest {
    @Test
    fun testGreet() {
        val logic = CoreLogic()
        assertEquals("Hello, Kotlin!", logic.greet("Kotlin"))
    }
}
