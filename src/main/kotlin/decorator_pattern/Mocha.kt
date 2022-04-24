package decorator_pattern

//첨가물
class Mocha(private val mBeverage: Beverage) :CondimentDecorator(){

    init {
        beverage = mBeverage
        description = mBeverage.description +" 모카"
    }

    override fun cost(): Double {
        return mBeverage.cost() + .20
    }
}