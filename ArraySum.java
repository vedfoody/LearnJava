/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Jeremy
 */
public class ArraySum {

    public static boolean sum(int a[], int n) {

        // Check case a = [0] and n = 0
        if (a.length == 1 && a[0] == n) {
            return true;
        }

        int i = a.length - 1;
        for (; i >= 0; i--) {

            if (n <= 0) {
                return false;
            }

            int temp = n % 10;
            n = n / 10;

            if (temp != a[i]) {
                return false;
            }
        }

        // case n large than array
        return n <= 0;
    }
}
