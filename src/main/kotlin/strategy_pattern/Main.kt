import strategy_pattern.Duck
import strategy_pattern.FlyNowWay
import strategy_pattern.MallardDuck

fun main(args:Array<String>){

    println("hello")
    val mallard: Duck = MallardDuck()

    mallard.performQuack()
    mallard.performFly()
    mallard.flyBehavior = FlyNowWay()
    mallard.performFly()
}

