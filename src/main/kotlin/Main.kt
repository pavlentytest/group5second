fun main() {
    val test = fun() = println("Hello")
    test()
    val test2 = fun(x: Int, y: Int) = x+y

    val r = bigFun(1)
    println(r(4,5))
}
fun bigFun(k: Int) : (Int, Int) -> Int {
    when(k) {
        1 -> return fun(x: Int, y: Int) = x+y
        2 -> return {x: Int, y: Int -> x+y+x+y}
        else -> return fun(x: Int, y: Int) = 5
    }
}


fun main3(args: Array<String>) {
    val x : () -> Unit = { println("Hello") }
    x()
    val x1 = { println("Hello") }
    val result = { message: String -> println(message)}
    result("Test")
    val result2 : (String) -> Unit = { message: String -> println(message)}

    val sum = { x: Int, y: Int -> println(x+y)}
    sum(4,5)

    val sum2 = {x: Int, y: Int -> val res = x+y; println(res)}

    val sum3 = {x: Int, y: Int ->
        val res = x+y
        println(res)
    }

    val mult : (Int, Int) -> Int = {x: Int, y: Int ->
        val z = x*y
        z
    }
    println(mult(5,6))


   // println(test(4,5))
    // передали функцию в виде лямбда выражения
    doOperation(7,8,{x: Int, y: Int -> x*y*100})
    doOperation(7,8) { x: Int, y: Int -> x * y * 100 }
   // doOperation { i, i2 -> i*i2  }
    doOperation (2,2, mult)
    doOperation(4,5,fun(x: Int, y: Int) = 100*(x+y))

}
fun doOperation(a: Int, b: Int, op: (Int, Int) -> Int) {
    println(op(a,b))
}

fun test(a: Int, b: Int) {

}