package com.javatpoint;

import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

public class ContinueArray {
    public static void main(String[] args) {

    }

    public static int[] continuee(int[] a) {

        int[] naya = new int[a.length * 2];

        for (int i = 0; i < naya.length; i++) {
            if (i < a.length) {
                naya[i] = a[i];
            } else {
                naya[i] = a[i - a.length];
            }
        }
        return naya;
    }
}
