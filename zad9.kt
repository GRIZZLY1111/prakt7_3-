fun main()
{
    try
    {
        println("Введите через Enter стороны треугольника")
        var a = readln().toDouble()
        var b = readln().toDouble()
        val P = (a*2 + b *2)
        val S = (a*b)
        val c = Math.sqrt((a*a+b*b))
        println("Периметр прямоугольника = "+P+" а её площадь = "+S+" а её диагональ = "+c)
    }
    catch (e:NumberFormatException)
    {
        println("Неверный ввод")
    }
}