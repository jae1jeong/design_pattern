package decorator_pattern


fun main(args:Array<String>){

    var beverage:Beverage = Espresso().let {
        Soy(it)
    }

    formatBeverage(beverage)

    var beverage2:Beverage = HouseBlend()
    formatBeverage(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    formatBeverage(beverage2)



}

fun formatBeverage(beverage: Beverage) = println(beverage.description +" $" +beverage.cost())