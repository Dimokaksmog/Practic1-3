fun main(args: Array<String>) {
    println("Введите число которое хотите видеть в 2-ой системе: ");
    val n: Int = readLine()!!.toInt();
    val dvoinaya:String = Integer.toBinaryString(n);
    println("Ваше число в 2 системе: ");
    print(dvoinaya);
}