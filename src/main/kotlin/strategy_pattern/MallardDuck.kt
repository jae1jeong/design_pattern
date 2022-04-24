package strategy_pattern

class MallardDuck: Duck() {
    init {
    quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("나는 물오리")
    }
}