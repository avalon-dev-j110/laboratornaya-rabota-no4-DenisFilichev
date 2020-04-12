/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 *
 * @author denis
 */
public class ComparatorImpl implements Comparator{

    /*Object [] obj;
    public ComparatorImpl(Object obj[]) {
        this.obj = obj;
    }*/
    
    @Override
    public int compare(Object o1, Object o2) {
        return o2.toString().compareTo(o1.toString());
    }
}
