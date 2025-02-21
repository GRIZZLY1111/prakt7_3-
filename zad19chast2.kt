fun main()
{
    try {
        println("Введите через Enter координаты M1")
        var x1 = readln().toDouble()
        var y1 = readln().toDouble()
        println("Введите через Enter координаты M2")
        var x2 = readln().toDouble()
        var y2 = readln().toDouble()
        println("Введите через Enter координаты N1")
        var x3 = readln().toDouble()
        var y3 = readln().toDouble()
        println("Введите через Enter координаты N2")
        var x4 = readln().toDouble()
        var y4 = readln().toDouble()
        var a = maxOf(x1, x3)
        var b = maxOf(y1, y3)
        var c = minOf(x2, x4)
        var d = minOf(y2, y4)
        when
        {
            (a<c&&b<d)->
            {
                var peresech = ((c-a)*(d-b))
                println("Площадь пересечения = "+peresech)
            }
            else->
            {
                println("Площадь пересечения = 0")
            }
        }
    }
    catch (e:NumberFormatException)
    {
        println("Неверный ввод")
    }
}