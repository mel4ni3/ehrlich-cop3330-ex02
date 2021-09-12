/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String str = s.next();
        System.out.print(str + " has " + str.length() + " characters.");
    }

}