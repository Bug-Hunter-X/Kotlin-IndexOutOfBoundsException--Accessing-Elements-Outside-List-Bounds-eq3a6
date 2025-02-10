fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    //Safe way to access elements
    val index = 10
    val firstElement = if (index in doubledList.indices) doubledList[index] else null
    println(firstElement)

    //Alternative using getOrNull
    val elementOrNull = doubledList.getOrNull(10)
    println(elementOrNull)
    
    //Another alternative using let
    doubledList.getOrNull(10)?.let { element -> println(element) }
} 