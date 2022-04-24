package decorator_pattern

class Soy(private val mBeverage: Beverage):CondimentDecorator() {
    init {
        this.beverage = mBeverage
        description = mBeverage.description +" 두유"
    }

    override fun cost(): Double {
        return (beverage?.cost() ?: .0) + .15
    }
}