fun main()
{
    try
    {
        println("Введите объём железа")
        val V = readln().toDouble()
        val p = 7.9
        val M =56.0
        val Na = (6.02*Math.pow(10.0,23.0))
        val m = (p*V)
        val N = (m*Na/M)
        println("В данном объёме железа содержится "+N+" атомов")
    }
    catch (e:NumberFormatException)
    {
        println("Неверный ввод")
    }
}