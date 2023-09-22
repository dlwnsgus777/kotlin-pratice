package design.strategy

abstract class Duck(var flyBehavior: FlyBehavior) {
    fun performFly() {
        flyBehavior.fly();
    }
}