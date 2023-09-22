package design.strategy

abstract class Duck {
    var flyBehavior: FlyBehavior? = null
    fun performFly() {
        flyBehavior?.fly();
    }
}
