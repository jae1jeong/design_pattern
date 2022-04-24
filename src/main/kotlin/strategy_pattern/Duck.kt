package strategy_pattern

abstract class Duck {
    var quackBehavior: QuackBehavior?=null
    var flyBehavior: FlyBehavior?=null


    fun performQuack(){
        quackBehavior?.quack()
    }

    fun swim(){
        println("모든 오리는 물에 뜬다.")
    }

    fun performFly(){
        flyBehavior?.fly()
    }


    abstract fun display()
}