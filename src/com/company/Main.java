package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main ( String[] args ) {
        Scanner inp = new Scanner( System.in );
        System.out.println( "please enter a value" );
        String value = inp.nextLine( ).toUpperCase( );
        result(value);
    }

    private static void result (String value){
        //string to character array
        char[] result = value.toCharArray( );
        Set<Character> evenNumb = new HashSet<>( );
        Set<Character> notEvenNumb = new HashSet<>( );

        for (int i = 0; i < result.length; i++) {
            int x = result[i];
            if (x % 2 == 0) {
                evenNumb.add( result[i] );
            } else {
                notEvenNumb.add( result[i] );
            }
        }

        System.out.println( evenNumb.toString( ) );
        System.out.println( notEvenNumb.toString( ) );

        int x = 0;
        int y = 0;

        for (int i : evenNumb
        ) {
            x = x + i;
        }

        for (int i : notEvenNumb
        ) {
            y = y + i;
        }

        System.out.println( x );
        System.out.println( y );

        char f = (char) Math.abs( x - y );
        System.out.println( Math.abs( x - y ) );
        System.out.println( f );
    }
}
