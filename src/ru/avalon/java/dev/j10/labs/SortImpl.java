/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author denis
 */
public class SortImpl implements Sort{
    //Person[] sortArray;
    //String[] sortString;

    @Override
    public void sort(Object[] array) {
        Arrays.sort(array);
        for (Object obj : array) {System.out.println(obj);}
    }

    @Override
    public void sort(Comparable[] array) {
        Person temp = new PersonImpl();
        for (int i=0;i<array.length; i++){
            for (int j=1; j<array.length-i; j++){
                if ((array[j]).compareTo(array[j-1])<0){
                    temp = (Person)array[j];
                    array[j]=array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        Object temp = new Object();
        for (int i=0;i<array.length; i++){
            for (int j=1; j<array.length-i; j++){
                if (comparator.compare(array[j], array[j-1])<0){
                    temp = (String)array[j];
                    array[j]=array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}
