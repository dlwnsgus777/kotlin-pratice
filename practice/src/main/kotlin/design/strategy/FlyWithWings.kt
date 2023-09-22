package design.strategy

class FlyWithWings: FlyBehavior{
    override fun fly() {
        println("오리가 날다");
    }
}