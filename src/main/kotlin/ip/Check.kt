package ip

fun main() {

    test(name = "Valid IP return true",
        result = ipv4Checker("192.168.1.1"),
        correctResult = true)

    test(name = "Invalid IP (3 segments instead of 4 return false)" ,
        result = ipv4Checker("192.168.1"),
        correctResult = false)

    test(name = "Invalid IP (5 segments instead of 4 return false)" ,
        result = ipv4Checker("192.168.1.1.22"),
        correctResult = false)

    test(name = "Invalid IP (letters not allowed only 0-255 return false)" ,
        result = ipv4Checker("192.168.1.b"),
        correctResult = false)

    test(name = "Invalid IP (4 dots instead of 3 dots only return false)",
        result = ipv4Checker("192.168.1.1."),
        correctResult = false)

    test(name = "Invalid IP (256 out of rang 0-255 return false)",
        result = ipv4Checker("256.168.2.1"),
        correctResult = false)

    test(name = "Invalid IP (Leading zeroes in any segment are not allowed return false)",
        result = ipv4Checker("0192.168.2.1"),
        correctResult = false)

    test(name = "Valid IP (Leading zeroes in any segment are not allowed except for the '0' itself return true)",
        result = ipv4Checker("0.168.1.1"),
        correctResult = true)

    test(name = "Invalid IP (empty string return false)",
        result = ipv4Checker(""),
        correctResult = false)

    test(name = "Invalid IP (dots only without numbers return false)",
        result = ipv4Checker("..."),
        correctResult = false)

    test(name = "Invalid IP (spaces not allowed return false)",
        result = ipv4Checker(" 192.168.1.1  "),
        correctResult = false)

}

fun test(name:String , result:Boolean, correctResult:Boolean){
    if (result == correctResult)
        println("Success - $name")
    else
        println("Failed - $name")
}

