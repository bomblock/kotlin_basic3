package kr.bomblock.kotlin_basic3

//todo : 데이터 클래스는 추상, 오픈, 봉인, 내부 클래스 일 수 없다.
//todo : val 이나 var 을 둘중 하나를 써서 매개변수를 정해줘야한다.
//todo : 주생성자 class는 매개변수 하나는 있어야한다.
data class User(val id:Long, val name:String)

fun main(){
    val user1 = User(1, "Denis")

}