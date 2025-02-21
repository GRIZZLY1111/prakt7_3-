fun main()
{
    try
    {
        println("Введите целые числа k, l, n, m через Enter")
        var k = readln().toInt()
        var l = readln().toInt()
        var n = readln().toInt()
        var m = readln().toInt()
        when
        {
            ((l%k)==0)->
            {
                when
                {
                    ((n%k)==0)->
                    {
                        when
                        {
                            ((m%k)==0)->
                            {
                                println("Да k являетстя делителем всех чисел")
                            }
                            else->
                            {
                                println("Нет k не являетстя делителем всех чисел")
                            }
                        }
                    }
                    else->
                    {
                        println("Нет k не являетстя делителем всех чисел")
                    }
                }
            }
            else->
            {
                println("Нет k не являетстя делителем всех чисел")
            }
        }
    }
    catch (e:NumberFormatException)
    {
        println("Неверный ввод")
    }
}