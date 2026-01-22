package org.test

class Day4_Cipher {
    fun solution(cipher: String, code: Int): String {
        return cipher.filterIndexed { index, c ->
            // 여기에 조건을 채워보세요!
            (index+1) % code == 0
        }
    }

}
fun main() {
    val sol = Day4_Cipher()
    println("test 1: " + sol.solution("pipaqwetruntfasabescdogk", 4)) // attack
}