package decorator_pattern

// 음료 첨가물
abstract class CondimentDecorator:Beverage() {
    var beverage:Beverage?=null

}