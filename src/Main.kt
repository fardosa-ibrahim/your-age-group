fun main(Args:Array<String>){
    var age = readln()!!.toInt()
    when{
        age < 0 -> println("Invelid age")
        age<=11 -> println("child")
        age<=21 -> println("teeneger")
        age<=35 -> println("grown-ups")
        age<=50 -> println("grandpaaaa")
    }
}
