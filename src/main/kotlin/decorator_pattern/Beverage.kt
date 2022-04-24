package decorator_pattern

abstract class Beverage {
    var description = "제목 없음"

    abstract fun cost():Double
}