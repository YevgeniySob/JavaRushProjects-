package com.javarush.test.level10.lesson11.home01;

/* Правильный ответ: d=2.941
Добавить одну операцию по преобразованию типа, чтобы получался ответ: d=2.941.
Пример вывода: 2.9411764705882355
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 50;
        int b = 17;
        double d = (double)a / (double)b;
        System.out.println(d);
    }
}
