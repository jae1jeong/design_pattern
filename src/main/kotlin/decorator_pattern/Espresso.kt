package decorator_pattern

class Espresso:Beverage() {
    init {
        description = "에스프레소"
    }
    override fun cost(): Double {
        return 1.99
    }
}