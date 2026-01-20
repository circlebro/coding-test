package org.test

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
// 2. 클래스 정의
class Day1_Distinct {
    fun solution(my_string: String): String {
        // distinct()는 중복을 제거한 문자 리스트를 반환합니다.
        return my_string.toList().distinct().joinToString("")
    }
}

// 3. 실행을 위한 메인 함수 (클래스 밖 상단 레벨에 위치)
fun main() {
    val sol = Day1_Distinct()
    val result = sol.solution("people")
    println("result: $result") // 결과값: peol
}