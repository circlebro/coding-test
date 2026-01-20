package org.test


/*
오늘의 문제: 특정 문자 개수를 구하기
문제: 문자열 my_string과 문자 letter가 매개변수로 주어집니다. my_string 안에 letter가 몇 개 들어있는지 그 개수를 반환하세요.

예시: * "abcdc", "c" -> 결과: 2

"banana", "a" -> 결과: 3
*/
class Day2_LetterCount {
    fun solution(my_string: String, letter: String): Int {
        // 여기에 코드를 작성해 보세요!
        // 힌트 1: letter는 String이지만 실제로는 한 글자입니다.
        // 힌트 2: filter를 쓰면 아주 쉽습니다.
        var i = 0;
        my_string.toCharArray().forEach {
            if (it.toString() == letter) {
                i++
            }
        }
        return i
    }
}

fun main() {
    val sol = Day2_LetterCount()
    println("result 1: " + sol.solution("abcdc", "c")) // 기대값: 2
    println("result 2: " + sol.solution("banana", "a")) // 기대값: 3
}