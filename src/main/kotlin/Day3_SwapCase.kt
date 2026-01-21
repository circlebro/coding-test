package org.test

class Day3_SwapCase {
    fun solution(my_string: String): String {
        // 여기에 본인만의 로직을 작성해 보세요!
        val resultList = my_string.map { word ->
            if (word.isUpperCase()) {
                word.lowercase() // 대문자면 소문자로 변신!
            } else {
                word.uppercase() // 소문자면 대문자로 변신!
            }
        }
        return resultList.joinToString("")
    }
}

fun main() {
    val sol = Day3_SwapCase()
    println("test 1: " + sol.solution("cccCCC"))      // 기대값: CCCccc
    println("test 2: " + sol.solution("abCdEfghIJ")) // 기대값: ABcDeFGHij
}