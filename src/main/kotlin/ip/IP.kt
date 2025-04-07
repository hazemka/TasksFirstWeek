package ip

fun main() {
    println("The result of the IP check is ${ipv4Checker("192.168.1.1")}")
    println("The result of the IP check is ${ipv4Checker("001..2.3.7.")}")
    println("The result of the IP check is ${ipv4Checker("1..2.3.7.")}")
    println("The result of the IP check is ${ipv4Checker("192.168.1.1.")}")
    println("The result of the IP check is ${ipv4Checker("255.255.255.255")}")
    println("The result of the IP check is ${ipv4Checker("192.168...1.0")}")
}

// fun to check ip
fun ipv4Checker(ip:String):Boolean{
    if (ip.isNotEmpty() && !ip.contains(" ") && !ip.startsWith(".")
        && !ip.endsWith(".")){
        val numbersIP: List<String> = ip.split(".")
        if (numbersIP.size == 4){
            return isValidNumber(numbersIP[0]) && isValidNumber(numbersIP[1])
                    &&isValidNumber(numbersIP[2]) && isValidNumber(numbersIP[3])
        }
    }
    return false
}

// check is the number is from 0-255 and not contains 0
fun isValidNumber(num:String):Boolean{
     if (num.length > 1 && num.startsWith("0")){
        return false
    }else if (num.toIntOrNull() in 0..255){
        return true
    }
    return false
}
