fun main(){
 var mwili=Human("cate",80,80f)
mwili.eat(30)
    mwili.speak("I am fluent in french")
    mwili.birthday(70)
    var person=User("joy","wamui",0,"cow","wamui@")
    println(person.phone)
    println(person.password) }
class Human( var name:String,var age: Int,var weight:Float){
fun eat(foodWeight:Int){
    println("i am eating $foodWeight kg food")
    var mass=foodWeight+weight
    println(mass) }
fun speak(speech:String){
    println(speech) }
fun birthday(age:Int) {
    println(age) } }
data class User(val firstName:String, val lastName: String,val phone:Int,var password:String ,var email:String)

