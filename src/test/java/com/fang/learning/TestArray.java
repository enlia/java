package com.fang.learning;

/*
    array

*/
public class TestArray {
    public static void main(String[] args){
        //new int[3]
        //new String[2]
        String[] a = new String[2];
        a[0]="hello";
        a[1]="world";
        System.out.println(a[0]+a[1]);
        //
        String[] b=new String[]{"aaaa","bbbbbbbbb"};
        System.out.println(b);
        System.out.println(b[0]+b[1]);
        System.out.println(b.length);
    }
}
