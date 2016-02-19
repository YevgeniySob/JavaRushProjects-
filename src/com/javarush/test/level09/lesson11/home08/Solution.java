package com.javarush.test.level09.lesson11.home08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
 Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> listOfArrays = new ArrayList<>();
        int[] a = {1,2,3,4,5};
        int[] b = {1,2};
        int[] c = {1,2,3,4};
        int[] d = {1,2,3,4,5,6,7};
        int[] e = {};
        listOfArrays.add(a);
        listOfArrays.add(b);
        listOfArrays.add(c);
        listOfArrays.add(d);
        listOfArrays.add(e);
        return listOfArrays;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
