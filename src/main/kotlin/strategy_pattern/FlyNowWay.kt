package strategy_pattern

class FlyNowWay: FlyBehavior {
    override fun fly() {
        println("can't fly")
    }
}