package design.strategy

import org.junit.jupiter.api.Test

class MallardDuckTest {
    @Test
    fun `전략_패턴_테스트`() {
        val dock = MallardDuck()
        dock.performFly()
    }
}
