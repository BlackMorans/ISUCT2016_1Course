package Algorithms;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import static Algorithms.Example.exch;
import static Algorithms.Example.less;


/**
 * Created by maxim-mac on 25/04/2017.
 */
public class Incertion {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 1; i < N; i++){
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
            exch(a, j, j-1);

        }
    }


    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1]))
                return false;
        return true;
    }

    public static void main(String[] args){
        String[] a = In.readStrings();
        sort(a);
        assert  isSorted(a);
        show(a);
    }


    private static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }
}
