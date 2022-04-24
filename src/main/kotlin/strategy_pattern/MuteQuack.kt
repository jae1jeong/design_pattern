package strategy_pattern

class MuteQuack: QuackBehavior {
    override fun quack() {
        println("소리를 낼 수 없음")
    }
}