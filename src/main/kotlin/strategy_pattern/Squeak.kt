package strategy_pattern

class Squeak: QuackBehavior {
    override fun quack() {
        println("삑삑")
    }
}