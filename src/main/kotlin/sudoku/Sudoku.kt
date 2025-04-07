package sudoku

fun main() {

    println("The result of the Sudoku check is ${sudokuChecker(listOf(
        listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
        listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
        listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
        listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
        listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
        listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
        listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
        listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
        listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
    ))}")
    println("The result of the Sudoku check is ${sudokuChecker(listOf(
        listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
        listOf("6", "_", "2", "1", "9", "5", "3", "4", "8"),
        listOf("1", "6", "8", "3", "4", "2", "5", "6", "7"),
        listOf("8", "5", "_", "7", "6", "1", "4", "2", "3"),
        listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
        listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
        listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
        listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
        listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
    ))}")

}

fun sudokuChecker(sudokuList:List<List<String>>):Boolean{
    var finalResult = false
    if (sudokuList.isNotEmpty() && sudokuList.size == 9){
        sudokuList.forEachIndexed { index, innerList ->
            if (innerList.isNotEmpty() && innerList.size == 9){
                innerList.forEach { num ->
                    if (num.isNotEmpty() && num != "_" && num != "." && ! num.contains(" ")
                        && innerList.count { it == num } == 1 &&
                        ! hasDuplicateInColumn(sudokuList,index) && num.toInt() in 1..9 ){
                        finalResult = true
                    }else{
                        finalResult = false
                        return finalResult
                    }
                }
            }else
                return finalResult
        }
    }
    return finalResult
}


fun hasDuplicateInColumn(sudokuList: List<List<String>>,indexOfColumn:Int):Boolean{
    val checkList = mutableListOf<String>()
    for (row in 0 until 9){
        val number = sudokuList[row][indexOfColumn]
        if (number != "." && number != " "){
            if (number in checkList){
                return true    // duplicate found
            }
            checkList.add(number)
        }
    }
    return false
}