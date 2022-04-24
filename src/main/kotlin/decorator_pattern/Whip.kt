package decorator_pattern

import java.io.DataInputStream

class Whip(private val mBeverage: Beverage):CondimentDecorator() {
    init {
        this.beverage = mBeverage
        description = mBeverage.description +" 모카"
    }

    override fun cost(): Double {
        return mBeverage.cost() + .1
    }

}