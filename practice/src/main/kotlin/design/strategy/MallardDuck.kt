package design.strategy

class MallardDuck : Duck() {
    init {
        flyBehavior = FlyWithWings()
    }
}