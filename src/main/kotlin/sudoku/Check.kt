package sudoku

fun main() {

    test(name = "Valid sudoku return true"
    , result = sudokuChecker(listOf(
            listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
            listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
            listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
            listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
            listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
            listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
            listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
            listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
            listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
        ))
    , correctResult = true)


    test(name = "InValid sudoku (5) duplicate in the first row return false"
        , result = sudokuChecker(listOf(
            listOf("5", "3", "4", "6", "5", "8", "9", "1", "2"),
            listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
            listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
            listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
            listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
            listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
            listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
            listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
            listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
        ))
        , correctResult = false)


    test(name = "InValid sudoku (7) duplicate in the seventh column return false"
        , result = sudokuChecker(listOf(
            listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
            listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
            listOf("1", "9", "8", "3", "4", "2", "7", "6", "5"),
            listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
            listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
            listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
            listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
            listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
            listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
        ))
        , correctResult = false)


    test(name = "InValid sudoku (6) duplicate in (3*3) box return false"
        , result = sudokuChecker(listOf(
            listOf("5", "3", "4", "6", "5", "8", "9", "1", "2"),
            listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
            listOf("1", "6", "8", "3", "4", "2", "5", "6", "7"),
            listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
            listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
            listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
            listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
            listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
            listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
        ))
        , correctResult = false)


    test(name = "InValid sudoku (empty board) return false"
        , result = sudokuChecker(listOf(
            listOf("_", "_", "_", "_", "_", "_", "_", "_", "_"),
            listOf("_", "_", "_", "_", "_", "_", "_", "_", "_"),
            listOf("_", "_", "_", "_", "_", "_", "_", "_", "_"),
            listOf("_", "_", "_", "_", "_", "_", "_", "_", "_"),
            listOf("_", "_", "_", "_", "_", "_", "_", "_", "_"),
            listOf("_", "_", "_", "_", "_", "_", "_", "_", "_"),
            listOf("_", "_", "_", "_", "_", "_", "_", "_", "_"),
            listOf("_", "_", "_", "_", "_", "_", "_", "_", "_"),
            listOf("_", "_", "_", "_", "_", "_", "_", "_", "_")
        ))
        , correctResult = false)


    test(name = "InValid sudoku (empty board (blank)) return false"
        , result = sudokuChecker(listOf(
            listOf("", "", "", "", "", "", "", "", ""),
            listOf("", "", "", "", "", "", "", "", ""),
            listOf("", "", "", "", "", "", "", "", ""),
            listOf("", "", "", "", "", "", "", "", ""),
            listOf("", "", "", "", "", "", "", "", ""),
            listOf("", "", "", "", "", "", "", "", ""),
            listOf("", "", "", "", "", "", "", "", ""),
            listOf("", "", "", "", "", "", "", "", ""),
            listOf("", "", "", "", "", "", "", "", "")
        ))
        , correctResult = false)


    test(name = "InValid sudoku (empty row and column) return false"
        , result = sudokuChecker(listOf(
            listOf(),
            listOf(),
            listOf(),
            listOf(),
            listOf(),
            listOf(),
            listOf(),
            listOf(),
            listOf()
        ))
        , correctResult = false)


    test(name = "InValid sudoku (incomplete board) return false"
        , result = sudokuChecker(listOf(
            listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
            listOf("6", "_", "2", "1", "9", "5", "3", "4", "8"),
            listOf("1", "6", "8", "3", "4", "2", "5", "6", "7"),
            listOf("8", "5", "_", "7", "6", "1", "4", "2", "3"),
            listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
            listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
            listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
            listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
            listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
        ))
        , correctResult = false)


    test(name = "InValid sudoku (number must be 1-9 only , 0 not allowed) return false"
        , result = sudokuChecker(listOf(
            listOf("5", "3", "0", "6", "7", "8", "9", "1", "2"),
            listOf("6", "7", "2", "1", "0", "5", "3", "4", "8"),
            listOf("1", "6", "8", "3", "4", "2", "5", "6", "7"),
            listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
            listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
            listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
            listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
            listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
            listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
        ))
        , correctResult = false)


    test(name = "InValid sudoku ( . is not allowed only number  1-9 ) return false"
        , result = sudokuChecker(listOf(
            listOf("5", ".", "4", "6", "7", "8", "9", "1", "2"),
            listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
            listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
            listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
            listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
            listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
            listOf("9", "6", "1", "5", "3", "7", "2", "8", "."),
            listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
            listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
        ))
        , correctResult = false)

    test(name = "InValid sudoku (not enough rows 3 instead of 9) return false"
        , result = sudokuChecker(listOf(
            listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
            listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
            listOf("1", "6", "8", "3", "4", "2", "5", "6", "7")
        ))
        , correctResult = false)


    test(name = "InValid sudoku (rows of wrong length) return false"
        , result = sudokuChecker(listOf(
            listOf("5", "3", "4", "6", "7", "8", "9"),
            listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
            listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
            listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
            listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
            listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
            listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
            listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
            listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
        ))
        , correctResult = false)


    test(name = "InValid sudoku (columns of wrong length) return false"
        , result = sudokuChecker(listOf(
            listOf( "3", "4", "6", "7", "8", "9", "1", "2"),
            listOf( "7", "2", "1", "9", "5", "3", "4", "8"),
            listOf( "9", "8", "3", "4", "2", "5", "6", "7"),
            listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
            listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
            listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
            listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
            listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
            listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
        ))
        , correctResult = false)
}

// fun to test case with result of case and correct result and return (true/false)
fun test(name:String,result:Boolean,correctResult:Boolean){
    if (result == correctResult)
        println("Success - $name")
    else
        println("Failed - $name")
}